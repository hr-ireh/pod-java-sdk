package com.fanap.podProduct.data.modelVo;

import com.fanap.podBaseService.exception.PodException;
import com.fanap.podProduct.util.ScProductIdPodServicesSandBox;
import com.fanap.podBaseService.util.TypeConversionUtil;
import com.fanap.podProduct.util.ScProductIdPodServicesProduction;

import java.util.List;

import static com.fanap.podBaseService.enums.Enum_Server_type.PRODUCTION;

public class SearchSubProductVo {


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, offset and  productGroupId are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String q;
    private List<String> productGroupId;
    private List<String> uniqueId;
    private String offset;
    private String size;
    private List<String> attributeCode;
    private List<String> attributeValue;
    private String orderByAttributeCode;
    private String orderByDirection;
    private List<String> tags;
    private List<String> tagTrees;
    private static String scProductId;


    public String getQ() {
        return q;
    }

    public List<String> getProductGroupId() {
        return productGroupId;
    }

    public List<String> getUniqueId() {
        return uniqueId;
    }


    public String getOffset() {
        return offset;
    }

    public String getSize() {
        return size;
    }

    public List<String> getAttributeCode() {
        return attributeCode;
    }

    public List<String> getAttributeValue() {
        return attributeValue;
    }

    public String getOrderByAttributeCode() {
        return orderByAttributeCode;
    }

    public String getOrderByDirection() {
        return orderByDirection;
    }

    public List<String> getTags() {
        return tags;
    }

    public List<String> getTagTrees() {
        return tagTrees;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public SearchSubProductVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.q = builder.getQuery();
        this.productGroupId = TypeConversionUtil.longToString(builder.getProductGroupId());
        this.offset = TypeConversionUtil.intToString(builder.getOffset());
        this.size = TypeConversionUtil.intToString(builder.getSize());
        this.attributeCode = builder.getAttributeCode();
        this.attributeValue = builder.getAttributeValue();
        this.orderByAttributeCode = builder.getOrderByAttributeCode();
        this.orderByDirection = builder.getOrderByDirection();
        this.tags = builder.getTags();
        this.tagTrees = builder.getTagTrees();
        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_SEARCH_SUB_PRODUCT);
        else
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_SEARCH_SUB_PRODUCT);


    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private String q;
        private List<Long> productGroupId;
        private Integer offset;
        private Integer size;
        private List<String> attributeCode;
        private List<String> attributeValue;
        private String orderByAttributeCode;
        private String orderByDirection;
        private List<String> tags;
        private List<String> tagTrees;

        public String getQuery() {
            return q;
        }


        public Builder setQuery(String q) {
            this.q = q;
            return this;
        }

        public List<Long> getProductGroupId() {
            return productGroupId;
        }

        public Builder setProductGroupId(List<Long> productGroupId) {
            this.productGroupId = productGroupId;
            return this;
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


        public List<String> getAttributeCode() {
            return attributeCode;
        }

        public Builder setAttributeCode(List<String> attributeCode) {
            this.attributeCode = attributeCode;
            return this;
        }

        public List<String> getAttributeValue() {
            return attributeValue;
        }

        public Builder setAttributeValue(List<String> attributeValue) {
            this.attributeValue = attributeValue;
            return this;
        }

        public String getOrderByAttributeCode() {
            return orderByAttributeCode;
        }

        public Builder setOrderByAttributeCode(String orderByAttributeCode) {
            this.orderByAttributeCode = orderByAttributeCode;
            return this;
        }

        public String getOrderByDirection() {
            return orderByDirection;
        }

        public Builder setOrderByDirection(String orderByDirection) {
            this.orderByDirection = orderByDirection;
            return this;
        }

        public List<String> getTags() {
            return tags;
        }

        public Builder setTags(List<String> tags) {
            this.tags = tags;
            return this;
        }

        public List<String> getTagTrees() {
            return tagTrees;
        }

        public Builder setTagTrees(List<String> tagTrees) {
            this.tagTrees = tagTrees;
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

        public SearchSubProductVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.offset != null && this.productGroupId != null)
                return new SearchSubProductVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }

}

