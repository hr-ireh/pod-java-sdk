package com.fanap.podSakku.data.modelVo;

import com.fanap.podSakku.exception.PodException;
import com.fanap.podSakku.util.TypeConversionUtil;
/**
 * Created by zahra Gholinia on 2/16/2020.
 */

public class GetUserApplicationsListVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Authorization , page are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String page;
    private String size;


    public String getSize() {
        return size;
    }

    public String getPage() {
        return page;
    }

    public GetUserApplicationsListVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.page = TypeConversionUtil.intToString(builder.getPage());
        this.size = TypeConversionUtil.intToString(builder.getSize());
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
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

        public GetUserApplicationsListVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getAuthorization() != null &&
                    this.page != null)
                return new GetUserApplicationsListVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}


