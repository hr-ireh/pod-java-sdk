package com.fanap.podBaseService.data.modelVo;

import com.fanap.podBaseService.exception.PodException;
import com.fanap.podBaseService.util.ScProductIdPodServicesProduction;
import com.fanap.podBaseService.util.ScProductIdPodServicesSandBox;
import com.fanap.podBaseService.util.TypeConversionUtil;

import static com.fanap.podBaseService.enums.Enum_Server_type.PRODUCTION;

/**
 * Created by Z.gholinia on 9/2/2019.
 */
public class GetTagTreeListVo {


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, serverType, levelCount and categoryId are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String categoryId;
    private String parentId;
    private String levelCount;
    private String level;
    private String id;
    private static String scProductId;


    public GetTagTreeListVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_BIZ_GET_TAG_TREE_LIST);
        else
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_BIZ_GET_TAG_TREE_LIST);
        this.categoryId = TypeConversionUtil.longToString(builder.getCategoryId());
        this.parentId = TypeConversionUtil.longToString(builder.getParentId());
        this.levelCount = TypeConversionUtil.intToString(builder.getLevelCount());
        this.level = TypeConversionUtil.intToString(builder.getLevel());
        this.id = TypeConversionUtil.longToString(builder.getId());

    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getId() {
        return id;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public String getParentId() {
        return parentId;
    }

    public String getLevelCount() {
        return levelCount;
    }

    public String getLevel() {
        return level;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public static class Builder {

        private BaseInfoVo baseInfoVo;
        private Long categoryId;
        private Long parentId;
        private Integer levelCount;
        private Integer level;
        private Long id;


        public Builder(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
        }

        public Long getId() {
            return id;
        }

        public Builder setId(Long id) {
            this.id = id;
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

        public Integer getLevelCount() {
            return levelCount;
        }

        public Builder setLevelCount(Integer levelCount) {
            this.levelCount = levelCount;
            return this;
        }

        public Integer getLevel() {
            return level;
        }

        public Builder setLevel(Integer level) {
            this.level = level;
            return this;
        }

        public BaseInfoVo getBaseInfoVo() {
            return baseInfoVo;
        }

        public Builder setBaseInfoVo(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
            return this;
        }

        public GetTagTreeListVo build() throws PodException {
            if (this.baseInfoVo != null &&
                    this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.baseInfoVo.getServerType() != null)
                if (this.levelCount != null &&
                        this.categoryId != null && this.level != null)
                    return new GetTagTreeListVo(this);
                else if (this.levelCount != null &&
                        this.categoryId != null && this.parentId != null)
                    return new GetTagTreeListVo(this);

            if (this.id != null)
                return new GetTagTreeListVo(this);

            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}
