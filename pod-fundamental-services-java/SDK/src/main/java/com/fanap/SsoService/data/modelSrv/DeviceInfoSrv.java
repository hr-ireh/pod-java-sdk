package com.fanap.SsoService.data.modelSrv;

/**
 * Created by Shahab Askarian on 6/19/2019.
 */
public class DeviceInfoSrv {
    private int id;
    private String uid;
    private String agent;
    private String ip;
    private String language;
    private String os;
    private String osVersion;
    private String browser;
    private String browserVersion;
    private String deviceType;
    private boolean current;
    private long lastAccessTime;
    private String name;
    private LocationSrv location;
    private String appVersion;
    private String appName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public String getBrowserVersion() {
        return browserVersion;
    }

    public void setBrowserVersion(String browserVersion) {
        this.browserVersion = browserVersion;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public boolean isCurrent() {
        return current;
    }

    public void setCurrent(boolean current) {
        this.current = current;
    }

    public long getLastAccessTime() {
        return lastAccessTime;
    }

    public void setLastAccessTime(int lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocationSrv getLocation() {
        return location;
    }

    public void setLocation(LocationSrv location) {
        this.location = location;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }
}
