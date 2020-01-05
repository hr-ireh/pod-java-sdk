package com.fanap.SsoService.config;

/**
 * Created By Askarian on 5/28/2019
 */
public enum BaseURL {

    SSO_ADDRESS("https://accounts.pod.ir");

    private final String value;

    BaseURL(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

}

