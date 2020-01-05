package com.fanap.podBank.util;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.xml.bind.DatatypeConverter;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.*;
import java.io.IOException;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.*;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPrivateKeySpec;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static javax.xml.bind.DatatypeConverter.parseBase64Binary;
import static javax.xml.bind.DatatypeConverter.printBase64Binary;

/**
 * @author i.vejdani
 */
public class UserServices {

    private String soapAction;
    private String signature;
    private String request;
    private String soapEndpointUrl;
    private PrivateKey privateKey;
    private String myNamespace;
    private String URI;
    private String soapResponse;

    public String getMyNamespaceURI() {
        return "GetDepositNumberByCardNumber";
    }

    public String getSoapEndpointUrl() {
        return soapEndpointUrl;
    }

    public String getSoapResponse() {
        return soapResponse;
    }

    public String getMyNamespace() {
        return myNamespace;
    }

    public void setSoapResponse(String soapResponse) {
        this.soapResponse = soapResponse;
    }

    public void setSoapAction(String soapAction) {
        this.soapAction = soapAction;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public void setSoapEndpointUrl(String soapEndpointUrl) {
        this.soapEndpointUrl = soapEndpointUrl;
    }

    public void setPrivateKey(PrivateKey privateKey) {
        this.privateKey = privateKey;
    }

    public void setMyNamespace(String myNamespace) {
        this.myNamespace = myNamespace;
    }

    public void setURI(String URI) {
        this.URI = URI;
    }

    public Map<String, String> extractElementsFromPrivateKeyXML(String xml) throws ParserConfigurationException, SAXException, IOException {
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

    public PrivateKey XML2PrivateKey(String xml) throws Exception {

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

    public PrivateKey xml2Prv(String Modulus, String Exponent, String P, String Q, String DP, String DQ, String InverseQ, String D) throws Exception {

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

    public String hexString(byte[] b) {
        StringBuilder d = new StringBuilder(b.length * 2);
        for (int i = 0; i < b.length; i++) {
            char hi = Character.forDigit((b[i] >> 4) & 0x0F, 16);
            char lo = Character.forDigit(b[i] & 0x0F, 16);
            d.append(Character.toUpperCase(hi));
            d.append(Character.toUpperCase(lo));
        }
        return d.toString();
    }

    public byte[] hex2byte(String str) {
        byte[] bytes = new byte[str.length() / 2];
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte) Integer
                    .parseInt(str.substring(2 * i, 2 * i + 2), 16);
        }
        return bytes;
    }

    public void generateSignature() throws UnsupportedEncodingException, InvalidKeyException, NoSuchAlgorithmException {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss:S");
        String formattedDate = sdf.format(date);
        this.request = this.request.replace("[Timestamp]", formattedDate);
        byte[] strstr = this.request.getBytes("UTF-8");
        byte[] signatureByte = sign(this.privateKey, strstr);
        signature = printBase64Binary(signatureByte);
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

    public void invokeService() throws NoSuchAlgorithmException {
        TrustManager[] trustAllCerts = new TrustManager[]{
                new X509TrustManager() {
                    @Override
                    public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                        return null;
                    }

                    @Override
                    public void checkClientTrusted(
                            java.security.cert.X509Certificate[] certs, String authType) {
                    }

                    @Override
                    public void checkServerTrusted(
                            java.security.cert.X509Certificate[] certs, String authType) {
                    }
                }
        };

// Install the all-trusting trust manager
        try {
            SSLContext sc = SSLContext.getInstance("SSL");
            sc.init(null, trustAllCerts, new java.security.SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
        } catch (KeyManagementException ex) {
            System.out.println(ex.getMessage());
        }

// Now you can access an https URL without having the certificate in the truststore
        this.callSoapWebService();
    }

    public void callSoapWebService() {
        try {
            // Create SOAP Connection
            SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
            SOAPConnection soapConnection = soapConnectionFactory.createConnection();

            // Send SOAP Message to SOAP Server
            SOAPMessage soapRequest = this.createSOAPRequest();
            SOAPMessage soapCallResult = soapConnection.call(soapRequest, getSoapEndpointUrl());

            // Print the SOAP Response
            System.out.println("Response SOAP Message:");
            soapRequest.writeTo(System.out);
            System.out.println("\n");
            SOAPBody body = soapCallResult.getSOAPBody();
            this.soapResponse = body.getElementsByTagName(this.getMyNamespace() + "Result").item(0).getTextContent();

            soapConnection.close();
        } catch (Exception e) {
            System.err.println("\nError occurred while sending SOAP Request to Server!\nMake sure you have the correct endpoint URL and SOAPAction!\n");
            e.printStackTrace();
        }
    }

    private SOAPMessage createSOAPRequest() throws Exception {
        MessageFactory messageFactory = MessageFactory.newInstance();
        SOAPMessage soapMessage = messageFactory.createMessage();

        createSoapEnvelope(soapMessage);

        MimeHeaders headers = soapMessage.getMimeHeaders();
        headers.addHeader("SOAPAction", soapAction);
        headers.addHeader("Content-Type", "text/xml; charset=utf-8");
        soapMessage.saveChanges();

        /* Print the request message, just for debugging purposes */
        System.out.println("Request SOAP Message:");
        soapMessage.writeTo(System.out);
        System.out.println("\n");
        return soapMessage;
    }

    private void createSoapEnvelope(SOAPMessage soapMessage) throws SOAPException {
        SOAPPart soapPart = soapMessage.getSOAPPart();

        // SOAP Envelope
        SOAPEnvelope envelope = soapPart.getEnvelope();
        envelope.addNamespaceDeclaration(myNamespace, getMyNamespaceURI());

        // SOAP Body
        SOAPBody soapBody = envelope.getBody();
        SOAPElement soapBodyElement;
        soapBodyElement = soapBody.addChildElement(myNamespace, "", URI);

        SOAPElement requestElement = soapBodyElement.addChildElement("request");
        SOAPElement signatureElement = soapBodyElement.addChildElement("signature");

        requestElement.addTextNode(request);
        signatureElement.addTextNode(signature);

    }


}