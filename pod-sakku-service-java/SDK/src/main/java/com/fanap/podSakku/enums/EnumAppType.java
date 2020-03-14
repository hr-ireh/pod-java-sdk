package com.fanap.podSakku.enums;

public enum EnumAppType {

    JAR("jar");

    private String value;

    EnumAppType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
