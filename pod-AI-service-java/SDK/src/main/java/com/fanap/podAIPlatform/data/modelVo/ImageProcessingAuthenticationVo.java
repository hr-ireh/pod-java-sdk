package com.fanap.podAIPlatform.data.modelVo;

import com.fanap.podAIPlatform.enums.EnumMode;
import com.fanap.podAIPlatform.util.ScProductIdPodServicesProduction;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.podBaseService.util.TypeConversionUtil;

/**
 * Created by Z.gholinia on 01/05/2020.
 */
public class ImageProcessingAuthenticationVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, image1, apiKey, image2, mode are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String image1;
    private String image2;
    private String mode;
    private static String scProductId;

    public ImageProcessingAuthenticationVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.image1 = builder.getImage1();
        this.image2 = builder.getImage2();
        this.mode = builder.getMode();
//            if (getBaseInfoVo().getServerType().equals(PRODUCTION))
        this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.IMAGE_PROCESSING_AUTHENTICATION);
//            else
//                this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_GET_SHEBA_INFO);

    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getScProductId() {
        return scProductId;
    }

    public String getImage1() {
        return image1;
    }

    public String getImage2() {
        return image2;
    }

    public String getMode() {
        return mode;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private String image1;
        private String image2;
        private String mode;

        public String getImage1() {
            return image1;
        }

        public Builder setImage1(String image1) {
            this.image1 = image1;
            return this;
        }

        public String getImage2() {
            return image2;
        }

        public Builder setImage2(String image2) {
            this.image2 = image2;
            return this;
        }

        public String getMode() {
            return mode;
        }

        public Builder setMode(EnumMode mode) {
            this.mode = mode.getValue();
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

        public ImageProcessingAuthenticationVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.baseInfoVo.getScApiKey() != null && this.image1 != null
                    && this.image2 != null && this.mode != null)
                return new ImageProcessingAuthenticationVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }


}

