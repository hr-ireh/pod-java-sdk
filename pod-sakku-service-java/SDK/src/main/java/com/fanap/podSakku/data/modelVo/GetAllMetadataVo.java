package com.fanap.podSakku.data.modelVo;

import com.fanap.podSakku.exception.PodException;
import com.fanap.podSakku.util.TypeConversionUtil;

public class GetAllMetadataVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Authorization is required parameters!";

    private BaseInfoVo baseInfoVo;
    private String page;
    private String size;


    public GetAllMetadataVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.page = TypeConversionUtil.intToString(builder.getPage());
        this.size = TypeConversionUtil.intToString(builder.getSize());
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getPage() {
        return page;
    }

    public String getSize() {
        return size;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private Integer page;
        private Integer size;

        public Integer getPage() {
            return page;
        }

        public Builder setPage(Integer page) {
            this.page = page;
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

        public GetAllMetadataVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getAuthorization() != null)
                return new GetAllMetadataVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}
