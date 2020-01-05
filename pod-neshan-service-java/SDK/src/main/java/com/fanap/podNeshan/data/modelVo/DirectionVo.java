package com.fanap.podNeshan.data.modelVo;

import com.fanap.podNeshan.exception.PodException;
import com.fanap.podNeshan.util.NeshanProductId;
import com.fanap.podNeshan.util.Point;
import com.fanap.podNeshan.util.TypeConversionUtil;

/**
 * Created by Z.gholinia on 9/22/2019.
 */
public class DirectionVo{


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, ServerType,productId,apiKey, origin , destination are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String origin;
    private String destination;
    private String waypoints;
    private String avoidTrafficZone;
    private String avoidOddEvenZone;
    private String alternative;
    private static String scProductId;

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public String getWaypoints() {
        return waypoints;
    }

    public String getAvoidTrafficZone() {
        return avoidTrafficZone;
    }

    public String getAvoidOddEvenZone() {
        return avoidOddEvenZone;
    }

    public String getAlternative() {
        return alternative;
    }

    public  String getScProductId() {
        return scProductId;
    }

    public DirectionVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.scProductId = TypeConversionUtil.intToString(NeshanProductId.DIRECTION);
        this.origin = builder.getOrigin();
        this.destination = builder.getDestination();
        this.waypoints = builder.getWaypoints();
        this.avoidTrafficZone = TypeConversionUtil.booleanToString(builder.getAvoidTrafficZone());
        this.avoidOddEvenZone = TypeConversionUtil.booleanToString(builder.getAvoidOddEvenZone());
        this.alternative = TypeConversionUtil.booleanToString(builder.getAlternative());

    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private String origin;
        private String destination;
        private String waypoints;
        private Boolean avoidTrafficZone;
        private Boolean avoidOddEvenZone;
        private Boolean alternative;


        public String getOrigin() {
            return origin;
        }

        public Builder setOrigin(Point[] origin) {
            this.origin = creatStringPoint(origin);
            return this;
        }

        public String getDestination() {
            return destination;
        }

        public Builder setDestination(Point[] destination) {

            this.destination = creatStringPoint(destination);
            return this;
        }

        public String getWaypoints() {
            return waypoints;
        }


        public Builder setWaypoints(Point[] waypoints) {

            this.waypoints = creatStringPoint(waypoints);
            return this;

        }


        public Boolean getAvoidTrafficZone() {
            return avoidTrafficZone;
        }

        public Builder setAvoidTrafficZone(Boolean avoidTrafficZone) {
            this.avoidTrafficZone = avoidTrafficZone;
            return this;
        }

        public Boolean getAvoidOddEvenZone() {
            return avoidOddEvenZone;
        }

        public Builder setAvoidOddEvenZone(Boolean avoidOddEvenZone) {
            this.avoidOddEvenZone = avoidOddEvenZone;
            return this;
        }

        public Boolean getAlternative() {
            return alternative;
        }

        public Builder setAlternative(Boolean alternative) {
            this.alternative = alternative;
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

        public DirectionVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null &&
                    this.baseInfoVo.getScApiKey() != null && this.origin != null && this.destination != null)
                return new DirectionVo(this);
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



