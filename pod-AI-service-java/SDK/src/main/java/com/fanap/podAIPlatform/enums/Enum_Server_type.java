package com.fanap.podAIPlatform.enums;

/**
 * Created by Z.gholinia on 01/05/2020.
 */
public enum Enum_Server_type {

//    SANDBOX("sandbox"),
    PRODUCTION("production");

    private final String value;

    Enum_Server_type(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

}

