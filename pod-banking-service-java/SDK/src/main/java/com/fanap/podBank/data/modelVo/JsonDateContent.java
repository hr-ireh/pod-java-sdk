package com.fanap.podBank.data.modelVo;

public class JsonDateContent {

    private String Platfrom;
    private String DeviceId;
    private String UserAgent;
    private String imei;
    private String IP;
    private String OS;

    public String getPlatfrom() {
        return Platfrom;
    }

    public JsonDateContent setPlatfrom(String platfrom) {
        Platfrom = platfrom;
        return this;
    }

    public String getDeviceId() {
        return DeviceId;
    }

    public JsonDateContent setDeviceId(String deviceId) {
        DeviceId = deviceId;
        return this;
    }

    public String getUserAgent() {
        return UserAgent;
    }

    public JsonDateContent setUserAgent(String userAgent) {
        UserAgent = userAgent;
        return this;
    }

    public String getImei() {
        return imei;
    }

    public JsonDateContent setImei(String imei) {
        this.imei = imei;
        return this;
    }

    public String getIP() {
        return IP;
    }

    public JsonDateContent setIP(String IP) {
        this.IP = IP;
        return this;
    }

    public String getOS() {
        return OS;
    }

    public JsonDateContent setOS(String OS) {
        this.OS = OS;
        return this;
    }
}


