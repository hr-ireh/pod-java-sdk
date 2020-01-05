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
public class TransferMoneyVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, Signature, serverType ,userName,apiKey, amount, paymentId,(SourceDepositNumber  and DestDepositNumber or SourceDepositNumber and DestSheba or SourceSheba and DestDepositNumber or SourceSheba and DestSheba) are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String UserName;
    private String SourceDepositNumber;
    private String SourceSheba;
    private String DestDepositNumber;
    private String DestSheba;
    private String DestFirstName;
    private String DestLastName;
    private String Amount;
    private String SourceComment;
    private String DestComment;
    private String PaymentId;
    private String Timestamp;
    private String Signature;
    private static String scProductId;
    private String signStrig;

    public TransferMoneyVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.UserName = builder.getUserName();
        this.SourceDepositNumber = builder.getSourceDepositNumber();
        this.SourceSheba = builder.getSourceSheba();
        this.DestDepositNumber = builder.getDestDepositNumber();
        this.DestSheba = builder.getDestSheba();
        this.DestFirstName = builder.getDestFirstName();
        this.DestLastName = builder.getDestLastName();
        this.Amount = builder.getAmount();
        this.SourceComment = builder.getSourceComment();
        this.DestComment = builder.getDestComment();
        this.PaymentId = builder.getPaymentId();
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
        this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.TRANSFER_MONEY);
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

    public String getSourceDepositNumber() {
        return SourceDepositNumber;
    }

    public String getSourceSheba() {
        return SourceSheba;
    }

    public String getDestDepositNumber() {
        return DestDepositNumber;
    }

    public String getDestSheba() {
        return DestSheba;
    }

    public String getDestFirstName() {
        return DestFirstName;
    }

    public String getDestLastName() {
        return DestLastName;
    }

    public String getAmount() {
        return Amount;
    }

    public String getSourceComment() {
        return SourceComment;
    }

    public String getDestComment() {
        return DestComment;
    }

    public String getPaymentId() {
        return PaymentId;
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
        private String SourceDepositNumber ;
        private String SourceSheba;
        private String DestDepositNumber;
        private String DestSheba ;
        private String DestFirstName ;
        private String DestLastName ;
        private String Amount ;
        private String SourceComment;
        private String DestComment ;
        private String PaymentId ;
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

        public String getSourceDepositNumber() {
            return SourceDepositNumber;
        }

        public Builder setSourceDepositNumber(String sourceDepositNumber) {
            SourceDepositNumber = sourceDepositNumber;
            return this;
        }

        public String getSourceSheba() {
            return SourceSheba;
        }

        public Builder setSourceSheba(String sourceSheba) {
            SourceSheba = sourceSheba;
            return this;
        }

        public String getDestDepositNumber() {
            return DestDepositNumber;
        }

        public Builder setDestDepositNumber(String destDepositNumber) {
            DestDepositNumber = destDepositNumber;
            return this;
        }

        public String getDestSheba() {
            return DestSheba;
        }

        public Builder setDestSheba(String destSheba) {
            DestSheba = destSheba;
            return this;
        }

        public String getDestFirstName() {
            return DestFirstName;
        }

        public Builder setDestFirstName(String destFirstName) {
            DestFirstName = destFirstName;
            return this;
        }

        public String getDestLastName() {
            return DestLastName;
        }

        public Builder setDestLastName(String destLastName) {
            DestLastName = destLastName;
            return this;
        }

        public String getAmount() {
            return Amount;
        }

        public Builder setAmount(String amount) {
            Amount = amount;
            return this;
        }

        public String getSourceComment() {
            return SourceComment;
        }

        public Builder setSourceComment(String sourceComment) {
            SourceComment = sourceComment;
            return this;
        }

        public String getDestComment() {
            return DestComment;
        }

        public Builder setDestComment(String destComment) {
            DestComment = destComment;
            return this;
        }

        public String getPaymentId() {
            return PaymentId;
        }

        public Builder setPaymentId(String paymentId) {
            PaymentId = paymentId;
            return this;
        }

        public TransferMoneyVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.Signature != null && this.UserName != null &&
                    this.baseInfoVo.getServerType() != null && this.baseInfoVo.getScApiKey() != null && this.Amount != null && this.PaymentId != null)
                if (this.SourceDepositNumber != null && this.DestDepositNumber != null || this.SourceDepositNumber != null && this.DestSheba != null || this.SourceSheba != null && this.DestDepositNumber != null || this.SourceSheba != null && this.DestSheba != null)
                    return new TransferMoneyVo(this);
                else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }

    ExclusionStrategy strategy = new ExclusionStrategy() {

        public boolean shouldSkipField(FieldAttributes field) {
            if (field.getDeclaringClass() == TransferMoneyVo.class && field.getName().equals("baseInfoVo")) {
                return true;
            }
            if (field.getDeclaringClass() == TransferMoneyVo.class && field.getName().equals("signature")) {
                return true;
            }
            if (field.getDeclaringClass() == TransferMoneyVo.class && field.getName().equals("signStrig")) {
                return true;
            }
            if (field.getDeclaringClass() == TransferMoneyVo.class && field.getName().equals("scProductId")) {
                return true;
            }
            return false;
        }

        public boolean shouldSkipClass(Class<?> clazz) {
            return false;
        }
    };

}
