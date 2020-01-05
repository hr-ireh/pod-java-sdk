package com.fanap.podNeshan.data.modelVo;

import com.fanap.podNeshan.exception.PodException;
import com.fanap.podNeshan.util.NeshanProductId;
import com.fanap.podNeshan.util.TypeConversionUtil;

import java.util.List;

/**
 * Created by Z.gholinia on 9/22/2019.
 */

public class SearchVo  {


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, serverType ,productId,apiKey, lat , lng and term are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String term;
    private String lat;
    private String lng;
    private static String scProductId;

    public String getTerm() {
        return term;
    }

    public String getLat() {
        return lat;
    }

    public String getLng() {
        return lng;
    }

    public String getScProductId() {
        return scProductId;
    }

    public SearchVo(Builder builder) {
        super();
        this.baseInfoVo = builder.getBaseInfoVo();
        this.term = builder.getTerm();
        this.lat = TypeConversionUtil.doubleToString(builder.getLat());
        this.lng = TypeConversionUtil.doubleToString(builder.getLng());
        this.scProductId = TypeConversionUtil.intToString(NeshanProductId.SEARCH);

    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private String term;
        private Double lat;
        private Double lng;


        public String getTerm() {
            return term;
        }

        public Builder setTerm(String term) {
            this.term = term;
            return this;
        }

        public Double getLat() {
            return lat;
        }

        public Builder setLat(Double lat) {
            this.lat = lat;
            return this;
        }

        public Double getLng() {
            return lng;
        }

        public Builder setLng(Double lng) {
            this.lng = lng;
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

        public SearchVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null &&
                    this.term != null && this.lat != null && this.lng != null)
                return new SearchVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }


}
