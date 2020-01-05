package com.fanap.podBank.data.modelVo;

import com.fanap.podBank.util.RSAUtil;
import com.fanap.podBank.util.ScProductIdPodServicesProduction;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.podBaseService.util.TypeConversionUtil;
import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static javax.xml.bind.DatatypeConverter.printBase64Binary;

public class GetShebaAndStatusVo {


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer,Signature serverType, apiKey ,userName,sheba are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String UserName;
    private String Sheba;
    private String ShenaseVariz;
    private String Timestamp;
    private String SignatureInfo;
    private static String scProductId;
    private static String signStrig;


    public GetShebaAndStatusVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.UserName = builder.getUserName();
        this.Sheba = builder.getSheba();
        this.ShenaseVariz = builder.getShenaseVariz();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss:SSS");
        LocalDateTime now = LocalDateTime.now();
        this.Timestamp = dtf.format(now);
        Gson gson = new GsonBuilder()
                .addSerializationExclusionStrategy(strategy)
                .create();
        signStrig = gson.toJson(this);
        try {
            this.SignatureInfo = printBase64Binary(RSAUtil.sign(RSAUtil.XML2PrivateKey(builder.getSignatureInfo().getPrivateKey()), signStrig.getBytes("UTF-8")));
        } catch (Exception e) {
            e.printStackTrace();
        }
//        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
        this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_GET_SSHEBA_AND_STATUS);
//        else
//            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_GET_SHEBA_INFO);


    }

    public String getSheba() {
        return Sheba;
    }

    public String getShenaseVariz() {
        return ShenaseVariz;
    }

    public static String getSignStrig() {
        return signStrig;
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getScProductId() {
        return scProductId;
    }

    public String getUserName() {
        return UserName;
    }


    public String getTimestamp() {
        return Timestamp;
    }

    public String getSignatureInfo() {
        return SignatureInfo;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private String UserName;
        private String Sheba;
        private String ShenaseVariz;
        private SignatureInfo SignatureInfo;

        public String getSheba() {
            return Sheba;
        }

        public Builder setSheba(String sheba) {
            Sheba = sheba;
            return this;
        }

        public String getShenaseVariz() {
            return ShenaseVariz;
        }

        public Builder setShenaseVariz(String shenaseVariz) {
            ShenaseVariz = shenaseVariz;
            return this;
        }

        public SignatureInfo getSignatureInfo() {
            return SignatureInfo;
        }

        public Builder setSignatureInfo(SignatureInfo signatureInfo) {
            SignatureInfo = signatureInfo;
            return this;
        }

        public String getUserName() {
            return UserName;
        }

        public Builder setUserName(String UserName) {
            this.UserName = UserName;
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

        public GetShebaAndStatusVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null && this.SignatureInfo != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.UserName != null && this.baseInfoVo.getServerType() != null
                    && this.Sheba != null && this.baseInfoVo.getScApiKey() != null)
                return new GetShebaAndStatusVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }

    ExclusionStrategy strategy = new ExclusionStrategy() {

        public boolean shouldSkipField(FieldAttributes field) {
            if (field.getDeclaringClass() == GetShebaAndStatusVo.class && field.getName().equals("baseInfoVo")) {
                return true;
            }
            if (field.getDeclaringClass() == GetShebaAndStatusVo.class && field.getName().equals("signature")) {
                return true;
            }
            if (field.getDeclaringClass() == GetShebaAndStatusVo.class && field.getName().equals("signStrig")) {
                return true;
            }
            if (field.getDeclaringClass() == GetShebaAndStatusVo.class && field.getName().equals("scProductId")) {
                return true;
            }
            return false;
        }

        public boolean shouldSkipClass(Class<?> clazz) {
            return false;
        }
    };

}


