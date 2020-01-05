package com.fanap.billingService.data.modelVo;

import com.fanap.billingService.exception.PodException;
import com.fanap.billingService.util.ScProductIdPodServicesProduction;
import com.fanap.billingService.util.ScProductIdPodServicesSandBox;
import com.fanap.podBaseService.util.TypeConversionUtil;

import java.util.ArrayList;
import java.util.List;

import static com.fanap.billingService.enums.Enum_Server_type.PRODUCTION;

public class ReduceInvoiceVo {


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer  are required parameters!";
    private BaseInfoVo baseInfoVo;
    private String id;
    private List<String> invoiceItemId= new ArrayList<>();
    private List<String> price= new ArrayList<>();
    private List<String> itemDescription= new ArrayList<>();
    private List<String> quantity= new ArrayList<>();
    private String preferredTaxRate;
    private static String scProductId;

    public ReduceInvoiceVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.id = TypeConversionUtil.longToString(builder.getId());
        for (InvoiceItemInfoVo invoiceItemInfoVo : builder.getInvoiceItemsInfo()) {
            this.invoiceItemId.add(TypeConversionUtil.longToString(invoiceItemInfoVo.getInvoiceItemId()));
            this.price.add(TypeConversionUtil.decimalToString(invoiceItemInfoVo.getPrice()));
            this.itemDescription.add(invoiceItemInfoVo.getItemDescription());
            this.quantity.add(TypeConversionUtil.decimalToString(invoiceItemInfoVo.getQuantity()));

        }
        this.preferredTaxRate = TypeConversionUtil.doubleToString(builder.getPreferredTaxRate());
        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
        this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_BIZ_REDUSE_INVOICE);
        else
            this.scProductId = com.fanap.podBaseService.util.TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_BIZ_REDUSE_INVOICE);

    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getId() {
        return id;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public List<String> getInvoiceItemId() {
        return invoiceItemId;
    }

    public List<String> getPrice() {
        return price;
    }

    public List<String> getItemDescription() {
        return itemDescription;
    }

    public List<String> getQuantity() {
        return quantity;
    }

    public String getPreferredTaxRate() {
        return preferredTaxRate;
    }

    public static class Builder {

        private BaseInfoVo baseInfoVo;
        private Long id;
        private List<InvoiceItemInfoVo> invoiceItemsInfo;
        private Double preferredTaxRate;

        public Builder(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
        }


        public Long getId() {
            return id;
        }


        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public List<InvoiceItemInfoVo> getInvoiceItemsInfo() {
            return invoiceItemsInfo;
        }

        public Builder setInvoiceItemsInfo(List<InvoiceItemInfoVo> invoiceItemsInfo) {
            this.invoiceItemsInfo = invoiceItemsInfo;
            return this;
        }

        public Double getPreferredTaxRate() {
            return preferredTaxRate;
        }

        public Builder setPreferredTaxRate(Double preferredTaxRate) {
            this.preferredTaxRate = preferredTaxRate;
            return this;
        }

        public BaseInfoVo getBaseInfoVo() {
            return baseInfoVo;
        }

        public Builder setBaseInfoVo(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
            return this;
        }

        public ReduceInvoiceVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.id != null && this.invoiceItemsInfo != null)
                return new ReduceInvoiceVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}

