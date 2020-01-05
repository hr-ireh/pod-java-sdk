package com.fanap.podProduct.data.modelVo;

import com.fanap.podBaseService.exception.PodException;
import com.fanap.podProduct.util.ScProductIdPodServicesSandBox;
import com.fanap.podBaseService.util.TypeConversionUtil;
import com.fanap.podProduct.util.ScProductIdPodServicesProduction;

import java.math.BigDecimal;
import java.util.List;

import static com.fanap.podBaseService.enums.Enum_Server_type.PRODUCTION;

/**
 * Created by Z.gholinia on 9/11/2019.
 */

public class AddSubProductVo {


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer , name, canComment, canLike, enable, availableCount, price and discount are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String parentProductId;
    private String name;
    private String description;
    private String uniqueId;
    private String metadata;
    private String businessId;
    private String unlimited;
    private String availableCount;
    private String price;
    private String discount;
    private String guildCode;
    private String allowUserInvoice;
    private String allowUserPrice;
    private String currencyCode;
    private String attTemplateCode;
    private List<String> attCode;
    private List<String> attValue;
    private List<String> attGroup;
    private String groupId;
    private String content;
    private String previewImage;
    private String tagTreeCategoryName;
    private String preferredTaxRate;
    private String quantityPrecision;
    private static String scProductId;


    public String getParentProductId() {
        return parentProductId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public String getMetadata() {
        return metadata;
    }

    public String getBusinessId() {
        return businessId;
    }

    public String getUnlimited() {
        return unlimited;
    }

    public String getAvailableCount() {
        return availableCount;
    }

    public String getPrice() {
        return price;
    }

    public String getDiscount() {
        return discount;
    }

    public String getGuildCode() {
        return guildCode;
    }

    public String getAllowUserInvoice() {
        return allowUserInvoice;
    }

    public String getAllowUserPrice() {
        return allowUserPrice;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public String getAttTemplateCode() {
        return attTemplateCode;
    }

    public List<String> getAttCode() {
        return attCode;
    }

    public List<String> getAttValue() {
        return attValue;
    }

    public List<String> getAttGroup() {
        return attGroup;
    }

    public String getGroupId() {
        return groupId;
    }


    public String getContent() {
        return content;
    }

    public String getPreviewImage() {
        return previewImage;
    }

    public String getTagTreeCategoryName() {
        return tagTreeCategoryName;
    }

    public String getPreferredTaxRate() {
        return preferredTaxRate;
    }

    public String getQuantityPrecision() {
        return quantityPrecision;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public AddSubProductVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.parentProductId = TypeConversionUtil.longToString(builder.getParentProductId());
        this.name = builder.getName();
        this.description = builder.getDescription();
        this.uniqueId = builder.getUniqueId();
        this.metadata = builder.getMetadata();
        this.businessId = TypeConversionUtil.longToString(builder.getBusinessId());
        this.unlimited = TypeConversionUtil.booleanToString(builder.isUnlimited());
        this.availableCount = TypeConversionUtil.intToString(builder.getAvailableCount());
        this.price = TypeConversionUtil.decimalToString(builder.getPrice());
        this.discount = TypeConversionUtil.decimalToString(builder.getDiscount());
        this.guildCode = builder.getGuildCode();
        this.allowUserInvoice = TypeConversionUtil.booleanToString(builder.isAllowUserInvoice());
        this.allowUserPrice = TypeConversionUtil.booleanToString(builder.isAllowUserPrice());
        this.currencyCode = builder.getCurrencyCode();
        this.attTemplateCode = builder.getAttTemplateCode();
        this.attCode = builder.getAttCode();
        this.attValue = builder.getAttValue();
        this.attGroup = builder.getAttGroup();
        this.groupId = TypeConversionUtil.longToString(builder.getGroupId());
        this.content = builder.getContent();
        this.previewImage = builder.getPreviewImage();
        this.tagTreeCategoryName = builder.getTagTreeCategoryName();
        this.preferredTaxRate = TypeConversionUtil.doubleToString(builder.getPreferredTaxRate());
        this.quantityPrecision = TypeConversionUtil.doubleToString(builder.getQuantityPrecision());
        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_BIZ_ADD_PRODUCT);
        else
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_BIZ_ADD_PRODUCT);


    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private Long parentProductId;
        private String name;
        private String description;
        private String uniqueId;
        private String metadata;
        private Long businessId;
        private boolean unlimited;
        private Integer availableCount;
        private BigDecimal price;
        private BigDecimal discount;
        private String guildCode;
        private boolean allowUserInvoice;
        private boolean allowUserPrice;
        private String currencyCode;
        private String attTemplateCode;
        private List<String> attCode;
        private List<String> attValue;
        private List<String> attGroup;
        private Long groupId;
        private String content;
        private String previewImage;
        private String tagTreeCategoryName;
        private Double preferredTaxRate;
        private Double quantityPrecision;

        public Long getParentProductId() {
            return parentProductId;
        }


        public Builder setParentProductId(Long parentProductId) {
            this.parentProductId = parentProductId;
            return this;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public String getDescription() {
            return description;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public String getUniqueId() {
            return uniqueId;
        }

        public Builder setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }

        public String getMetadata() {
            return metadata;
        }

        public Builder setMetadata(String metadata) {
            this.metadata = metadata;
            return this;
        }

        public Long getBusinessId() {
            return businessId;
        }

        public Builder setBusinessId(Long businessId) {
            this.businessId = businessId;
            return this;
        }

        public boolean isUnlimited() {
            return unlimited;
        }

        public Builder setUnlimited(boolean unlimited) {
            this.unlimited = unlimited;
            return this;
        }

        public Integer getAvailableCount() {
            return availableCount;
        }

        public Builder setAvailableCount(Integer availableCount) {
            this.availableCount = availableCount;
            return this;
        }

        public BigDecimal getPrice() {
            return price;
        }

        public Builder setPrice(BigDecimal price) {
            this.price = price;
            return this;
        }

        public BigDecimal getDiscount() {
            return discount;
        }

        public Builder setDiscount(BigDecimal discount) {
            this.discount = discount;
            return this;
        }

        public String getGuildCode() {
            return guildCode;
        }

        public Builder setGuildCode(String guildCode) {
            this.guildCode = guildCode;
            return this;
        }

        public boolean isAllowUserInvoice() {
            return allowUserInvoice;
        }

        public Builder setAllowUserInvoice(boolean allowUserInvoice) {
            this.allowUserInvoice = allowUserInvoice;
            return this;
        }

        public boolean isAllowUserPrice() {
            return allowUserPrice;
        }

        public Builder setAllowUserPrice(boolean allowUserPrice) {
            this.allowUserPrice = allowUserPrice;
            return this;
        }

        public String getCurrencyCode() {
            return currencyCode;
        }

        public Builder setCurrencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
            return this;
        }

        public String getAttTemplateCode() {
            return attTemplateCode;
        }

        public Builder setAttTemplateCode(String attTemplateCode) {
            this.attTemplateCode = attTemplateCode;
            return this;
        }

        public List<String> getAttCode() {
            return attCode;
        }

        public Builder setAttCode(List<String> attCode) {
            this.attCode = attCode;
            return this;
        }

        public List<String> getAttValue() {
            return attValue;
        }

        public Builder setAttValue(List<String> attValue) {
            this.attValue = attValue;
            return this;
        }

        public List<String> getAttGroup() {
            return attGroup;
        }

        public Builder setAttGroup(List<String> attGroup) {
            this.attGroup = attGroup;
            return this;
        }

        public Long getGroupId() {
            return groupId;
        }

        public Builder setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }


        public String getContent() {
            return content;
        }

        public Builder setContent(String content) {
            this.content = content;
            return this;
        }

        public String getPreviewImage() {
            return previewImage;
        }

        public Builder setPreviewImage(String previewImage) {
            this.previewImage = previewImage;
            return this;
        }


        public String getTagTreeCategoryName() {
            return tagTreeCategoryName;
        }

        public Builder setTagTreeCategoryName(String tagTreeCategoryName) {
            this.tagTreeCategoryName = tagTreeCategoryName;
            return this;
        }

        public Double getPreferredTaxRate() {
            return preferredTaxRate;
        }

        public Builder setPreferredTaxRate(Double preferredTaxRate) {
            this.preferredTaxRate = preferredTaxRate;
            return this;
        }

        public Double getQuantityPrecision() {
            return quantityPrecision;
        }

        public Builder setQuantityPrecision(Double quantityPrecision) {
            this.quantityPrecision = quantityPrecision;
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

        public AddSubProductVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.baseInfoVo.getServerType()!=null &&
                    this.name != null && this.availableCount != null && this.price != null && this.discount != null)
                return new AddSubProductVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }


}
