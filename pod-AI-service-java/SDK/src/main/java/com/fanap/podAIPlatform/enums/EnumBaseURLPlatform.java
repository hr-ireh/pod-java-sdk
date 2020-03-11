package com.fanap.podAIPlatform.enums;

/**
 * Created by Z.gholinia on 01/05/2020.
 */
public enum EnumBaseURLPlatform {

//    SANDBOX("http://sandbox.pod.ir/srv/basic-platform/"),
    PRODUCTION("https://api.pod.ir/srv/core/");

    private final String value;

    EnumBaseURLPlatform(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

}

