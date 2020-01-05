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
public class BillPaymentByDepositVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer,Signature serverType ,userName,apiKey, DepositNumber, paymentId, billNumber  are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String UserName;
    private String PaymentId;
    private String DepositNumber;
    private String BillNumber;
    private String Timestamp;
    private String Signature;
    private String signStrig;
    private static String scProductId;

    public BillPaymentByDepositVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.UserName = builder.getUserName();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss:SSS");
        LocalDateTime now = LocalDateTime.now();
        this.Timestamp = dtf.format(now);
        this.DepositNumber = builder.getDepositNumber();
        this.BillNumber = builder.getBillNumber();
        this.PaymentId = builder.getPaymentId();
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
        this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.BILL_PAYMENT_BY_DEPOSIT);
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

    public String getDepositNumber() {
        return DepositNumber;
    }

    public String getBillNumber() {
        return BillNumber;
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
        private String DepositNumber;
        private String BillNumber;
        private String PaymentId;
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


        public String getDepositNumber() {
            return DepositNumber;
        }

        public Builder setDepositNumber(String depositNumber) {
            DepositNumber = depositNumber;
            return this;
        }

        public String getBillNumber() {
            return BillNumber;
        }

        public Builder setBillNumber(String billNumber) {
            BillNumber = billNumber;
            return this;
        }

        public String getPaymentId() {
            return PaymentId;
        }

        public Builder setPaymentId(String paymentId) {
            PaymentId = paymentId;
            return this;
        }

        public BillPaymentByDepositVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.UserName != null && this.Signature!=null &&  this.baseInfoVo.getServerType() != null
                    && this.baseInfoVo.getScApiKey() != null && this.DepositNumber != null && this.PaymentId != null && this.BillNumber != null)
                return new BillPaymentByDepositVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }

    ExclusionStrategy strategy = new ExclusionStrategy() {

        public boolean shouldSkipField(FieldAttributes field) {
            if (field.getDeclaringClass() == BillPaymentByDepositVo.class && field.getName().equals("baseInfoVo")) {
                return true;
            }
            if (field.getDeclaringClass() == BillPaymentByDepositVo.class && field.getName().equals("signature")) {
                return true;
            }
            if (field.getDeclaringClass() == BillPaymentByDepositVo.class && field.getName().equals("signStrig")) {
                return true;
            }
            if (field.getDeclaringClass() == BillPaymentByDepositVo.class && field.getName().equals("scProductId")) {
                return true;
            }
            return false;
        }

        public boolean shouldSkipClass(Class<?> clazz) {
            return false;
        }
    };

}

