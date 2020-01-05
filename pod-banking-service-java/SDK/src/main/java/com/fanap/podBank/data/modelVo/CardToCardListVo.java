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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static javax.xml.bind.DatatypeConverter.printBase64Binary;

/**
 * Created by Z.gholinia on 11/9/2019.
 */
public class CardToCardListVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer,Signature serverType ,SourceCardNumber ,scApiKey, userName, minAmount, maxAmount, startDate, endDate are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String UserName;
    private String SourceCardNumber;
    private String SourceDepositNumber;
    private String DestinationCardNumber;
    private String MinAmount;
    private String MaxAmount;
    private String StartDate;
    private String EndDate;
    private String RefrenceNumber;
    private String SequenceNumber;
    private String SourceNote;
    private String DestinationNote;
    private String Signature;
    private String Timestamp;
    private String signStrig;
    private static String scProductId;

    public CardToCardListVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.UserName = builder.getUserName();
        this.SourceCardNumber = builder.getSourceCardNumber();
        this.SourceDepositNumber = builder.getSourceDepositNumber();
        this.DestinationCardNumber = builder.getDestinationCardNumber();
        this.MinAmount = TypeConversionUtil.longToString(builder.getMinAmount());
        this.MaxAmount = TypeConversionUtil.longToString(builder.getMaxAmount());
        this.StartDate = builder.getStartDate();
        this.EndDate = builder.getEndDate();
        this.RefrenceNumber = builder.getRefrenceNumber();
        this.SequenceNumber = builder.getSequenceNumber();
        this.SourceNote = builder.getSourceNote();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss:SSS");
        LocalDateTime now = LocalDateTime.now();
        this.DestinationNote = builder.getDestinationNote();
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
        this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.CARD_TO_CARD_LIST);
//        else
//            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.CRAD_TO_CARD_LIST);


    }

    public String getSourceDepositNumber() {
        return SourceDepositNumber;
    }

    public String getTimestamp() {
        return Timestamp;
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

    public String getSourceCardNumber() {
        return SourceCardNumber;
    }


    public String getDestinationCardNumber() {
        return DestinationCardNumber;
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

    public String getRefrenceNumber() {
        return RefrenceNumber;
    }

    public String getSequenceNumber() {
        return SequenceNumber;
    }

    public String getSourceNote() {
        return SourceNote;
    }

    public String getDestinationNote() {
        return DestinationNote;
    }

    public String getSignature() {
        return Signature;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private String UserName;
        private String SourceCardNumber;
        private String SourceDepositNumber ;
        private String DestinationCardNumber;
        private Long MinAmount;
        private Long MaxAmount;
        private String StartDate ;
        private String EndDate;
        private String RefrenceNumber;
        private String SequenceNumber ;
        private String SourceNote ;
        private String DestinationNote ;
        private SignatureInfo Signature;

        public String getSourceDepositNumber() {
            return SourceDepositNumber;
        }

        public Builder setSourceDepositNumber(String sourceDepositNumber) {
            SourceDepositNumber = sourceDepositNumber;
            return this;
        }

        public String getUserName() {
            return UserName;
        }

        public Builder setUserName(String userName) {
            UserName = userName;
            return this;
        }

        public String getSourceCardNumber() {
            return SourceCardNumber;
        }

        public Builder setSourceCardNumber(String sourceCardNumber) throws PodException {
            String regex = "^[1-9][0-9]{15}$";
            Pattern p = Pattern.compile(regex);
            Matcher mach = p.matcher(sourceCardNumber);
            if (mach.find() && mach.group().equals(sourceCardNumber))
                this.SourceCardNumber = sourceCardNumber;
            else
                throw PodException.invalidParameter(sourceCardNumber + " is not a valid sourceCardNumber");
            return this;
        }

        public String getDestinationCardNumber() {
            return DestinationCardNumber;
        }

        public Builder setDestinationCardNumber(String destinationCardNumber) throws PodException {
            String regex = "^[1-9][0-9]{15}$";
            Pattern p = Pattern.compile(regex);
            Matcher mach = p.matcher(destinationCardNumber);
            if (mach.find() && mach.group().equals(destinationCardNumber))
                this.DestinationCardNumber = destinationCardNumber;
            else
                throw PodException.invalidParameter(destinationCardNumber + " is not a valid destinationCardNumber");
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

        public String getRefrenceNumber() {
            return RefrenceNumber;
        }

        public Builder setRefrenceNumber(String refrenceNumber) {
            RefrenceNumber = refrenceNumber;
            return this;
        }

        public String getSequenceNumber() {
            return SequenceNumber;
        }

        public Builder setSequenceNumber(String sequenceNumber) {
            SequenceNumber = sequenceNumber;
            return this;
        }

        public String getSourceNote() {
            return SourceNote;
        }

        public Builder setSourceNote(String sourceNote) {
            SourceNote = sourceNote;
            return this;
        }

        public String getDestinationNote() {
            return DestinationNote;
        }

        public Builder setDestinationNote(String destinationNote) {
            DestinationNote = destinationNote;
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

        public CardToCardListVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.UserName != null
                    && this.baseInfoVo.getServerType() != null && this.baseInfoVo.getScApiKey()!=null && this.StartDate!=null && this.EndDate!=null
            && this.SourceCardNumber !=null && this.MinAmount!=null && this.MaxAmount!=null  && this.Signature!=null )
                return new CardToCardListVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }

    ExclusionStrategy strategy = new ExclusionStrategy() {

        public boolean shouldSkipField(FieldAttributes field) {
            if (field.getDeclaringClass() == CardToCardListVo.class && field.getName().equals("baseInfoVo")) {
                return true;
            }
            if (field.getDeclaringClass() == CardToCardListVo.class && field.getName().equals("signature")) {
                return true;
            }
            if (field.getDeclaringClass() == CardToCardListVo.class && field.getName().equals("signStrig")) {
                return true;
            }
            if (field.getDeclaringClass() == CardToCardListVo.class && field.getName().equals("scProductId")) {
                return true;
            }
            return false;
        }

        public boolean shouldSkipClass(Class<?> clazz) {
            return false;
        }
    };

}




