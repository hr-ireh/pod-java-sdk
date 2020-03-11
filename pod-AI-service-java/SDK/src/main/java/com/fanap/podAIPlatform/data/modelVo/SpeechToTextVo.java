package com.fanap.podAIPlatform.data.modelVo;

import com.fanap.podAIPlatform.util.ScProductIdPodServicesProduction;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.podBaseService.util.TypeConversionUtil;

/**
 * Created by Z.gholinia on 01/05/2020.
 */
public class SpeechToTextVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, linkFile, apiKey are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String linkFile;
    private static String scProductId;

    public SpeechToTextVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.linkFile = builder.getLinkFile();
//            if (getBaseInfoVo().getServerType().equals(PRODUCTION))
        this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.SPEECH_TO_TEXT);
//            else
//                this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_GET_SHEBA_INFO);

    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getScProductId() {
        return scProductId;
    }

    public String getLinkFile() {
        return linkFile;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private String linkFile;

        public String getLinkFile() {
            return linkFile;
        }

        public Builder setLinkFile(String linkFile) {
            this.linkFile = linkFile;
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

        public SpeechToTextVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.baseInfoVo.getScApiKey() != null && this.linkFile != null)
                return new SpeechToTextVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }


}