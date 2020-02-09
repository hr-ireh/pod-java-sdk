package com.fanap.podVirtualAccount.enums;

/**
 * Created by Zahra Golinia on 2/4/2020.
 */

public enum EnumTypeCode {

    WITHDRAW_RULE_TYPE_SUBSCRIPTION("WITHDRAW_RULE_TYPE_SUBSCRIPTION"),
    WITHDRAW_RULE_TYPE_SUBSCRIPTION_AMOUNT("WITHDRAW_RULE_TYPE_SUBSCRIPTION_AMOUNT"),
    WITHDRAW_RULE_TYPE_SUBSCRIPTION_AMOUNT_COUNT("WITHDRAW_RULE_TYPE_SUBSCRIPTION_AMOUNT_COUNT"),
    WITHDRAW_RULE_TYPE_AMOUNT_COUNT("WITHDRAW_RULE_TYPE_AMOUNT_COUNT"),
    WITHDRAW_RULE_TYPE_AMOUNT("WITHDRAW_RULE_TYPE_AMOUNT");

    public String value;

    EnumTypeCode(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }


}
