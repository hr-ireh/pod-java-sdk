package com.fanap.podSubscription.enums;

/**
 * Created by Shahab Askarian on 7/30/2019.
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
