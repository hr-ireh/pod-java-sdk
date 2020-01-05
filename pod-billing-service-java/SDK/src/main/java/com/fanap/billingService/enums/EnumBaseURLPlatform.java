package com.fanap.billingService.enums;

/**
 * Created By Askarian on 5/28/2019
 */
public enum EnumBaseURLPlatform {

    SANDBOX("http://sandbox.pod.ir/srv/basic-platform/"),
    PRODUCTION("https://api.pod.ir/srv/core/");

    private final String value;

    EnumBaseURLPlatform(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

}

