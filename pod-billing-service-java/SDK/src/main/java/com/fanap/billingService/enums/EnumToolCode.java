package com.fanap.billingService.enums;

public enum EnumToolCode {
    SETTLEMENT_TOOL_SATNA("SETTLEMENT_TOOL_SATNA"),
    SETTLEMENT_TOOL_PAYA("SETTLEMENT_TOOL_PAYA"),
    SETTLEMENT_TOOL_CARD("SETTLEMENT_TOOL_CARD");

    private final String value;

    EnumToolCode(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}