package com.fanap.podProduct.data.modelVo;

import com.fanap.podBaseService.exception.PodException;
import com.fanap.podBaseService.util.JsonUtil;
import com.fanap.podProduct.util.ScProductIdPodServicesSandBox;
import com.fanap.podBaseService.util.TypeConversionUtil;
import com.fanap.podProduct.util.ScProductIdPodServicesProduction;

import java.util.List;

import static com.fanap.podBaseService.enums.Enum_Server_type.PRODUCTION;

/**
 * Created by Z.gholinia on 9/11/2019.
 */

public class UpdateProductsVo {


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, data and (description , canLike, canComment, enable) in data are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String changePreview;
    private String data;
    private String previewImage;
    private String currencyCode;
    private static String scProductId;

    public String getChangePreview() {
        return changePreview;
    }

    public String getData() {
        return data;
    }

    public String getPreviewImage() {
        return previewImage;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public UpdateProductsVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.changePreview = TypeConversionUtil.booleanToString(builder.getChangePreview());
        this.data = builder.getData();
        this.previewImage = builder.getPreviewImage();
        this.currencyCode = builder.getCurrencyCode();
        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_BIZ_UPDATE_PRODUCTS);
        else
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_BIZ_UPDATE_PRODUCTS);

    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private Boolean changePreview;
        private String data;
        private String previewImage;
        private String currencyCode;


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

        public Boolean getChangePreview() {
            return changePreview;
        }

        public Builder setChangePreview(Boolean changePreview) {
            this.changePreview = changePreview;
            return this;
        }

        public String getData() {
            return data;
        }

        public Builder setData(List<AddProductVo> data) throws PodException {
            this.data = JsonUtil.getJson(data);
            if (!this.data.contains("description") || !this.data.contains("canLike") || !this.data.contains("canComment") || !this.data.contains("enable")) {
                throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
            }
            return this;
        }

        public String getPreviewImage() {
            return previewImage;
        }

        public Builder setPreviewImage(String previewImage) {
            this.previewImage = previewImage;
            return this;
        }

        public String getCurrencyCode() {
            return currencyCode;
        }

        public Builder setCurrencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
            return this;
        }

        public UpdateProductsVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.data != null)
                return new UpdateProductsVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }


}

