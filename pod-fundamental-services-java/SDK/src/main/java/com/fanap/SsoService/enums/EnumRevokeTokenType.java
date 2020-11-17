package com.fanap.SsoService.enums;

public enum EnumRevokeTokenType {
    ACCESS_TOKEN("access_token"),
    REFRESH_TOKEN("refresh_token");

    private final String value;

    EnumRevokeTokenType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
