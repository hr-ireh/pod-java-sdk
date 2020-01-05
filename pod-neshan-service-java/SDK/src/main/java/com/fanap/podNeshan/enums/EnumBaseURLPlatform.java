package com.fanap.podNeshan.enums;

/**
 * Created By Askarian on 5/28/2019
 */
public enum EnumBaseURLPlatform {

//    SANDBOX("http://sandbox.pod.ir"),
    PRODUCTION("https://api.pod.ir");

    private final String value;

    EnumBaseURLPlatform(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

}

