package com.fanap.podSakku.enums;

/**
 * Created by Shahab Askarian on 7/30/2019.
 */
public enum Enum_Type {

    SUBSCRIPTION_PLAN_TYPE_BLOCK("SUBSCRIPTION_PLAN_TYPE_BLOCK"),
    SUBSCRIPTION_PLAN_TYPE_CASH("SUBSCRIPTION_PLAN_TYPE_CASH"),;

    public String type;

    Enum_Type(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

}
