package com.fanap.SsoService.data.modelSrv;

/**
 * Created by Shahab Askarian on 6/19/2019.
 */
public class HandshakeSrv {
    private String keyId;
    private int expire_in;
    private String algorithm;
    private OAuthClientSrv client;
    private DeviceInfoSrv device;
    private FanapMiniUserSrv user;
    private String privateKey;
    private String publicKey;
    private String secretKey;
    private String keyFormat;

    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public int getExpire_in() {
        return expire_in;
    }

    public void setExpire_in(int expire_in) {
        this.expire_in = expire_in;
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public OAuthClientSrv getClient() {
        return client;
    }

    public void setClient(OAuthClientSrv client) {
        this.client = client;
    }

    public DeviceInfoSrv getDevice() {
        return device;
    }

    public void setDevice(DeviceInfoSrv device) {
        this.device = device;
    }

    public FanapMiniUserSrv getUser() {
        return user;
    }

    public void setUser(FanapMiniUserSrv user) {
        this.user = user;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getKeyFormat() {
        return keyFormat;
    }

    public void setKeyFormat(String keyFormat) {
        this.keyFormat = keyFormat;
    }
}
