package com.fanap.podVirtualAccount.enums;

/**
 * Created by Zahra Golinia on 2/4/2020.
 */

public enum Enum_Period_Type_Code {

    SUBSCRIPTION_PLAN_PERIOD_TYPE_YEARLY("SUBSCRIPTION_PLAN_PERIOD_TYPE_YEARLY"),
    SUBSCRIPTION_PLAN_PERIOD_TYPE_MONTHLY("SUBSCRIPTION_PLAN_PERIOD_TYPE_MONTHLY"),
    SUBSCRIPTION_PLAN_PERIOD_TYPE_DAILY("SUBSCRIPTION_PLAN_PERIOD_TYPE_DAILY"),
    ;

    public String periodTypeCode;

    Enum_Period_Type_Code(String periodTypeCode) {
        this.periodTypeCode = periodTypeCode;
    }

    public String getPeriodTypeCode() {
        return this.periodTypeCode;
    }

}
