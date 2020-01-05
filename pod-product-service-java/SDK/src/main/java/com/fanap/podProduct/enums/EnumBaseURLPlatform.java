package com.fanap.podProduct.enums;

/**
 * Created By Askarian on 5/28/2019
 */
public enum EnumBaseURLPlatform {

//    SANDBOX("http://sandbox.pod.land"),
    PRODUCTION("https://api.pod.land");

    private final String value;

    EnumBaseURLPlatform(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

}

