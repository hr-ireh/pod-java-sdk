package com.fanap.podVirtualAccount.data.modelSrv;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by Zahra Golinia on 2/4/2020.
 */

public class WithdrawRuleUsageReportSrv implements Serializable {
    private WithdrawRuleSrv rule;
    private List<InvoiceSrv> invoiceList;
    private Date validUntil;
    private BigDecimal remainingAmount;
    private Integer remainingCount;

    public WithdrawRuleSrv getRule() {
        return rule;
    }

    public void setRule(WithdrawRuleSrv rule) {
        this.rule = rule;
    }

    public List<InvoiceSrv> getInvoiceList() {
        return invoiceList;
    }

    public void setInvoiceList(List<InvoiceSrv> invoiceList) {
        this.invoiceList = invoiceList;
    }

    public Date getValidUntil() {
        return validUntil;
    }

    public void setValidUntil(Date validUntil) {
        this.validUntil = validUntil;
    }

    public BigDecimal getRemainingAmount() {
        return remainingAmount;
    }

    public void setRemainingAmount(BigDecimal remainingAmount) {
        this.remainingAmount = remainingAmount;
    }

    public Integer getRemainingCount() {
        return remainingCount;
    }

    public void setRemainingCount(Integer remainingCount) {
        this.remainingCount = remainingCount;
    }

}
