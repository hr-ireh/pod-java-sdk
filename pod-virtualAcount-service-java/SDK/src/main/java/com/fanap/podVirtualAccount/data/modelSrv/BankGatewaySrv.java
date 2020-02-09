package com.fanap.podVirtualAccount.data.modelSrv;

import java.io.Serializable;

/**
 * Created by Zahra Golinia on 2/4/2020.
 */

public class BankGatewaySrv implements Serializable {
    private long id;
    private String type;
    private String merchantCode;
    private String terminalCode;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMerchantCode() {
        return merchantCode;
    }

    public void setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode;
    }

    public String getTerminalCode() {
        return terminalCode;
    }

    public void setTerminalCode(String terminalCode) {
        this.terminalCode = terminalCode;
    }
}
