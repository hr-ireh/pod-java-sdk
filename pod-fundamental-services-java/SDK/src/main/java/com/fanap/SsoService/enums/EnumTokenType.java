package com.fanap.SsoService.enums;

public enum EnumTokenType {
    ACCESS_TOKEN("access_token"),
    ID_TOKEN("id_token"),
    REFRESH_TOKEN("refresh_token");

    private final String value;

    EnumTokenType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

}
