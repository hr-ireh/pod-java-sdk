package com.fanap.podBaseService.exception;


public class PodException extends Throwable {

    public static final String errMsg = "خطایی اتفاق افتاده است. لطفا با پشتیبانی تماس بگیرید.";

    private int code;

    /**
     * @param code
     * @param message
     */

    private PodException(int code, String message) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static PodException developerException(int code, String message) {

        return new PodException(code, message);
    }

    public static PodException unexpectedException() {

        return new PodException(PodExceptionConsts.UNEXPECTED_EXCEPTION, errMsg);
    }

    public static PodException invalidParameter(String msg) {
        return new PodException(PodExceptionConsts.INVALID_PARAMETER, msg);
    }
}
