package com.fanap.billingService.data.modelVo;


import com.fanap.billingService.exception.PodException;
import com.fanap.billingService.util.ScProductIdPodServicesProduction;
import com.fanap.billingService.util.ScProductIdPodServicesSandBox;
import com.fanap.podBaseService.util.TypeConversionUtil;

import java.util.List;

import static com.fanap.billingService.enums.Enum_Server_type.PRODUCTION;

/**
 * Created by  Z.Gholinia on 8/28/2019.
 */


public class ReduceInvoiceItemVO {


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer  are required parameters!";
    private BaseInfoVo baseInfoVo;
    private String id;
    private List<ReduceInvoiceSubItemVo> reduceInvoiceItemVOs;
    private static String scProductId;

    public ReduceInvoiceItemVO(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.id = TypeConversionUtil.longToString(builder.getId());
        this.reduceInvoiceItemVOs = builder.getReduceInvoiceItemVOs();
        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
        this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_BIZ_REDUCE_INVOICE);
        else
            this.scProductId = com.fanap.podBaseService.util.TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_BIZ_REDUCE_INVOICE);

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

    public List<ReduceInvoiceSubItemVo> getReduceInvoiceItemVOs() {
        return reduceInvoiceItemVOs;
    }

    public static class Builder {

        private BaseInfoVo baseInfoVo;
        private Long id;
        private List<ReduceInvoiceSubItemVo> reduceInvoiceItemVOs;

        public Builder(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
        }


        public Long getId() {
            return id;
        }

        public List<ReduceInvoiceSubItemVo> getReduceInvoiceItemVOs() {
            return reduceInvoiceItemVOs;
        }

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public Builder setReduceInvoiceItemVOs(List<ReduceInvoiceSubItemVo> reduceInvoiceItemVOs) {
            this.reduceInvoiceItemVOs = reduceInvoiceItemVOs;
            return this;
        }

        public BaseInfoVo getBaseInfoVo() {
            return baseInfoVo;
        }

        public Builder setBaseInfoVo(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
            return this;
        }

        public ReduceInvoiceItemVO build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null)
                return new ReduceInvoiceItemVO(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}


