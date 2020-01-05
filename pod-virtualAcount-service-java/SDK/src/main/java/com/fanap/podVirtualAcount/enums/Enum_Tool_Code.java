package com.fanap.podVirtualAcount.enums;

public enum  Enum_Tool_Code {

    SETTLEMENT_TOOL_SATNA("SETTLEMENT_TOOL_SATNA"),
    SETTLEMENT_TOOL_PAYA("SETTLEMENT_TOOL_PAYA"),
    SETTLEMENT_TOOL_CARD("SETTLEMENT_TOOL_CARD");

    public String toolCode;

    Enum_Tool_Code(String toolCode) {
        this.toolCode = toolCode;
    }

    public String getToolCode() {
        return this.toolCode;
    }
}
