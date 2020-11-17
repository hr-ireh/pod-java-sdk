package com.fanap.SsoService.enums;

public enum EnumDeviceType {
    MobilePhone("Mobile Phone"),
    Desktop("Desktop"),
    Tablet("Tablet"),
    Console("Tablet"),
    TvDevice("TV Device");

    private final String value;

    EnumDeviceType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

}
