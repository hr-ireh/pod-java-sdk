package com.fanap.billingService.data.modelVo;


import com.fanap.billingService.exception.PodException;
import com.fanap.podBaseService.util.ScProductIdPodServicesSandBox;
import com.fanap.podBaseService.util.TypeConversionUtil;

import java.math.BigDecimal;

public class InvoiceItemVO {
    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer are required parameters!";
    private BaseInfoVo baseInfoVo;
    private String productId;
    private String bigDecimalPrice;
    private String quantity;
    private String description;
    private String price;


    public InvoiceItemVO(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.productId = TypeConversionUtil.longToString(builder.getProductId());
        this.bigDecimalPrice = TypeConversionUtil.decimalToString(builder.getBigDecimalPrice());
        this.quantity = TypeConversionUtil.decimalToString(builder.getQuantity());
        this.description = builder.getDescription();
        this.price = TypeConversionUtil.longToString(builder.getPrice());

    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }


    public String getProductId() {
        return productId;
    }

    public String getBigDecimalPrice() {
        return bigDecimalPrice;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getDescription() {
        return description;
    }

    public String getPrice() {
        return price;
    }


    public static class Builder {

        private BaseInfoVo baseInfoVo;
        private Long productId;
        private BigDecimal bigDecimalPrice;
        private BigDecimal quantity;
        private String description;
        private Long price;

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


        public Long getProductId() {
            return productId;
        }

        public Builder setProductId(Long productId) {
            this.productId = productId;
            return this;
        }

        public BigDecimal getBigDecimalPrice() {
            return bigDecimalPrice;
        }

        public Builder setBigDecimalPrice(BigDecimal bigDecimalPrice) {
            this.bigDecimalPrice = bigDecimalPrice;
            return this;
        }

        public BigDecimal getQuantity() {
            return quantity;
        }

        public Builder setQuantity(BigDecimal quantity) {
            this.quantity = quantity;
            return this;
        }

        public String getDescription() {
            return description;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Long getPrice() {
            return price;
        }

        public Builder setPrice(Long price) {
            this.price = price;
            return this;
        }

        public InvoiceItemVO build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null)
                return new InvoiceItemVO(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}





