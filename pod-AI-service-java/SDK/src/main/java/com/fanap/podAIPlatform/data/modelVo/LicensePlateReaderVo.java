package com.fanap.podAIPlatform.data.modelVo;

import com.fanap.podAIPlatform.util.ScProductIdPodServicesProduction;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.podBaseService.util.TypeConversionUtil;

public class LicensePlateReaderVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, ApiKey, isCrop , image, are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String image;
    private String isCrop;
    private static String scProductId;

    public LicensePlateReaderVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.image = builder.getImage();
        this.isCrop = TypeConversionUtil.booleanToString(builder.getCrop());
//            if (getBaseInfoVo().getServerType().equals(PRODUCTION))
        this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.LICENSE_PLATE_READER);
//            else
//                this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_GET_SHEBA_INFO);

    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getScProductId() {
        return scProductId;
    }

    public String getImage() {
        return image;
    }

    public String getIsCrop() {
        return isCrop;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private String image;
        private Boolean isCrop;

        public String getImage() {
            return image;
        }

        public Builder setImage(String image) {
            this.image = image;
            return this;
        }

        public Boolean getCrop() {
            return isCrop;
        }

        public Builder setCrop(Boolean crop) {
            isCrop = crop;
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

        public LicensePlateReaderVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.baseInfoVo.getScApiKey() != null &&
                    this.image != null && this.isCrop != null)
                return new LicensePlateReaderVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }

}
