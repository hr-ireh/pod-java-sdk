package com.fanap.AvandService.data.modelSrv;

import java.io.Serializable;

/**
 * Created by Zahra.Gholinia on 2/4/2020.
 */
public class IssueInvoiceContentSrv implements Serializable {
    private long customerInvoiceId;
    private String paymentUrl;

    public long getCustomerInvoiceId() {
        return customerInvoiceId;
    }

    public void setCustomerInvoiceId(long customerInvoiceId) {
        this.customerInvoiceId = customerInvoiceId;
    }

    public String getPaymentUrl() {
        return paymentUrl;
    }

    public void setPaymentUrl(String paymentUrl) {
        this.paymentUrl = paymentUrl;
    }
}
