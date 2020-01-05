package com.fanap.billingService.enums;

public enum Enum_Server_type_Percent {
    four(4),
    eight(8),
    Sixteen(16);
    private int type;

    Enum_Server_type_Percent(int type) {
        this.type=type;
    }
    public int getType(){
        return this.type;
    }
}
