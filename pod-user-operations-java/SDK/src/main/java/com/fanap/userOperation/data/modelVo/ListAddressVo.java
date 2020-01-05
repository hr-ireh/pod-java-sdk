package com.fanap.userOperation.data.modelVo;

import com.fanap.userOperation.exception.PodException;
import com.fanap.userOperation.util.PodServicesEnum;
import com.fanap.userOperation.util.TypeConversionUtil;

/**
 * Created by Z.Gholinia on 10/12/2019.
 */

public class ListAddressVo {


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token and token_issuer are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String offset;
    private String size;
    private static String scProductId;


    public ListAddressVo(Builder builder) {
        super();
        this.baseInfoVo = builder.getBaseInfoVo();
        this.offset = TypeConversionUtil.intToString(builder.getOffset());
        this.size = TypeConversionUtil.intToString(builder.getSize());
        this.scProductId = TypeConversionUtil.intToString(PodServicesEnum.NZH_LIST_ADDRESS);

    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
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
        private Integer offset;
        private Integer size;

        public Builder(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
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

        public ListAddressVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.offset != null)
                return new ListAddressVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}

