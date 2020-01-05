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
public class CardToCardVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, serverType ,Signature srcCardNumber, destCardNumber, scApiKey, amount, cvv2, password, expireMonth, expireYear are required parameters!";

    private BaseInfoVo baseInfoVo;

    private String UserName;
    private String SrcCardNumber;
    private String DestCardNumber;
    private String Password;
    private String Cvv2;
    private String ExpireMonth;
    private String ExpireYear;
    private String Amount;
    private String Email;
    private String AuthorizationCode;
    private String WithReferenceNumber;
    private String CardName;
    private String SrcComment;
    private String DestComment;
    private String OriginalAddress;
    private String JsonData;
    private String Timestamp;
    private String signature;
    private String signStrig;
    private static String scProductId;

    public CardToCardVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.UserName = builder.getUserName();
        this.SrcCardNumber = builder.getSrcCardNumber();
        this.DestCardNumber = builder.getDestCardNumber();
        this.Password = builder.getPassword();
        this.Cvv2 = builder.getCvv2();
        this.ExpireMonth = builder.getExpireMonth();
        this.ExpireYear = builder.getExpireYear();
        this.Amount = TypeConversionUtil.longToString(builder.getAmount());
        this.Email = builder.getEmail();
//        if (builder.getWithReferenceNumber() == true)
        this.AuthorizationCode = builder.getAuthorizationCode();
        this.WithReferenceNumber = TypeConversionUtil.booleanToString(builder.getWithReferenceNumber());
//        else if (builder.getWithReferenceNumber() == true)
//            this.authorizationCode = TypeConversionUtil.intToString(0);
        this.CardName = builder.getCardName();
        this.SrcComment = builder.getSrcComment();
        this.DestComment = builder.getDestComment();
        this.OriginalAddress = builder.getOriginalAddress();
        String withoutSlash = new GsonBuilder().serializeNulls().create().toJson(builder.getJsonData());
        String withSlash = withoutSlash.replace("\"", "\\\"");
        this.JsonData = withoutSlash;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss:SSS");
        LocalDateTime now = LocalDateTime.now();
        this.Timestamp = dtf.format(now);
        Gson gson = new GsonBuilder()
                .addSerializationExclusionStrategy(strategy)
                .create();
        signStrig = gson.toJson(this);
        try {
            this.signature = printBase64Binary(RSAUtil.sign(RSAUtil.XML2PrivateKey(builder.getSignature().getPrivateKey()), signStrig.getBytes("UTF-8")));
        } catch (Exception e) {
            e.printStackTrace();
        }
//        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
        this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.CARD_TO_CARD);
//        else
//            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_GET_DEBIT_CARD_INFO);


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

    public String getAmount() {
        return Amount;
    }

    public String getCvv2() {
        return Cvv2;
    }

    public String getPassword() {
        return Password;
    }

    public String getSrcCardNumber() {
        return SrcCardNumber;
    }

    public String getExpireMonth() {
        return ExpireMonth;
    }

    public String getExpireYear() {
        return ExpireYear;
    }

    public String getDestCardNumber() {
        return DestCardNumber;
    }

    public String getEmail() {
        return Email;
    }

    public String getAuthorizationCode() {
        return AuthorizationCode;
    }

    public String getSrcComment() {
        return SrcComment;
    }

    public String getDestComment() {
        return DestComment;
    }

    public String getOriginalAddress() {
        return OriginalAddress;
    }

    public String getWithReferenceNumber() {
        return WithReferenceNumber;
    }

    public String getTimestamp() {
        return Timestamp;
    }

    public String getSignature() {
        return signature;
    }

    public String getJsonData() {
        return JsonData;
    }

    public String getCardName() {
        return CardName;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private String userName;
        private Long amount ;
        private String cvv2 ;
        private String password ;
        private String srcCardNumber ;
        private String expireMonth ;
        private String expireYear ;
        private String destCardNumber ;
        private String email ;
        private String authorizationCode;
        private String cardName;
        private String srcComment;
        private String destComment;
        private String originalAddress ;
        private Boolean withReferenceNumber = false;
        private SignatureInfo signature;
        private JsonDateContent jsonData;

        public Builder setExtraData(JsonDateContent jsonData) {
            this.jsonData = jsonData;
            return this;
        }

        public String getCardName() {
            return cardName;
        }

        public Builder setCardName(String cardName) {
            this.cardName = cardName;
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

        public String getUserName() {
            return userName;
        }

        public Builder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public Long getAmount() {
            return amount;
        }

        public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
        }

        public String getCvv2() {
            return cvv2;
        }

        public Builder setCvv2(String cvv2) throws PodException {
            String regex = "^[0-9]{3,4}$";
            Pattern p = Pattern.compile(regex);
            Matcher mach = p.matcher(cvv2);
            if (mach.find() && mach.group().equals(cvv2))
                this.cvv2 = cvv2;
            else
                throw PodException.invalidParameter(cvv2 + " is not a valid cvv2");
            return this;
        }

        public String getPassword() {
            return password;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public String getSrcCardNumber() {
            return srcCardNumber;
        }

        public Builder setSrcCardNumber(String srcCardNumber) throws PodException {
            String regex = "^[1-9][0-9]{15}$";
            Pattern p = Pattern.compile(regex);
            Matcher mach = p.matcher(srcCardNumber);
            if (mach.find() && mach.group().equals(srcCardNumber))
                this.srcCardNumber = srcCardNumber;
            else
                throw PodException.invalidParameter(srcCardNumber + " is not a valid srcCardNumber");
            return this;
        }

        public String getExpireMonth() {
            return expireMonth;
        }

        public Builder setExpireMonth(String expireMonth) throws PodException {
//            String regex = "([0][1-9]|[1][0-2])$";
//            Pattern p = Pattern.compile(regex);
//            Matcher mach = p.matcher(expireMonth);
//            if (mach.find() && mach.group().equals(expireYear))
            this.expireMonth = expireMonth;
//            else
//                throw PodException.invalidParameter(expireMonth + " is not a valid expireMonthv");
            return this;
        }

        public String getExpireYear() {
            return expireYear;
        }

        public Builder setExpireYear(String expireYear) throws PodException {
            String regex = "^[0-9][0-9]$";
            Pattern p = Pattern.compile(regex);
            Matcher mach = p.matcher(expireYear);
            if (mach.find() && mach.group().equals(expireYear))
                this.expireYear = expireYear;
            else
                throw PodException.invalidParameter(expireYear + " is not a valid expireYearv");
            return this;
        }

        public String getDestCardNumber() {
            return destCardNumber;
        }

        public Builder setDestCardNumber(String destCardNumber) throws PodException {
            String regex = "^[1-9][0-9]{15}$";
            Pattern p = Pattern.compile(regex);
            Matcher mach = p.matcher(destCardNumber);
            if (mach.find() && mach.group().equals(destCardNumber))
                this.destCardNumber = destCardNumber;
            else
                throw PodException.invalidParameter(destCardNumber + " is not a valid destCardNumber");
            return this;
        }

        public String getEmail() {
            return email;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public String getAuthorizationCode() {
            return authorizationCode;
        }

        public Builder setAuthorizationCode(String authorizationCode) {
            this.authorizationCode = authorizationCode;
            return this;
        }

        public String getSrcComment() {
            return srcComment;
        }

        public Builder setSrcComment(String srcComment) {
            this.srcComment = srcComment;
            return this;
        }

        public String getDestComment() {
            return destComment;
        }

        public Builder setDestComment(String destComment) {
            this.destComment = destComment;
            return this;
        }

        public String getOriginalAddress() {
            return originalAddress;
        }

        public Builder setOriginalAddress(String originalAddress) {
            this.originalAddress = originalAddress;
            return this;
        }

        public Boolean getWithReferenceNumber() {
            return withReferenceNumber;
        }

        public Builder setWithReferenceNumber(Boolean withReferenceNumber) {
            this.withReferenceNumber = withReferenceNumber;
            return this;
        }


        public SignatureInfo getSignature() {
            return signature;
        }

        public Builder setSignature(SignatureInfo signature) {
            this.signature = signature;
            return this;
        }

        public JsonDateContent getJsonData() {
            return jsonData;
        }

        public CardToCardVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.signature!=null && this.userName != null && this.amount != null && this.cvv2 != null
                    && this.password != null && this.srcCardNumber != null && this.expireMonth != null && this.expireYear != null && this.destCardNumber != null
                    && baseInfoVo.getServerType() != null && this.baseInfoVo.getScApiKey()!=null)
                return new CardToCardVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }

    ExclusionStrategy strategy = new ExclusionStrategy() {

        public boolean shouldSkipField(FieldAttributes field) {
            if (field.getDeclaringClass() == CardToCardVo.class && field.getName().equals("baseInfoVo")) {
                return true;
            }
            if (field.getDeclaringClass() == CardToCardVo.class && field.getName().equals("signature")) {
                return true;
            }
            if (field.getDeclaringClass() == CardToCardVo.class && field.getName().equals("signStrig")) {
                return true;
            }
            if (field.getDeclaringClass() == CardToCardVo.class && field.getName().equals("scProductId")) {
                return true;
            }
            return false;
        }

        public boolean shouldSkipClass(Class<?> clazz) {
            return false;
        }
    };

}


