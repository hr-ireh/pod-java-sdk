package com.fanap.SsoService.enums;

public enum EnumReferrerType {

    ID("id"),
    USERNAME("username"),
    PHONE_NUMBER("phone_number"),
    EMAIL("email"),
    NATIONAL_CODE("nationalcode");

    private final String value;

    EnumReferrerType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
