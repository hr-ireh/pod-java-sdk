package com.fanap.billingService.enums;

/**
 * Created By Askarian on 5/28/2019
 */
public enum EnumBaseURLPrivate {
    SANDBOX("https://sandbox.pod.ir:1033"),
    PRODUCTION("https://pay.pod.ir");

    private final String value;

    EnumBaseURLPrivate(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}