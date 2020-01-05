package com.fanap.billingService.data.modelVo;

import com.fanap.billingService.exception.PodException;
import com.fanap.billingService.util.DelegationInfo;
import com.fanap.billingService.util.ScProductIdPodServicesProduction;
import com.fanap.billingService.util.ScProductIdPodServicesSandBox;
import com.fanap.podBaseService.util.TypeConversionUtil;

import java.util.ArrayList;
import java.util.List;

import static com.fanap.billingService.enums.Enum_Server_type.PRODUCTION;

public class PayAnyInvoiceByCreditVo {


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer , wallet and invoiceId are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String invoiceId;
    private List<String> delegatorId;
    private List<String> delegationHash;
    private String forceDelegation;
    private String wallet;
    private DelegationInfo[] delegationInfos;
    private static String scProductId;

    public PayAnyInvoiceByCreditVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.invoiceId = TypeConversionUtil.longToString(builder.getInvoiceId());
        this.delegationHash = builder.getDelegationHash();
        this.delegatorId = TypeConversionUtil.longToString(builder.getDelegatorId());
        this.forceDelegation = builder.getForceDelegation();
        this.wallet = builder.getWallet();
        this.delegationInfos = builder.getDelegationInfos();
        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
        this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_PAY_ANY_INVOICE_BY_CREDIT);
        else
            this.scProductId = com.fanap.podBaseService.util.TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_PAY_ANY_INVOICE_BY_CREDIT);
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getWallet() {
        return wallet;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public List<String> getDelegatorId() {
        return delegatorId;
    }

    public List<String> getDelegationHash() {
        return delegationHash;
    }

    public String getForceDelegation() {
        return forceDelegation;
    }

    public DelegationInfo[] getDelegationInfos() {
        return delegationInfos;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public static class Builder {

        private BaseInfoVo baseInfoVo;
        private Long invoiceId;
        private List<Long> delegatorId;
        private List<String> delegationHash;
        private String forceDelegation;
        private String wallet;
        private DelegationInfo[] delegationInfos;

        public Builder(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
        }


        public String getWallet() {
            return wallet;
        }

        public Builder setWallet(String wallet) {
            this.wallet = wallet;
            return this;
        }

        public DelegationInfo[] getDelegationInfos() {
            return delegationInfos;
        }

        public Builder setDelegationInfos(DelegationInfo[] delegationInfos) {
            List<Long> delegatorId = new ArrayList<>();
            List<String> delegationHash = new ArrayList<>();


            for (int i = 0; i < delegationInfos.length; i++) {
                if (delegationInfos[i] != null) {
                    delegatorId.add(i, delegationInfos[i].getDelegatorId());
                    delegationHash.add(i, delegationInfos[i].getDelegationHash());
                }
            }
            this.delegatorId = delegatorId;
            this.delegationHash = delegationHash;
            return this;
        }

        public List<Long> getDelegatorId() {
            return delegatorId;
        }


        public List<String> getDelegationHash() {
            return delegationHash;
        }


        public String getForceDelegation() {
            return forceDelegation;
        }

        public Builder setForceDelegation(String forceDelegation) {
            this.forceDelegation = forceDelegation;
            return this;
        }

        public Long getInvoiceId() {
            return invoiceId;
        }

        public Builder setInvoiceId(Long invoiceId) {
            this.invoiceId = invoiceId;
            return this;
        }

        public BaseInfoVo getBaseInfoVo() {
            return baseInfoVo;
        }

        public Builder setBaseInfoVo(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
            return this;
        }

        public PayAnyInvoiceByCreditVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.getInvoiceId() != null && this.getWallet() != null)
                return new PayAnyInvoiceByCreditVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}



