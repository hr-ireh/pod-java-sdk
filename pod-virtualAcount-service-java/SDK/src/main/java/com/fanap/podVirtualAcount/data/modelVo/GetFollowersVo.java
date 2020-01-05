package com.fanap.podVirtualAcount.data.modelVo;

import com.fanap.podBaseService.exception.PodException;
import com.fanap.podVirtualAcount.util.ScProductIdPodServicesProduction;
import com.fanap.podVirtualAcount.util.ScProductIdPodServicesSandBox;
import com.fanap.podBaseService.util.TypeConversionUtil;

import static com.fanap.podBaseService.enums.Enum_Server_type.PRODUCTION;

public class GetFollowersVo {


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer and serverType are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String offset;
    private String size;
    private static String scProductId;

    public String getOffset() {
        return offset;
    }

    public String getSize() {
        return size;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public GetFollowersVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.offset = TypeConversionUtil.intToString(builder.getOffset());
        this.size =TypeConversionUtil.intToString(builder.getSize());
        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_BIZ_GET_FOLLOWERS);
        else
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_BIZ_GET_FOLLOWERS);

    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private Integer offset;
        private Integer size;



        public Builder(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
        }

        public BaseInfoVo getBaseInfoVo() {
            return baseInfoVo;
        }

        public Builder setBaseInfoVo(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
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

        public GetFollowersVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.baseInfoVo.getServerType()!=null)
                return new GetFollowersVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }


    }
}
