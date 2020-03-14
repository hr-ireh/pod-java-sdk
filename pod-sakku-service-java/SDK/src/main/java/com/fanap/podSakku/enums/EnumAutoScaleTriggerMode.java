package com.fanap.podSakku.enums;

public enum EnumAutoScaleTriggerMode {
    //do not scale me
    OFF("OFF"),
    //scale me depends on cpu state
    CPU("CPU"),
    //scale me depends on memory state
    MEM("MEM"),
    //scale me depends on both cpu and mem state
    AND("AND"),
    //scale me depends on cpu or mem state
    OR("OR");
    private final String value;

    EnumAutoScaleTriggerMode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
