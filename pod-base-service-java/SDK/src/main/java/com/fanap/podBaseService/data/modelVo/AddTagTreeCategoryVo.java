package com.fanap.podBaseService.data.modelVo;

import com.fanap.podBaseService.exception.PodException;
import com.fanap.podBaseService.util.ScProductIdPodServicesProduction;
import com.fanap.podBaseService.util.ScProductIdPodServicesSandBox;
import com.fanap.podBaseService.util.TypeConversionUtil;

import static com.fanap.podBaseService.enums.Enum_Server_type.PRODUCTION;

/**
 * Created by Z.gholinia on 9/2/2019.
 */

public class AddTagTreeCategoryVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, serverType, name  are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String name;
    private String desc;
    private static String scProductId;


    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public AddTagTreeCategoryVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.name = builder.getName();
        this.desc = builder.getDesc();
        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_BIZ_ADD_TAG_TREE_CATEGORY);
        else
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_BIZ_ADD_TAG_TREE_CATEGORY);
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private String name;
        private String desc;


        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public String getDesc() {
            return desc;
        }

        public Builder setDesc(String desc) {
            this.desc = desc;
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

        public AddTagTreeCategoryVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.baseInfoVo.getServerType() != null &&
                    this.name != null)
                return new AddTagTreeCategoryVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }


}



