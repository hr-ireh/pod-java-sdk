package com.fanap.podProduct.data.modelVo;

import com.fanap.podBaseService.exception.PodException;
import com.fanap.podProduct.util.ScProductIdPodServicesSandBox;
import com.fanap.podBaseService.util.TypeConversionUtil;
import com.fanap.podProduct.util.ScProductIdPodServicesProduction;

import java.util.List;

import static com.fanap.podBaseService.enums.Enum_Server_type.PRODUCTION;

/**
 * Created by Z.gholinia on 9/11/2019.
 */

public class AttributeTemplateListVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, (offset or lastId or firstId)  are required parameters!";

    private BaseInfoVo baseInfoVo;
    private List<String> guildCode;
    private String firstId;
    private String lastId;
    private String offset;
    private String size;
    private static String scProductId;


    public AttributeTemplateListVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.guildCode = builder.getGuildCode();
        this.firstId = TypeConversionUtil.longToString(builder.getFirstId());
        this.lastId = TypeConversionUtil.longToString(builder.getLastId());
        this.offset = TypeConversionUtil.intToString(builder.getOffset());
        this.size = TypeConversionUtil.intToString(builder.getSize());
        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_ATTRIBUTE_TEMPLATE_LIST);
        else
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_ATTRIBUTE_TEMPLATE_LIST);

    }

    public List<String> getGuildCode() {
        return guildCode;
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

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private List<String> guildCode;
        private Long firstId;
        private Long lastId;
        private Integer offset;
        private Integer size;

        public List<String> getGuildCode() {
            return guildCode;
        }


        public Builder setGuildCode(List<String> guildCode) {
            this.guildCode = guildCode;
            return this;
        }

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

        public AttributeTemplateListVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null && this.baseInfoVo.getServerType()!=null &&
                    this.baseInfoVo.getToken_issuer() != null) {
                if (this.firstId == null && this.lastId == null && this.offset == null) {
                    throw PodException.invalidParameter("firstId or lastId or offset must be specified");
                } else return new AttributeTemplateListVo(this);
            } else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }


}

