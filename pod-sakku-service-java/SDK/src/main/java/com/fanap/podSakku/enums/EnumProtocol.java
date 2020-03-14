package com.fanap.podSakku.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum  EnumProtocol {
    HTTP("http"),
    TCP("tcp"),
    UDP("udp"),
    HTTPS("https");

    private String value;

    EnumProtocol(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

}
