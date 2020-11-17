package com.fanap.SsoService.enums;

public enum EnumResponseType {

    CODE("code"),
    ID_TOKEN("id_token"),
    TOKEN("token");

    private final String value;

    EnumResponseType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
