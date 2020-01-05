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
public class GetTranfserStateVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer,Signature, serverType ,userName,apiKey, paymentId, Date are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String UserName;
    private String Date;
    private String PaymentId;
    private String Timestamp;
    private String signature;
    private String signStrig;
    private static String scProductId;

    public GetTranfserStateVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.UserName = builder.getUserName();
        this.Date = builder.getDate();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss:SSS");
        LocalDateTime now = LocalDateTime.now();
        this.Timestamp = dtf.format(now);
        this.PaymentId = builder.getPaymentId();
        Gson gson = new GsonBuilder()
                .addSerializationExclusionStrategy(strategy)
                .create();
        signStrig = gson.toJson(this);
        try {
            this.signature = printBase64Binary(RSAUtil.sign(RSAUtil.XML2PrivateKey(builder.getSignature().getPrivateKey()), signStrig.getBytes("UTF-8")));
        } catch (Exception e) {
            e.printStackTrace();
        }

//            if (getBaseInfoVo().getServerType().equals(PRODUCTION))
        this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.GET_TRANSFER_STATE);
//            else
//                this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_GET_SHEBA_INFO);


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

    public String getDate() {
        return Date;
    }

    public String getPaymentId() {
        return PaymentId;
    }

    public String getSignature() {
        return signature;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private String UserName ;
        private String Date ;
        private String PaymentId ;
        private SignatureInfo signature;

        public String getDate() {
            return Date;
        }

        public Builder setDate(String date) {
            Date = date;
            return this;
        }

        public String getPaymentId() {
            return PaymentId;
        }

        public Builder setPaymentId(String paymentId) {
            PaymentId = paymentId;
            return this;
        }

        public String getUserName() {
            return UserName;
        }

        public Builder setUserName(String userName) {
            UserName = userName;
            return this;
        }

        public SignatureInfo getSignature() {
            return signature;
        }

        public Builder setSignature(SignatureInfo signature) {
            this.signature = signature;
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

        public GetTranfserStateVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null && this.signature!=null &&
                    this.baseInfoVo.getToken_issuer() != null && this.baseInfoVo.getServerType() != null
            && this.UserName!=null && this.Date!=null && this.PaymentId!=null && this.baseInfoVo.getScApiKey()!=null)
                return new GetTranfserStateVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }

    ExclusionStrategy strategy = new ExclusionStrategy() {

        public boolean shouldSkipField(FieldAttributes field) {
            if (field.getDeclaringClass() == GetTranfserStateVo.class && field.getName().equals("baseInfoVo")) {
                return true;
            }
            if (field.getDeclaringClass() == GetTranfserStateVo.class && field.getName().equals("signature")) {
                return true;
            }
            if (field.getDeclaringClass() == GetTranfserStateVo.class && field.getName().equals("signStrig")) {
                return true;
            }
            if (field.getDeclaringClass() == GetTranfserStateVo.class && field.getName().equals("scProductId")) {
                return true;
            }
            return false;
        }

        public boolean shouldSkipClass(Class<?> clazz) {
            return false;
        }
    };


}
