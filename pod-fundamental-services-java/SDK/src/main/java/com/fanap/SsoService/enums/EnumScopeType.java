package com.fanap.SsoService.enums;

public enum EnumScopeType {
    ADDRESS("address"),
    ACTIVITY("activity"),
    LEGAL("legal"),
    PHONE("phone"),
    EMAIL("email"),
    PROFILE("profile");

    private final String value;

    EnumScopeType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
