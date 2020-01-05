package com.fanap.podBank.data.modelVo;

import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Base64;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;


public class SignatureInfo {

    private String privateKey;



    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }


    public String getPrivateKey() {
        return privateKey;
    }
}
