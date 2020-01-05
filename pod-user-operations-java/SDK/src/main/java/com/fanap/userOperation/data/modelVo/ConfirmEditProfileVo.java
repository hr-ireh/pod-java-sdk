package com.fanap.userOperation.data.modelVo;

import com.fanap.userOperation.exception.PodException;
import com.fanap.userOperation.util.PodServicesEnum;
import com.fanap.userOperation.util.TypeConversionUtil;

import java.util.List;
/**
 * Created by Z.Gholinia on 10/12/2019.
 */

public class ConfirmEditProfileVo  {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token and token_issuer are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String code;
    private String cellphoneNumber;
    private static String scProductId;


    public ConfirmEditProfileVo(Builder builder) {
        super();
        this.baseInfoVo = builder.getBaseInfoVo();
        this.code = TypeConversionUtil.longToString(builder.getCode());
        this.cellphoneNumber = builder.getCellphoneNumber();
        this.scProductId = TypeConversionUtil.intToString(PodServicesEnum.NZH_CONFIRM_EDIT_PROFILE);

    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getCode() {
        return code;
    }

    public String getCellphoneNumber() {
        return cellphoneNumber;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public static class Builder {

        private BaseInfoVo baseInfoVo;
        private Long code;
        private String cellphoneNumber;

        public Builder(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
        }


        public Long getCode() {
            return code;
        }

        public Builder setCode(Long code) {
            this.code = code;
            return this;
        }

        public String getCellphoneNumber() {
            return cellphoneNumber;
        }

        public Builder setCellphoneNumber(String cellphoneNumber) {
            this.cellphoneNumber = cellphoneNumber;
            return this;
        }

        public BaseInfoVo getBaseInfoVo() {
            return baseInfoVo;
        }

        public Builder setBaseInfoVo(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
            return this;
        }

        public ConfirmEditProfileVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.code!=null && this.cellphoneNumber!=null)
                return new ConfirmEditProfileVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}


