package com.fanap.podNeshan.data.modelVo;

import com.fanap.podNeshan.exception.PodException;
import com.fanap.podNeshan.util.NeshanProductId;
import com.fanap.podNeshan.util.Point;
import com.fanap.podNeshan.util.TypeConversionUtil;

import java.util.List;

/**
 * Created by Z.gholinia on 9/22/2019.
 */
public class DistanceMatrixVo {


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, serverType,productId,apiKey, origins , destinations  are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String origins;
    private String destinations;
    private static String scProductId;


    public String getOrigins() {
        return origins;
    }

    public String getDestinations() {
        return destinations;
    }

    public  String getScProductId() {
        return scProductId;
    }

    public DistanceMatrixVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.scProductId = TypeConversionUtil.intToString(NeshanProductId.DISTANCE_MATRIX);
        this.origins = builder.getOrigins();
        this.destinations = builder.getDestinations();


    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private String origins;
        private String destinations;


        public String getOrigins() {
            return origins;
        }

        public Builder setOrigins(Point[] origins) throws PodException {

            this.origins = creatStringPoint(origins);
            return this;

        }

        public String getDestinations() {
            return destinations;
        }

        public Builder setDestinations(Point[] destinations) {
            this.destinations = creatStringPoint(destinations);
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

        public DistanceMatrixVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null &&
                    this.baseInfoVo.getScApiKey() != null && this.origins != null && this.destinations != null)
                return new DistanceMatrixVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }




    public static String creatStringPoint(Point[] doublePoints) {
        String result = "";
        for (int i = 0; i < doublePoints.length; i++) {
            result += doublePoints[i] + "|";

        }
        return result = result.substring(0, result.length() - 1);
    }

}

