package com.fanap.podVirtualAcount.data.modelVo;

import com.fanap.podBaseService.exception.PodException;
import com.fanap.podBaseService.util.TypeConversionUtil;
import com.fanap.podVirtualAcount.util.ScProductIdPodServicesProduction;
import com.fanap.podVirtualAcount.util.ScProductIdPodServicesSandBox;

import static com.fanap.podBaseService.enums.Enum_Server_type.PRODUCTION;

public class ShebaListVo {
    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, serverType, offset and size are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String offset;
    private String size;
    private String id;
    private String sheba;
    private String name;
    private static String scProductId;

    public String getOffset() {
        return offset;
    }

    public String getSize() {
        return size;
    }

    public String getId() {
        return id;
    }

    public String getSheba() {
        return sheba;
    }

    public String getName() {
        return name;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public ShebaListVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.offset = builder.getOffset();
        this.size = builder.getSize();
        this.id = builder.getId();
        this.sheba = builder.getSheba();
        this.name = builder.getName();

        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_BIZ_SHEBA_LIST);
        else
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_BIZ_SHEBA_LIST);
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private String offset;
        private String size;
        private String id;
        private String sheba;
        private String name;

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

        public String getOffset() {
            return offset;
        }

        public Builder setOffset(String offset) {
            this.offset = offset;
            return this;
        }

        public String getSize() {
            return size;
        }

        public Builder setSize(String size) {
            this.size = size;
            return this;
        }

        public String getId() {
            return id;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public String getSheba() {
            return sheba;
        }

        public Builder setSheba(String sheba) {
            this.sheba = sheba;
            return this;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public ShebaListVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && offset != null && size != null && this.baseInfoVo.getServerType() != null)
                return new ShebaListVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}
