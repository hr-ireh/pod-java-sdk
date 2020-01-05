package com.fanap.podBank.data.modelVo;

import com.fanap.podBank.util.RSAUtil;
import com.fanap.podBank.util.ScProductIdPodServicesProduction;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.podBaseService.util.TypeConversionUtil;
import com.google.gson.Gson;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import static javax.xml.bind.DatatypeConverter.printBase64Binary;

/**
 * Created by Z.gholinia on 11/9/2019.
 */
public class PayaSeriviceVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, serverType ,productId,apiKey, path are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String UserName;
    private String Timestamp;
    private String SourceDepositNumber;
    private String TransferMoneyBillNumber;
    private String FileUniqueIdentifier;
    private String BatchPayaItemInfos;
    private String signature;
    private String signStrig;
    private static String scProductId;

    public PayaSeriviceVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.UserName = builder.getUserName();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss:SSS");
        LocalDateTime now = LocalDateTime.now();
        this.Timestamp = dtf.format(now);
        this.SourceDepositNumber = builder.getSourceDepositNumber();
        this.TransferMoneyBillNumber = builder.getTransferMoneyBillNumber();
        this.FileUniqueIdentifier = builder.getFileUniqueIdentifier();
        this.BatchPayaItemInfos = new Gson().toJson(builder.getBatchPayaItemInfos());

        signStrig = "{\"UserName\":" + "\"" + this.UserName + "\"" + ",\"SourceDepositNumber\":" + "\"" + this.SourceDepositNumber + "\"" + ",\"FileUniqueIdentifier\":" + "\"" + this.FileUniqueIdentifier + "\"" +
                ",\"TransferMoneyBillNumber\":" + "\"" + this.TransferMoneyBillNumber + "\"" + ",\"BatchPayaItemInfos\":" + this.BatchPayaItemInfos + ",\"Timestamp\":" + "\"" + this.Timestamp + "\"" + "}";
        try {
            this.signature = printBase64Binary(RSAUtil.sign(RSAUtil.XML2PrivateKey(builder.getSignature().getPrivateKey()), signStrig.getBytes("UTF-8")));
        } catch (Exception e) {
            e.printStackTrace();
        }
//            if (getBaseInfoVo().getServerType().equals(PRODUCTION))
        this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.PAYA_SERVICE);
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

    public String getSourceDepositNumber() {
        return SourceDepositNumber;
    }

    public String getTransferMoneyBillNumber() {
        return TransferMoneyBillNumber;
    }

    public String getFileUniqueIdentifier() {
        return FileUniqueIdentifier;
    }

    public String getBatchPayaItemInfos() {
        return BatchPayaItemInfos;
    }

    public String getSignature() {
        return signature;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private String UserName = "";
        private String SourceDepositNumber = "";
        private String TransferMoneyBillNumber = "";
        private String FileUniqueIdentifier = "";
        private List<BatchPayaItemInfoContents> BatchPayaItemInfos;
        private SignatureInfo signature;


        public String getUserName() {
            return UserName;
        }

        public Builder setUserName(String userName) {
            UserName = userName;
            return this;
        }

        public String getSourceDepositNumber() {
            return SourceDepositNumber;
        }

        public Builder setSourceDepositNumber(String sourceDepositNumber) {
            SourceDepositNumber = sourceDepositNumber;
            return this;
        }

        public String getTransferMoneyBillNumber() {
            return TransferMoneyBillNumber;
        }

        public Builder setTransferMoneyBillNumber(String transferMoneyBillNumber) {
            TransferMoneyBillNumber = transferMoneyBillNumber;
            return this;
        }

        public String getFileUniqueIdentifier() {
            return FileUniqueIdentifier;
        }

        public Builder setFileUniqueIdentifier(String fileUniqueIdentifier) {
            FileUniqueIdentifier = fileUniqueIdentifier;
            return this;
        }

        public List<BatchPayaItemInfoContents> getBatchPayaItemInfos() {
            return BatchPayaItemInfos;
        }

        public Builder setBatchPayaItemInfos(List<BatchPayaItemInfoContents> batchPayaItemInfos) {
            this.BatchPayaItemInfos = batchPayaItemInfos;
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

        public PayaSeriviceVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null && this.signature!=null &&
                    this.baseInfoVo.getToken_issuer() != null && this.baseInfoVo.getServerType() != null && this.baseInfoVo.getScApiKey() != null
                    && this.UserName != null && this.FileUniqueIdentifier != null && this.BatchPayaItemInfos != null && this.SourceDepositNumber != null)
                return new PayaSeriviceVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }


}

