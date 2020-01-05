package com.fanap.podNeshan.enums;

/**
 * Created By Askarian on 5/28/2019
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

