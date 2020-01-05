package com.fanap.podDealing.data.modelVo;

import com.fanap.podBaseService.exception.PodException;
import com.fanap.podDealing.util.ScProductIdPodServicesProduction;
import com.fanap.podDealing.util.ScProductIdPodServicesSandBox;
import com.fanap.podBaseService.util.TypeConversionUtil;

import static com.fanap.podBaseService.enums.Enum_Server_type.PRODUCTION;

public class CommentBusinessListVo {


    /**
     * Created by Z.gholinia on 7/31/2019.
     */


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, serverType offset  and businessId are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String businessId;
    private String firstId;
    private String lastId;
    private String offset;
    private String size;
    private static String scProductId;


    public String getBusinessId() {
        return businessId;
    }

    public String getFirstId() {
        return firstId;
    }

    public String getLastId() {
        return lastId;
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

    public CommentBusinessListVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.businessId = TypeConversionUtil.longToString(builder.getBusinessId());
        this.firstId = TypeConversionUtil.longToString(builder.getFirstId());
        this.lastId = TypeConversionUtil.longToString(builder.getLastId());
        this.offset = TypeConversionUtil.intToString(builder.getOffset());
        this.size = TypeConversionUtil.intToString(builder.getSize());
        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_COMMENT_BUSINESS_LIST);
        else
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_COMMENT_BUSINESS_LIST);

    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private Long businessId;
        private Long firstId;
        private Long lastId;
        private Integer offset;
        private Integer size;


        public Long getFirstId() {
            return firstId;
        }

        public Builder setFirstId(Long firstId) {
            this.firstId = firstId;
            return this;
        }

        public Long getLastId() {
            return lastId;
        }

        public Builder setLastId(Long lastId) {
            this.lastId = lastId;
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

        public Long getBusinessId() {
            return businessId;
        }

        public Builder setBusinessId(Long businessId) {
            this.businessId = businessId;
            return this;
        }

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

        public CommentBusinessListVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null &&
                    this.businessId != null)
                if (this.offset != null && this.lastId != null && this.firstId != null || this.offset != null && this.lastId != null
                        || this.offset != null && this.firstId != null || this.lastId != null && this.firstId != null)
                    throw PodException.invalidParameter("\n" +
                            "The pagination parameters should be entered as follows:" +
                            "offset without lastId and firstId or lastId without firstId and offset or " +
                            "firstId without offset and lastId ");
                else
                    return new CommentBusinessListVo(this);

            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);

        }
    }


}





















