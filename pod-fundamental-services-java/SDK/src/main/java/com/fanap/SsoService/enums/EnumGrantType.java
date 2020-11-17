package com.fanap.SsoService.enums;

public enum EnumGrantType {

    AUTHORIZATION_CODE("authorization_code"),
    REFRESH_TOKEN("refresh_token"),
    PASSWORD("password");

    private final String value;

    EnumGrantType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
