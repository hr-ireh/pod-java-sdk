package com.fanap.podAIPlatform.util;


import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.crypto.Cipher;
import javax.crypto.EncryptedPrivateKeyInfo;
import javax.crypto.SecretKeyFactory;
import javax.xml.bind.DatatypeConverter;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.StringReader;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.*;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPrivateKeySpec;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static javax.xml.bind.DatatypeConverter.parseBase64Binary;

public class RSAUtil {
    public static final String SPEC_MODULUS = "Modulus";
    public static final String SPEC_EXPONENT = "Exponent";
    public static final String SPEC_P = "P";
    public static final String SPEC_Q = "Q";
    public static final String SPEC_DP = "DP";
    public static final String SPEC_DQ = "DQ";
    public static final String SPEC_INVERSEQ = "InverseQ";
    public static final String SPEC_D = "D";

//    public static PublicKey getPublicKeyFromXML(String xmlKey) {
//        PublicKey pubKey = null;
//        try {
//            Map<String, String> specMap = convertXMLToSpecMap(xmlKey);
//
//            RSAPublicKeySpec keySpec = new RSAPublicKeySpec(
//                    new BigInteger(Base64.decode(specMap.get(SPEC_MODULUS), Base64.DEFAULT)),
//                    new BigInteger(Base64.decode(specMap.get(SPEC_EXPONENT), Base64.DEFAULT)));
//            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
//            pubKey = keyFactory.generatePublic(keySpec);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return pubKey;
//    }
//


    private static byte[] pemFileToBytes(String filename) throws IOException {
        // read in PEM file, throw away the begin and end lines
        List<String> pemLines = Files.readAllLines(Paths.get(filename), StandardCharsets.US_ASCII);
        pemLines.remove(0);
        pemLines.remove(pemLines.size() - 1);
        String pem = String.join("", pemLines);

        // base64 decode and return the result.

        return Base64.getDecoder().decode(pem);
    }

    private static PrivateKey parsePrivateKey(String filename) throws Exception {
//        PBEKeySpec passKeySpec = new PBEKeySpec(password); //my password

        EncryptedPrivateKeyInfo encryptedKey = new EncryptedPrivateKeyInfo(pemFileToBytes(filename));
        SecretKeyFactory keyFac = SecretKeyFactory.getInstance(encryptedKey.getAlgName());
//        SecretKey passKey = keyFac.generateSecret(passKeySpec);

        // Create PBE Cipher
        Cipher pbeCipher = Cipher.getInstance(encryptedKey.getAlgName());
        // Initialize PBE Cipher with key and parameters
        pbeCipher.init(Cipher.DECRYPT_MODE, (Key) encryptedKey.getAlgParameters());

        // Decrypt the private key

        byte[] encodedPrivateKey = pbeCipher.doFinal(encryptedKey.getEncryptedData());
        PKCS8EncodedKeySpec privateKeySpec = new PKCS8EncodedKeySpec(encodedPrivateKey);
        KeyFactory kf = KeyFactory.getInstance("RSA");
        return kf.generatePrivate(privateKeySpec);

    }

    public static PrivateKey getPivateKeyFromXML(String xmlKey) {
        PrivateKey key = null;
        try {
            Map<String, String> specMap = convertXMLToSpecMap(xmlKey);

            /*RSAPrivateKeySpec spec = new RSAPrivateKeySpec(
                    new BigInteger(1, Base64.decodeBase64(specMap.get(SPEC_MODULUS))),
                    new BigInteger(1, Base64.decodeBase64(specMap.get(SPEC_D))));
            key = KeyFactory.getInstance("RSA").generatePrivate(spec);*/

            RSAPrivateCrtKeySpec keySpec = new RSAPrivateCrtKeySpec(
                    new BigInteger(Base64.getDecoder().decode(specMap.get(SPEC_MODULUS))),
                    new BigInteger(Base64.getDecoder().decode(specMap.get(SPEC_EXPONENT))),
                    new BigInteger(Base64.getDecoder().decode(specMap.get(SPEC_D))),
                    new BigInteger(Base64.getDecoder().decode(specMap.get(SPEC_P))),
                    new BigInteger(Base64.getDecoder().decode(specMap.get(SPEC_Q))),
                    new BigInteger(Base64.getDecoder().decode(specMap.get(SPEC_DP))),
                    new BigInteger(Base64.getDecoder().decode(specMap.get(SPEC_DQ))),
                    new BigInteger(Base64.getDecoder().decode(specMap.get(SPEC_INVERSEQ))));

            key = KeyFactory.getInstance("RSA").generatePrivate(keySpec);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return key;
    }

    //
    public static Map<String, String> convertXMLToSpecMap(String xmlKey) {
        Map<String, String> specMap = new HashMap<>();
        Document xmldoc = null;
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            xmldoc = builder.parse(new InputSource(new StringReader(xmlKey)));
        } catch (SAXException | IOException | ParserConfigurationException e) {
            e.printStackTrace();
        }
        if (xmldoc != null) {
            Node root = xmldoc.getFirstChild();
            NodeList children = root.getChildNodes();
            for (int i = 0; i < children.getLength(); i++) {
                Node node = children.item(i);
                String textValue = node.getTextContent();
                specMap.put(node.getNodeName(), textValue);
            }
        }
        return specMap;
    }

    public static String signSHA256RSA(String data, PrivateKey prv) throws Exception {
        Signature sig = Signature.getInstance("SHA256withRSA");
        sig.initSign(prv);
        sig.update(data.getBytes("UTF8"));
        return Base64.getEncoder().encodeToString(sig.sign());
    }

    public static String signSHA256RSA(String data, String privateKey) throws Exception {
        PrivateKey prv = getPivateKeyFromXML(privateKey);

        Signature sig = Signature.getInstance("SHA256withRSA");
        sig.initSign(prv);
        sig.update(data.getBytes("UTF8"));
        String sing = Base64.getEncoder().encodeToString(sig.sign());
        return sing;
    }


    public static byte[] sign(PrivateKey privKey, byte[] message) throws InvalidKeyException, NoSuchAlgorithmException {
        try {
            Signature signature = Signature.getInstance("SHA1withRSA");
            signature.initSign(privKey);
            signature.update(message);
            return signature.sign();
        } catch (SignatureException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    public static PrivateKey XML2PrivateKey(String xml) throws Exception {

        Map<String, String> extractedXMLelements = extractElementsFromPrivateKeyXML(xml);

        String Modulus = hexString(DatatypeConverter.parseBase64Binary(extractedXMLelements.get("Modulus")));
        String Exponent = hexString(parseBase64Binary("AQAB"));
        String P = hexString(parseBase64Binary(extractedXMLelements.get("P")));
        String Q = hexString(parseBase64Binary(extractedXMLelements.get("Q")));
        String DP = hexString(parseBase64Binary(extractedXMLelements.get("DP")));
        String DQ = hexString(parseBase64Binary(extractedXMLelements.get("DQ")));
        String InverseQ = hexString(parseBase64Binary(extractedXMLelements.get("InverseQ")));
        String D = hexString(parseBase64Binary(extractedXMLelements.get("D")));
        PrivateKey privateKey = xml2Prv(Modulus, Exponent, P, Q, DP, DQ, InverseQ, D);
        return privateKey;
    }

    public static PrivateKey xml2Prv(String Modulus, String Exponent, String P, String Q, String DP, String DQ, String InverseQ, String D) throws Exception {

        byte[] modBytes = hex2byte(Modulus);
        byte[] ExponentBytes = hex2byte(Exponent);
        byte[] PBytes = hex2byte(P);
        byte[] QBytes = hex2byte(Q);
        byte[] DPBytes = hex2byte(DP);
        byte[] DQBytes = hex2byte(DQ);
        byte[] InverseQBytes = hex2byte(InverseQ);
        byte[] DBytes = hex2byte(D);

        BigInteger iModulus = new BigInteger(1, modBytes);
        BigInteger iExponentBytes = new BigInteger(1, ExponentBytes);
        BigInteger iPBytes = new BigInteger(1, PBytes);
        BigInteger iQBytes = new BigInteger(1, QBytes);
        BigInteger iDPBytes = new BigInteger(1, DPBytes);
        BigInteger iInverseQBytes = new BigInteger(1, InverseQBytes);
        BigInteger iDQBytes = new BigInteger(1, DQBytes);
        BigInteger iDBytes = new BigInteger(1, DBytes);

        KeyFactory factory = KeyFactory.getInstance("RSA");
        RSAPrivateKeySpec privSpec = new RSAPrivateCrtKeySpec(iModulus, iExponentBytes, iDBytes, iPBytes, iQBytes, iDPBytes, iDQBytes, iInverseQBytes);
        PrivateKey prvKey = factory.generatePrivate(privSpec);
        return prvKey;
    }

    public static String hexString(byte[] b) {
        StringBuilder d = new StringBuilder(b.length * 2);
        for (int i = 0; i < b.length; i++) {
            char hi = Character.forDigit((b[i] >> 4) & 0x0F, 16);
            char lo = Character.forDigit(b[i] & 0x0F, 16);
            d.append(Character.toUpperCase(hi));
            d.append(Character.toUpperCase(lo));
        }
        return d.toString();
    }

    public static byte[] hex2byte(String str) {
        byte[] bytes = new byte[str.length() / 2];
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte) Integer
                    .parseInt(str.substring(2 * i, 2 * i + 2), 16);
        }
        return bytes;
    }

    public static Map<String, String> extractElementsFromPrivateKeyXML(String xml) throws ParserConfigurationException, SAXException, IOException {
        Map<String, String> nodes = new HashMap<String, String>();
        DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        InputSource src = new InputSource();
        src.setCharacterStream(new StringReader(xml));
        org.w3c.dom.Document doc = builder.parse(src);

        nodes.put("Modulus", doc.getElementsByTagName("Modulus").item(0).getTextContent());
        nodes.put("Exponent", doc.getElementsByTagName("Exponent").item(0).getTextContent());
        nodes.put("P", doc.getElementsByTagName("P").item(0).getTextContent());
        nodes.put("Q", doc.getElementsByTagName("Q").item(0).getTextContent());
        nodes.put("DP", doc.getElementsByTagName("DP").item(0).getTextContent());
        nodes.put("InverseQ", doc.getElementsByTagName("InverseQ").item(0).getTextContent());
        nodes.put("D", doc.getElementsByTagName("D").item(0).getTextContent());
        nodes.put("DQ", doc.getElementsByTagName("DQ").item(0).getTextContent());

        return nodes;
    }


}
