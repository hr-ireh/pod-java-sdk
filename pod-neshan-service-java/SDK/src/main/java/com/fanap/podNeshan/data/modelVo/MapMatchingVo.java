package com.fanap.podNeshan.data.modelVo;

import com.fanap.podNeshan.exception.PodException;
import com.fanap.podNeshan.util.NeshanProductId;
import com.fanap.podNeshan.util.Point;
import com.fanap.podNeshan.util.TypeConversionUtil;

import java.util.List;

/**
 * Created by Z.gholinia on 9/22/2019.
 */
public class MapMatchingVo {


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, serverType ,productId,apiKey, path are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String path;
    private static String scProductId;


    public String getPath() {
        return path;
    }

    public  String getScProductId() {
        return scProductId;
    }

    public MapMatchingVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.scProductId = TypeConversionUtil.intToString(NeshanProductId.MAP_MATCHING);
        this.path = builder.getPath();


    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public static class Builder{
        private BaseInfoVo baseInfoVo;
        private String path;


        public String getPath() {
            return path;
        }

        public Builder setPath(Point[] path) {
            this.path = creatStringPoint(path);
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

        public MapMatchingVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null &&
                    this.baseInfoVo.getScApiKey() != null && this.path != null)
                return new MapMatchingVo(this);
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
