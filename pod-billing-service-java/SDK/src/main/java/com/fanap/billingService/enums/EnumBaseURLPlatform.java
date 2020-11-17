package com.fanap.billingService.enums;

/**
 * Created By Askarian on 5/28/2019
 */
public enum EnumBaseURLPlatform {
    SANDBOX("https://api.pod.ir/srv/sc/"),
    PRODUCTION("http://sandbox.pod.ir/srv/sc/");

    private final String value;

    EnumBaseURLPlatform(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}