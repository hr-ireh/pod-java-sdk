package com.fanap.podDealing.data.modelVo;

import com.fanap.podBaseService.exception.PodException;
import com.fanap.podDealing.util.ScProductIdPodServicesProduction;
import com.fanap.podDealing.util.ScProductIdPodServicesSandBox;
import com.fanap.podBaseService.util.TypeConversionUtil;
/**
 * Created by Z.gholinia on 7/31/2019.
 */

import java.util.List;

import static com.fanap.podBaseService.enums.Enum_Server_type.PRODUCTION;

public class UserBusinessInfosVo {


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer and id are required parameters!";

    private BaseInfoVo baseInfoVo;
    private List<String> id;
    private static String scProductId;


    public UserBusinessInfosVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.id = TypeConversionUtil.longToString(builder.getId());
        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_USER_BUSINESS_INFOS);
        else
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_USER_BUSINESS_INFOS);


    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public List<String> getId() {
        return id;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private List<Long> id;


        public List<Long> getId() {
            return id;
        }

        public Builder setId(List<Long> id) {
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

        public UserBusinessInfosVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null &&
                    this.id != null)
                return new UserBusinessInfosVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }


}





