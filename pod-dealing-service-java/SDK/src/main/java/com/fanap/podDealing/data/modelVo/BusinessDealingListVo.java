package com.fanap.podDealing.data.modelVo;


import com.fanap.podBaseService.exception.PodException;
import com.fanap.podDealing.util.ScProductIdPodServicesProduction;
import com.fanap.podDealing.util.ScProductIdPodServicesSandBox;
import com.fanap.podBaseService.util.TypeConversionUtil;

import static com.fanap.podBaseService.enums.Enum_Server_type.PRODUCTION;

/**
 * Created by  Z.Gholinia on 8/28/2019.
 */

public class BusinessDealingListVo {


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer  are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String dealingBusinessId;
    private String enable;
    private String offset;
    private String size;
    private static String scProductId;


    public BusinessDealingListVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.dealingBusinessId = TypeConversionUtil.longToString(builder.getDealingBusinessId());
        this.enable = TypeConversionUtil.booleanToString(builder.getEnable());
        this.offset = TypeConversionUtil.intToString(builder.getOffset());
        this.size = TypeConversionUtil.intToString(builder.getSize());
        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_BIZ_BUSINESS_DEALING_LIST);
        else
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_BIZ_BUSINESS_DEALING_LIST);

    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getDealingBusinessId() {
        return dealingBusinessId;
    }

    public String getEnable() {
        return enable;
    }

    public String getOffset() {
        return offset;
    }

    public String getSize() {
        return size;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public static class Builder {

        private BaseInfoVo baseInfoVo;
        private Long dealingBusinessId;
        private Boolean enable;
        private Integer offset;
        private Integer size;


        public Builder(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
        }


        public Long getDealingBusinessId() {
            return dealingBusinessId;
        }

        public Builder setDealingBusinessId(Long dealingBusinessId) {
            this.dealingBusinessId = dealingBusinessId;
            return this;
        }

        public Boolean getEnable() {
            return enable;
        }

        public Builder setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        public Integer getOffset() {
            return offset;
        }

        public Builder setOffset(Integer offset) {
            this.offset = offset;
            return this;
        }

        public Integer getSize() {
            return size;
        }

        public Builder setSize(Integer size) {
            this.size = size;
            return this;
        }

        public BaseInfoVo getBaseInfoVo() {
            return baseInfoVo;
        }

        public Builder setBaseInfoVo(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
            return this;
        }

        public BusinessDealingListVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null)
                return new BusinessDealingListVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}



