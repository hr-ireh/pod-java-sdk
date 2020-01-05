package com.fanap.billingService.data.modelVo;

import com.fanap.billingService.exception.PodException;
import com.fanap.billingService.util.JsonUtil;
import com.fanap.billingService.util.ScProductIdPodServicesProduction;
import com.fanap.billingService.util.ScProductIdPodServicesSandBox;
import com.fanap.podBaseService.util.TypeConversionUtil;
import com.fasterxml.jackson.core.JsonProcessingException;

import static com.fanap.billingService.enums.Enum_Server_type.PRODUCTION;

public class ReduceMultiInvoiceVo {


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer and data are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String data;
    private static String scProductId;


    public ReduceMultiInvoiceVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.data = builder.getData();
        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_BIZ_REDUCE_MULTI_INVOICE);
        else
            this.scProductId = com.fanap.podBaseService.util.TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_BIZ_REDUCE_MULTI_INVOICE);

    }


    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getData() {
        return data;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public static class Builder {

        private BaseInfoVo baseInfoVo;
        private String data;

        public Builder(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
        }

        public String getData() {
            return data;
        }

        public Builder setData(ReduceMultiInvoiceDataVo data) throws JsonProcessingException {
            this.data = JsonUtil.getJson(data);
            return this;
        }

        public BaseInfoVo getBaseInfoVo() {
            return baseInfoVo;
        }

        public Builder setBaseInfoVo(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
            return this;
        }

        public ReduceMultiInvoiceVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.data != null)
                return new ReduceMultiInvoiceVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}




