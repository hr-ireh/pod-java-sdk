package com.fanap.billingService.data.modelVo;

import com.fanap.billingService.exception.PodException;
import com.fanap.billingService.util.ScProductIdPodServicesProduction;
import com.fanap.billingService.util.ScProductIdPodServicesSandBox;
import com.fanap.podBaseService.util.TypeConversionUtil;

import static com.fanap.billingService.enums.Enum_Server_type.PRODUCTION;

public class VerifyInvoiceVo {


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer and (id or billNumber)are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String id;
    private static String scProductId;
    private String billNumber;


    public VerifyInvoiceVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.id = TypeConversionUtil.longToString(builder.id);
        this.billNumber = builder.getBillNumber();
        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_BIZ_VERIFY_INVOICE);
        else
            this.scProductId = com.fanap.podBaseService.util.TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_BIZ_VERIFY_INVOICE);

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

    public String getBillNumber() {
        return billNumber;
    }

    public static class Builder {

        private BaseInfoVo baseInfoVo;
        private Long id;
        private String billNumber;

        public String getBillNumber() {
            return billNumber;
        }

        public Builder setBillNumber(String billNumber) {
            this.billNumber = billNumber;
            return this;
        }

        public Builder(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
        }


        public BaseInfoVo getBaseInfoVo() {
            return baseInfoVo;
        }

        public Long getId() {
            return id;
        }

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public Builder setBaseInfoVo(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
            return this;
        }

        public VerifyInvoiceVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null) {
                if (this.billNumber != null && this.id == null || this.billNumber == null && this.id != null)
                    return new VerifyInvoiceVo(this);
                else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
            } else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);


        }
    }
}

