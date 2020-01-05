package com.fanap.SsoService.data.modelSrv;

/**
 * Created by Shahab Askarian on 5/28/2019.
 */
public class RevokeTokenSrv {

    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public RevokeTokenSrv setCode(int code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public RevokeTokenSrv setMessage(String message) {
        this.message = message;
        return this;
    }
}
