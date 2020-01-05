package com.fanap.podProduct.data.modelVo;

import com.fanap.podBaseService.exception.PodException;
import com.fanap.podProduct.util.ScProductIdPodServicesSandBox;
import com.fanap.podBaseService.util.TypeConversionUtil;
import com.fanap.podProduct.util.ScProductIdPodServicesProduction;

import java.util.List;

import static com.fanap.podBaseService.enums.Enum_Server_type.PRODUCTION;

/**
 * Created by Z.gholinia on 9/11/2019.
 */

public class ProductListVo {


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, (offset or lastId or firstId) are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String businessId;
    private List<String> id;
    private List<String> uniqueId;
    private List<String> categoryCode;
    private List<String> guildCode;
    private String currencyCode;
    private String firstId;
    private String lastId;
    private String offset;
    private String size;
    private String attributeTemplateCode;
    private List<String> attributeCode;
    private List<String> attributeValue;
    private String orderByLike;
    private String orderBySale;
    private String orderByPrice;
    private List<String> tags;
    private List<String> tagTrees;
    private static String scProductId;


    public String getBusinessId() {
        return businessId;
    }

    public List<String> getId() {
        return id;
    }

    public List<String> getUniqueId() {
        return uniqueId;
    }

    public List<String> getCategoryCode() {
        return categoryCode;
    }

    public List<String> getGuildCode() {
        return guildCode;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public String getFirstId() {
        return firstId;
    }

    public String getLastId() {
        return lastId;
    }

    public String getOffset() {
        return offset;
    }

    public String getSize() {
        return size;
    }

    public String getAttributeTemplateCode() {
        return attributeTemplateCode;
    }

    public List<String> getAttributeCode() {
        return attributeCode;
    }

    public List<String> getAttributeValue() {
        return attributeValue;
    }

    public String getOrderByLike() {
        return orderByLike;
    }

    public String getOrderBySale() {
        return orderBySale;
    }

    public String getOrderByPrice() {
        return orderByPrice;
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

    public ProductListVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.businessId = TypeConversionUtil.longToString(builder.getBusinessId());
        this.id = TypeConversionUtil.longToString(builder.getId());
        this.uniqueId = builder.getUniqueId();
        this.categoryCode = builder.getCategoryCode();
        this.guildCode = builder.getGuildCode();
        this.currencyCode = builder.getCurrencyCode();
        this.firstId = TypeConversionUtil.longToString(builder.getFirstId());
        this.lastId = TypeConversionUtil.longToString(builder.getLastId());
        this.offset = TypeConversionUtil.intToString(builder.getOffset());
        this.size = TypeConversionUtil.intToString(builder.getSize());
        this.attributeTemplateCode = builder.getAttributeTemplateCode();
        this.attributeCode = builder.getAttributeCode();
        this.attributeValue = builder.getAttributeValue();
        this.orderByLike = builder.getOrderBySale();
        this.orderByPrice = builder.getOrderByPrice();
        this.tags = builder.getTags();
        this.tagTrees = builder.getTagTrees();
        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_BIZ_PRODUCT_LIST);
        else
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_BIZ_PRODUCT_LIST);


    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private Long businessId;
        private List<Long> id;
        private List<String> uniqueId;
        private List<String> categoryCode;
        private List<String> guildCode;
        private String currencyCode;
        private Long firstId;
        private Long lastId;
        private Integer offset;
        private Integer size;
        private String attributeTemplateCode;
        private List<String> attributeCode;
        private List<String> attributeValue;
        private String orderByLike;
        private String orderBySale;
        private String orderByPrice;
        private List<String> tags;
        private List<String> tagTrees;

        public Long getBusinessId() {
            return businessId;
        }


        public Builder setBusinessId(Long businessId) {
            this.businessId = businessId;
            return this;
        }

        public List<Long> getId() {
            return id;
        }

        public Builder setId(List<Long> id) {
            this.id = id;
            return this;
        }

        public List<String> getUniqueId() {
            return uniqueId;
        }

        public Builder setUniqueId(List<String> uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }

        public List<String> getCategoryCode() {
            return categoryCode;
        }

        public Builder setCategoryCode(List<String> categoryCode) {
            this.categoryCode = categoryCode;
            return this;
        }

        public List<String> getGuildCode() {
            return guildCode;
        }

        public Builder setGuildCode(List<String> guildCode) {
            this.guildCode = guildCode;
            return this;
        }

        public String getCurrencyCode() {
            return currencyCode;
        }

        public Builder setCurrencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
            return this;
        }

        public Long getFirstId() {
            return firstId;
        }

        public Builder setFirstId(Long firstId) {
            this.firstId = firstId;
            return this;
        }

        public Long getLastId() {
            return lastId;
        }

        public Builder setLastId(Long lastId) {
            this.lastId = lastId;
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

        public String getAttributeTemplateCode() {
            return attributeTemplateCode;
        }

        public Builder setAttributeTemplateCode(String attributeTemplateCode) {
            this.attributeTemplateCode = attributeTemplateCode;
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

        public String getOrderByLike() {
            return orderByLike;
        }

        public Builder setOrderByLike(String orderByLike) {
            this.orderByLike = orderByLike;
            return this;
        }

        public String getOrderBySale() {
            return orderBySale;
        }

        public Builder setOrderBySale(String orderBySale) {
            this.orderBySale = orderBySale;
            return this;
        }

        public String getOrderByPrice() {
            return orderByPrice;
        }

        public Builder setOrderByPrice(String orderByPrice) {
            this.orderByPrice = orderByPrice;
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

        public ProductListVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null && this.baseInfoVo.getServerType()!=null &&
                    this.baseInfoVo.getToken_issuer() != null) {
                if (this.firstId == null && this.lastId == null && this.offset == null) {
                    throw PodException.invalidParameter("firstId or lastId or offset must be specified");
                } else return new ProductListVo(this);
            } else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }


}
