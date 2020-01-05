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

public class GetDepositBalanceVo {
    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer,Signature serverType ,signature,apiKey, userName,(sheba or depositNumber) are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String UserName;
    private String DepositNumber;
    private String Sheba;
    private String Timestamp;
    private String SignatureInfo;
    private static String scProductId;
    private String signStrig;

    public GetDepositBalanceVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.UserName = builder.getUserName();
        this.DepositNumber = builder.getDepositNumber();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss:SSS");
        LocalDateTime now = LocalDateTime.now();
        this.Timestamp = dtf.format(now);
        this.Sheba = builder.getSheba();
        Gson gson = new GsonBuilder()
                .addSerializationExclusionStrategy(strategy)
                .create();
        signStrig = gson.toJson(this);
        signStrig = signStrig.replaceAll("null", "");
        try {
            this.SignatureInfo = printBase64Binary(RSAUtil.sign(RSAUtil.XML2PrivateKey(builder.getSignatureInfo().getPrivateKey()), signStrig.getBytes("UTF-8")));
        } catch (Exception e) {
            e.printStackTrace();
        }
//        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
        this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.GET_DEPOSIT_BALANCE);
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

    public String getSheba() {
        return Sheba;
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
        private String Timestamp ;
        private String DepositNumber ;
        private String Sheba ;
        private String StartDate;
        private String EndDate;
        private SignatureInfo SignatureInfo;

        public String getUserName() {
            return UserName;
        }

        public Builder setUserName(String UserName) {
            this.UserName = UserName;
            return this;
        }

        public String getTimestamp() {
            return Timestamp;
        }

        public Builder setTimestamp(String timestamp) {
            Timestamp = timestamp;
            return this;
        }

        public String getDepositNumber() {
            return DepositNumber;
        }

        public Builder setDepositNumber(String depositNumber) {
            DepositNumber = depositNumber;
            return this;
        }

        public String getSheba() {
            return Sheba;
        }

        public Builder setSheba(String sheba) {
            Sheba = sheba;
            return this;
        }

        public String getStartDate() {
            return StartDate;
        }

        public Builder setStartDate(String startDate) {
            StartDate = startDate;
            return this;
        }

        public String getEndDate() {
            return EndDate;
        }

        public Builder setEndDate(String endDate) {
            EndDate = endDate;
            return this;
        }

        public SignatureInfo getSignatureInfo() {
            return SignatureInfo;
        }

        public Builder setSignatureInfo(SignatureInfo signatureInfo) {
            SignatureInfo = signatureInfo;
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

        public GetDepositBalanceVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null && this.SignatureInfo!=null &&
                    this.baseInfoVo.getToken_issuer() != null && this.UserName != null && this.baseInfoVo.getServerType() != null
                    && this.baseInfoVo.getScApiKey() != null && this.SignatureInfo != null)
                if (this.DepositNumber != null || this.Sheba != null)
                    return new GetDepositBalanceVo(this);
                else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }


    ExclusionStrategy strategy = new ExclusionStrategy() {

        public boolean shouldSkipField(FieldAttributes field) {
            if (field.getDeclaringClass() == GetDepositBalanceVo.class && field.getName().equals("baseInfoVo")) {
                return true;
            }
            if (field.getDeclaringClass() == GetDepositBalanceVo.class && field.getName().equals("signature")) {
                return true;
            }
            if (field.getDeclaringClass() == GetDepositBalanceVo.class && field.getName().equals("signStrig")) {
                return true;
            }
            if (field.getDeclaringClass() == GetDepositBalanceVo.class && field.getName().equals("scProductId")) {
                return true;
            }
            return false;
        }

        public boolean shouldSkipClass(Class<?> clazz) {
            return false;
        }
    };

}

