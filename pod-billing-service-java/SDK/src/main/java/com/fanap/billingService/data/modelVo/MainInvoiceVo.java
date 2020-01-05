package com.fanap.billingService.data.modelVo;

import java.util.List;

/**
 * Created by  Z.Gholinia on 8/28/2019.
 */


public class MainInvoiceVo {


    private String guildCode;
    private String billNumber;
    private String metadata;
    private List<InvoiceItemVO> invoiceItemVOs;
    private String description;
    private Integer discountSharePercent;


    public MainInvoiceVo setGuildCode(String guildCode) {
        this.guildCode = guildCode;
        return this;
    }

    public MainInvoiceVo setBillNumber(String billNumber) {
        this.billNumber = billNumber;
        return this;
    }

    public MainInvoiceVo setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    public MainInvoiceVo setInvoiceItemVOs(List<InvoiceItemVO> invoiceItemVOs) {
        this.invoiceItemVOs = invoiceItemVOs;
        return this;
    }

    public MainInvoiceVo setDescription(String description) {
        this.description = description;
        return this;
    }


    public String getGuildCode() {
        return guildCode;
    }

    public String getBillNumber() {
        return billNumber;
    }

    public String getMetadata() {
        return metadata;
    }

    public List<InvoiceItemVO> getInvoiceItemVOs() {
        return invoiceItemVOs;
    }

    public String getDescription() {
        return description;
    }

    public Integer getDiscountSharePercent() {
        return discountSharePercent;
    }

    public void setDiscountSharePercent(Integer discountSharePercent) {
        this.discountSharePercent = discountSharePercent;
    }
}





