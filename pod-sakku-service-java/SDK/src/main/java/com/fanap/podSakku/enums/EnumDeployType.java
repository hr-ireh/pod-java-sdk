package com.fanap.podSakku.enums;

public enum EnumDeployType {
    APP("APP"),
    CODE("CODE"),
    DOCKER_IMAGE("DOCKER_IMAGE"),
    DOCKER_FILE("DOCKER_FILE");
    private final String value;

    EnumDeployType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
