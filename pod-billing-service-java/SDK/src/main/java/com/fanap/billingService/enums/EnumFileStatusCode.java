package com.fanap.billingService.enums;

public enum EnumFileStatusCode {

    EXPORT_SERVICE_STATUS_CREATED(" EXPORT_SERVICE_STATUS_CREATED"),
    EXPORT_SERVICE_STATUS_RUNNING(" EXPORT_SERVICE_STATUS_RUNNING"),
    EXPORT_SERVICE_STATUS_SUCCESSFUL("EXPORT_SERVICE_STATUS_SUCCESSFUL"),
    EXPORT_SERVICE_STATUS_FAILED("EXPORT_SERVICE_STATUS_FAILED");


    private final String value;

    EnumFileStatusCode(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

}
