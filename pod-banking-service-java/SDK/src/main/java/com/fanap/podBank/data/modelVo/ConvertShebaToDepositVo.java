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

/**
 * Created by Z.gholinia on 11/9/2019.
 */
public class ConvertShebaToDepositVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer,Signature serverType , userName, apiKey, sheba are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String UserName;
    private String Sheba;
    private String Timestamp;
    private String Signature;
    private static String scProductId;
    private String signStrig;

    public ConvertShebaToDepositVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.UserName = builder.getUserName();
        this.Sheba = builder.getSheba();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss:SSS");
        LocalDateTime now = LocalDateTime.now();
        this.Timestamp = dtf.format(now);
        Gson gson = new GsonBuilder()
                .addSerializationExclusionStrategy(strategy)
                .create();
        signStrig = gson.toJson(this);
        try {
            this.Signature = printBase64Binary(RSAUtil.sign(RSAUtil.XML2PrivateKey(builder.getSignature().getPrivateKey()), signStrig.getBytes("UTF-8")));
        } catch (Exception e) {
            e.printStackTrace();
        }
//        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
        this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.CONVERT_SHEBA_TO_DEPOSIT_NUMBER);
//        else
//            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_GET_SHEBA_INFO);


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

    public String getSheba() {
        return Sheba;
    }

    public String getTimestamp() {
        return Timestamp;
    }

    public String getSignature() {
        return Signature;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private String UserName;
        private String Sheba;
        private SignatureInfo Signature;

        public String getUserName() {
            return UserName;
        }

        public Builder setUserName(String UserName) {
            this.UserName = UserName;
            return this;
        }


        public SignatureInfo getSignature() {
            return Signature;
        }

        public Builder setSignature(SignatureInfo signature) {
            Signature = signature;
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

        public String getSheba() {
            return Sheba;
        }

        public Builder setSheba(String sheba) {
            Sheba = sheba;
            return this;
        }

        public ConvertShebaToDepositVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null && this.Signature!=null &&
                    this.baseInfoVo.getToken_issuer() != null && this.Sheba != null && this.UserName != null && this.baseInfoVo.getServerType() != null)
                return new ConvertShebaToDepositVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }

    ExclusionStrategy strategy = new ExclusionStrategy() {

        public boolean shouldSkipField(FieldAttributes field) {
            if (field.getDeclaringClass() == ConvertShebaToDepositVo.class && field.getName().equals("baseInfoVo")) {
                return true;
            }
            if (field.getDeclaringClass() == ConvertShebaToDepositVo.class && field.getName().equals("signature")) {
                return true;
            }
            if (field.getDeclaringClass() == ConvertShebaToDepositVo.class && field.getName().equals("signStrig")) {
                return true;
            }
            if (field.getDeclaringClass() == ConvertShebaToDepositVo.class && field.getName().equals("scProductId")) {
                return true;
            }
            return false;
        }

        public boolean shouldSkipClass(Class<?> clazz) {
            return false;
        }
    };
}
