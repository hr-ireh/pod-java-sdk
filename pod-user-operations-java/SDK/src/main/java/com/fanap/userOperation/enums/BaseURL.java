package com.fanap.userOperation.enums;

/**
 * Created By Askarian on 5/28/2019
 */
public enum BaseURL {

//    SANDBOX("http://sandbox.pod.land"),
    PRODUCTION("https://api.pod.land");

    private final String value;

    BaseURL(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

}

