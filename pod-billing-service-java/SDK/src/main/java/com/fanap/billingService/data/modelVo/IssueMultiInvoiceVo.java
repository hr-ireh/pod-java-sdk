package com.fanap.billingService.data.modelVo;

import com.fanap.billingService.exception.PodException;
import com.fanap.billingService.util.DelegationInfo;
import com.fanap.billingService.util.JsonUtil;
import com.fanap.billingService.util.ScProductIdPodServicesProduction;
import com.fanap.billingService.util.ScProductIdPodServicesSandBox;
import com.fanap.podBaseService.util.TypeConversionUtil;

import java.util.ArrayList;
import java.util.List;

import static com.fanap.billingService.enums.Enum_Server_type.PRODUCTION;

/**
 * Created by  Z.Gholinia on 8/28/2019.
 */


public class IssueMultiInvoiceVo {


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, ott, serverType and data are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String data;
    private List<String> delegatorId;
    private List<String> delegationHash;
    private String forceDelegation;
    private DelegationInfo[] delegationInfos;
    private static String scProductId;


    public String getData() {
        return data;
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

    public static String getScProductId() {
        return scProductId;
    }

    public IssueMultiInvoiceVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.data = builder.getData();
        this.delegationHash = builder.getDelegationHash();
        this.delegatorId = TypeConversionUtil.longToString(builder.getDelegatorId());
        this.forceDelegation = TypeConversionUtil.booleanToString(builder.isForceDelegation());
        this.delegationInfos = builder.getDelegationInfos();
        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
        this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_BIZ_ISSUE_MULTI_INVOICE);
        else
            this.scProductId = com.fanap.podBaseService.util.TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_BIZ_ISSUE_MULTI_INVOICE);

    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public static class Builder {

        private BaseInfoVo baseInfoVo;
        private String data;
        private List<Long> delegatorId;
        private List<String> delegationHash;
        private boolean forceDelegation;
        private DelegationInfo[] delegationInfos;

        public Builder(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
        }


        public String getData() {
            return data;
        }

        public Builder setData(MultiInvoiceDataVo data) {
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

        public List<Long> getDelegatorId() {
            return delegatorId;
        }


        public List<String> getDelegationHash() {
            return delegationHash;
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

        public boolean isForceDelegation() {
            return forceDelegation;
        }

        public Builder setForceDelegation(boolean forceDelegation) {
            this.forceDelegation = forceDelegation;
            return this;
        }


        public IssueMultiInvoiceVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.baseInfoVo.getOtt() != null && this.data != null)
                return new IssueMultiInvoiceVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }


}


