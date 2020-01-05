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
public class GetDepositInvoiceVo {
    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer,Signature serverType ,userName,apiKey, startDate, endDate, (sheba or DepositNumber ) are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String UserName;
    private String DepositNumber;
    private String Sheba;
    private String StartDate;
    private String EndDate;
    private String FirstIndex;
    private String Count;
    private String Timestamp;
    private String SignatureInfo;
    private static String scProductId;
    private String signStrig;

    public GetDepositInvoiceVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.UserName = builder.getUserName();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss:SSS");
        LocalDateTime now = LocalDateTime.now();
        this.Timestamp = dtf.format(now);
        this.DepositNumber = builder.getDepositNumber();
        this.Sheba = builder.getSheba();
        this.StartDate = builder.getStartDate();
        this.EndDate = builder.getEndDate();
        this.FirstIndex = TypeConversionUtil.intToString(builder.getFirstIndex());
        this.Count = TypeConversionUtil.intToString(builder.getCount());
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
        this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.GET_DEPOSIT_INFO);
//        else
//            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_GET_SHEBA_INFO);


    }

    public String getFirstIndex() {
        return FirstIndex;
    }

    public String getCount() {
        return Count;
    }

    public String getSignStrig() {
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

    public String getDepositNumber() {
        return DepositNumber;
    }

    public String getSheba() {
        return Sheba;
    }

    public String getStartDate() {
        return StartDate;
    }

    public String getEndDate() {
        return EndDate;
    }

    public String getTimestamp() {
        return Timestamp;
    }

    public String getSignatureInfo() {
        return SignatureInfo;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private String UserName = "";
        private String Timestamp = "";
        private String DepositNumber = "";
        private String Sheba = "";
        private String StartDate = "";
        private String EndDate = "";
        private Integer FirstIndex = 0;
        private Integer Count = 0;
        private SignatureInfo SignatureInfo;

        public Integer getFirstIndex() {
            return FirstIndex;
        }

        public Builder setFirstIndex(Integer firstIndex) {
            FirstIndex = firstIndex;
            return this;
        }

        public Integer getCount() {
            return Count;
        }

        public Builder setCount(Integer count) {
            Count = count;
            return this;
        }

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

        public GetDepositInvoiceVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null && this.SignatureInfo!=null &&
                    this.baseInfoVo.getToken_issuer() != null && this.UserName != null && this.baseInfoVo.getServerType() != null
                    && this.StartDate != null && this.EndDate != null)
                if (this.Sheba != null || this.DepositNumber != null)
                    return new GetDepositInvoiceVo(this);
                else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }

    ExclusionStrategy strategy = new ExclusionStrategy() {

        public boolean shouldSkipField(FieldAttributes field) {
            if (field.getDeclaringClass() == GetDepositInvoiceVo.class && field.getName().equals("baseInfoVo")) {
                return true;
            }
            if (field.getDeclaringClass() == GetDepositInvoiceVo.class && field.getName().equals("signature")) {
                return true;
            }
            if (field.getDeclaringClass() == GetDepositInvoiceVo.class && field.getName().equals("signStrig")) {
                return true;
            }
            if (field.getDeclaringClass() == GetDepositInvoiceVo.class && field.getName().equals("scProductId")) {
                return true;
            }
            return false;
        }

        public boolean shouldSkipClass(Class<?> clazz) {
            return false;
        }
    };

}
