package com.fanap.podAIPlatform.enums;

/**
 * Created by Z.gholinia on 01/05/2020.
 */
public enum EnumMode {

    EASY("easy"),
    NORMAL("normal"),
    STRICT("strict");

    private final String value;

    EnumMode(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    }
