package com.fanap.userOperation.data.modelVo;

import com.fanap.userOperation.exception.PodException;
import com.fanap.userOperation.util.PodServicesEnum;
import com.fanap.userOperation.util.TypeConversionUtil;


/**
 * Created by Z.Gholinia on 10/12/2019.
 */
public class GetUserProfileVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token and token_issuer are required parameters!";

    private BaseInfoVo baseInfoVo;
    private static String scProductId;


    public GetUserProfileVo(Builder builder) {
        super();
        this.baseInfoVo = builder.getBaseInfoVo();
        this.scProductId = TypeConversionUtil.intToString(PodServicesEnum.NZH_GET_USER_PROFILE);

    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public static class Builder {

        private BaseInfoVo baseInfoVo;

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

        public GetUserProfileVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null)
                return new GetUserProfileVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}
