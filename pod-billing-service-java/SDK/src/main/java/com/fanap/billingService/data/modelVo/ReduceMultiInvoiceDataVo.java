package com.fanap.billingService.data.modelVo;

import java.util.List;

/**
 * Created by  Z.Gholinia on 8/28/2019.
 */

public class ReduceMultiInvoiceDataVo {


    //  private BaseInfoVo baseInfoVo;
    private String PreferredTaxRate;
    private ReduceInvoiceItemVO MainInvoice;
    private List<ReduceInvoiceItemVO> SubInvoices;
    private List<ReduceInvoiceSubItemVo> CustomerInvoiceItemVOs;

    public String getPreferredTaxRate() {
        return PreferredTaxRate;
    }

    public ReduceInvoiceItemVO getMainInvoice() {
        return MainInvoice;
    }

    public List<ReduceInvoiceItemVO> getSubInvoices() {
        return SubInvoices;
    }

    public List<ReduceInvoiceSubItemVo> getCustomerInvoiceItemVOs() {
        return CustomerInvoiceItemVOs;
    }

    public ReduceMultiInvoiceDataVo setPreferredTaxRate(String preferredTaxRate) {
        PreferredTaxRate = preferredTaxRate;
        return this;
    }

    public ReduceMultiInvoiceDataVo setMainInvoice(ReduceInvoiceItemVO mainInvoice) {
        MainInvoice = mainInvoice;
        return this;
    }

    public ReduceMultiInvoiceDataVo setSubInvoices(List<ReduceInvoiceItemVO> subInvoices) {
        SubInvoices = subInvoices;
        return this;
    }

    public ReduceMultiInvoiceDataVo setCustomerInvoiceItemVOs(List<ReduceInvoiceSubItemVo> customerInvoiceItemVOs) {
        CustomerInvoiceItemVOs = customerInvoiceItemVOs;
        return this;
    }
}




