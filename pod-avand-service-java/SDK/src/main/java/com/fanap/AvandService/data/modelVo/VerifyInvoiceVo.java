package com.fanap.AvandService.data.modelVo;

import com.fanap.AvandService.util.ScProductIdPodServicesProduction;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.podBaseService.util.TypeConversionUtil;

/**
 * Created by Zahra.Gholinia on 2/4/2020.
 */
public class VerifyInvoiceVo {


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer and invoiceId are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String invoiceId;
    private static String scProductId;


    public VerifyInvoiceVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.invoiceId = TypeConversionUtil.longToString(builder.invoiceId);
//        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
        this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_BIZ_VERIFY_INVOICE);
//        else
//            this.scProductId = com.fanap.podBaseService.util.TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_BIZ_VERIFY_INVOICE);

    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public static class Builder {

        private BaseInfoVo baseInfoVo;
        private Long invoiceId;

        public Builder(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
        }


        public BaseInfoVo getBaseInfoVo() {
            return baseInfoVo;
        }

        public Long getInvoiceId() {
            return invoiceId;
        }

        public Builder setInvoiceId(Long invoiceId) {
            this.invoiceId = invoiceId;
            return this;
        }

        public Builder setBaseInfoVo(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
            return this;
        }

        public VerifyInvoiceVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.invoiceId != null) {
                return new VerifyInvoiceVo(this);
            } else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);


        }
    }
}

