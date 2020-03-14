package com.fanap.podSakku.data.modelVo;

import com.fanap.podSakku.exception.PodException;
import com.fanap.podSakku.util.TypeConversionUtil;
/**
 * Created by zahra Gholinia on 2/16/2020.
 */

public class GetApplicationActivityVo {
    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Authorization , id  are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String id;
    private String page;
    private String size;


    public GetApplicationActivityVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.id = TypeConversionUtil.longToString(builder.getId());
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

    public String getId() {
        return id;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private Long id;
        private Integer page;
        private Integer size;


        public Long getId() {
            return id;
        }

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

        public Builder setId(Long id) {
            this.id = id;
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

        public GetApplicationActivityVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getAuthorization() != null &&
                    this.id != null)
                return new GetApplicationActivityVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}

