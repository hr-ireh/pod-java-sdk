package com.fanap.podBaseService.data.modelVo;

import com.fanap.podBaseService.exception.PodException;
import com.fanap.podBaseService.util.ScProductIdPodServicesProduction;
import com.fanap.podBaseService.util.ScProductIdPodServicesSandBox;
import com.fanap.podBaseService.util.TypeConversionUtil;

import static com.fanap.podBaseService.enums.Enum_Server_type.PRODUCTION;

/**
 * Created by Z.gholinia on 9/2/2019.
 */
public class AddTagTreeVo {


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, serverType, categoryId  and name are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String name;
    private String categoryId;
    private String parentId;
    private static String scProductId;


    public String getName() {
        return name;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public String getParentId() {
        return parentId;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public AddTagTreeVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.name = builder.getName();
        this.categoryId = TypeConversionUtil.longToString(builder.getCategoryId());
        this.parentId = TypeConversionUtil.longToString(builder.getParentId());
        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_BIZ_ADD_TAG_TREE);
        else
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_BIZ_ADD_TAG_TREE);

    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private String name;
        private Long categoryId;
        private Long parentId;


        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Long getCategoryId() {
            return categoryId;
        }

        public Builder setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }

        public Long getParentId() {
            return parentId;
        }

        public Builder setParentId(Long parentId) {
            this.parentId = parentId;
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

        public AddTagTreeVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.baseInfoVo.getServerType() != null &&
                    this.name != null && this.categoryId != null)
                return new AddTagTreeVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }


}

