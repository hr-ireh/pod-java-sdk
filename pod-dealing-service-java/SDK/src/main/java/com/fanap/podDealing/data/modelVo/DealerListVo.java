package com.fanap.podDealing.data.modelVo;

import com.fanap.podBaseService.exception.PodException;
import com.fanap.podDealing.util.ScProductIdPodServicesProduction;
import com.fanap.podDealing.util.ScProductIdPodServicesSandBox;
import com.fanap.podBaseService.util.TypeConversionUtil;

import static com.fanap.podBaseService.enums.Enum_Server_type.PRODUCTION;


/**
 * Created by  Z.Gholinia on 8/28/2019.
 */

public class DealerListVo {


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String dealerBizId;
    private String enable;
    private String offset;
    private String size;
    private static String scProductId;


    public DealerListVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.dealerBizId = TypeConversionUtil.longToString(builder.getDealerBizId());
        this.enable = TypeConversionUtil.booleanToString(builder.getEnable());
        this.offset = TypeConversionUtil.intToString(builder.getOffset());
        this.size = TypeConversionUtil.intToString(builder.getSize());
        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_BIZ_DEALER_LIST);
        else
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_BIZ_DEALER_LIST);

    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getDealerBizId() {
        return dealerBizId;
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
        private Long dealerBizId;
        private Boolean enable;
        private Integer offset;
        private Integer size;


        public Builder(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
        }


        public Long getDealerBizId() {
            return dealerBizId;
        }

        public Builder setDealerBizId(Long dealerBizId) {
            this.dealerBizId = dealerBizId;
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

        public DealerListVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null)
                return new DealerListVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}


