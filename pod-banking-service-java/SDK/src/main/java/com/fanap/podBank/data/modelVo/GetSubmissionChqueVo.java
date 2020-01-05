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
public class GetSubmissionChqueVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer,Signature serverType ,userName,scApiKey, MinAmount, MaxAmount, Deposit, StartDate, EndDate, BankCode, ChequeStatus, StartSubmisionDate, EndSubmissionDate, RowCount are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String UserName;
    private String Deposit;
    private String ChequeNumber;
    private String MinAmount;
    private String MaxAmount;
    private String StartDate;
    private String EndDate;
    private String BankCode;
    private String ChequeStatus;
    private String StartSubmisionDate;
    private String EndSubmissionDate;
    private String RowCount;
    private String Timestamp;
    private String Signature;
    private static String scProductId;
    private String signStrig;

    public GetSubmissionChqueVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.UserName = builder.getUserName();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss:SSS");
        LocalDateTime now = LocalDateTime.now();
        this.Timestamp = dtf.format(now);
        this.Deposit = builder.getDeposit();
        this.ChequeNumber = builder.getChequeNumber();
        this.MinAmount = TypeConversionUtil.longToString(builder.getMinAmount());
        this.MaxAmount = TypeConversionUtil.longToString(builder.getMaxAmount());
        this.StartDate = builder.getStartDate();
        this.EndDate = builder.getEndDate();
        this.BankCode = builder.getBankCode();
        this.ChequeStatus = builder.getChequeStatus();
        this.StartSubmisionDate = builder.getStartSubmisionDate();
        this.EndSubmissionDate = builder.getEndSubmitionDate();
        this.RowCount = TypeConversionUtil.intToString(builder.getRowCount());
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
        this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.GET_SUBMISSION_CHEQE);
//        else
//            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.CRAD_TO_CARD_LIST);


    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getUserName() {
        return UserName;
    }

    public String getTimestamp() {
        return Timestamp;
    }

    public String getDeposit() {
        return Deposit;
    }

    public String getChequeNumber() {
        return ChequeNumber;
    }

    public String getMinAmount() {
        return MinAmount;
    }

    public String getMaxAmount() {
        return MaxAmount;
    }

    public String getStartDate() {
        return StartDate;
    }

    public String getEndDate() {
        return EndDate;
    }

    public String getBankCode() {
        return BankCode;
    }

    public String getChequeStatus() {
        return ChequeStatus;
    }

    public String getStartSubmisionDate() {
        return StartSubmisionDate;
    }

    public String getEndSubmitionDate() {
        return EndSubmissionDate;
    }

    public String getRowCount() {
        return RowCount;
    }

    public String getSignature() {
        return Signature;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private String UserName ;
        private String Deposit ;
        private String ChequeNumber ;
        private Long MinAmount ;
        private Long MaxAmount ;
        private String StartDate ;
        private String EndDate ;
        private String BankCode ;
        private String ChequeStatus ;
        private String StartSubmisionDate ;
        private String EndSubmissionDate ;
        private Integer RowCount ;
        private SignatureInfo Signature;

        public String getUserName() {
            return UserName;
        }

        public Builder setUserName(String userName) {
            UserName = userName;
            return this;
        }


        public Long getMinAmount() {
            return MinAmount;
        }

        public Builder setMinAmount(Long minAmount) {
            MinAmount = minAmount;
            return this;
        }

        public Long getMaxAmount() {
            return MaxAmount;
        }

        public Builder setMaxAmount(Long maxAmount) {
            MaxAmount = maxAmount;
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

        public String getChequeNumber() {
            return ChequeNumber;
        }

        public Builder setChequeNumber(String chequeNumber) {
            ChequeNumber = chequeNumber;
            return this;
        }

        public String getBankCode() {
            return BankCode;
        }

        public Builder setBankCode(String bankCode) {
            BankCode = bankCode;
            return this;
        }

        public String getChequeStatus() {
            return ChequeStatus;
        }

        public Builder setChequeStatus(String chequeStatus) {
            ChequeStatus = chequeStatus;
            return this;
        }

        public String getStartSubmisionDate() {
            return StartSubmisionDate;
        }

        public Builder setStartSubmisionDate(String startSubmisionDate) {
            StartSubmisionDate = startSubmisionDate;
            return this;
        }

        public String getEndSubmitionDate() {
            return EndSubmissionDate;
        }

        public Builder setEndSubmitionDate(String endSubmitionDate) {
            EndSubmissionDate = endSubmitionDate;
            return this;
        }

        public Integer getRowCount() {
            return RowCount;
        }

        public Builder setRowCount(Integer rowCount) {
            RowCount = rowCount;
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

        public String getDeposit() {
            return Deposit;
        }

        public Builder setDeposit(String deposit) {
            Deposit = deposit;
            return this;
        }

        public GetSubmissionChqueVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null && this.Signature!=null &&
                    this.baseInfoVo.getToken_issuer() != null && this.UserName != null
                    && this.baseInfoVo.getServerType() != null && this.baseInfoVo.getScApiKey()!=null && this.UserName!=null
            && this.Deposit!=null && this.MinAmount!=null && this.MaxAmount!=null
            && this.StartDate!=null && this.EndDate!=null && this.BankCode!=null && this.ChequeStatus!=null
            && this.StartSubmisionDate!=null && this.RowCount!=null && this.EndSubmissionDate!=null)
                return new GetSubmissionChqueVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
    ExclusionStrategy strategy = new ExclusionStrategy() {

        public boolean shouldSkipField(FieldAttributes field) {
            if (field.getDeclaringClass() == GetSubmissionChqueVo.class && field.getName().equals("baseInfoVo")) {
                return true;
            }
            if (field.getDeclaringClass() == GetSubmissionChqueVo.class && field.getName().equals("signature")) {
                return true;
            }
            if (field.getDeclaringClass() == GetSubmissionChqueVo.class && field.getName().equals("signStrig")) {
                return true;
            }
            if (field.getDeclaringClass() == GetSubmissionChqueVo.class && field.getName().equals("scProductId")) {
                return true;
            }
            return false;
        }

        public boolean shouldSkipClass(Class<?> clazz) {
            return false;
        }
    };


}
