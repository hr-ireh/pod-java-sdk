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
public class GetCardInformationVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer,Signature serverType ,srcCardNumber, destCardNumber, scApiKey, userName are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String UserName;
    private String SrcCardNumber;
    private String DestCardNumber;
    private String Email;
    private String Timestamp;
    private String signature;
    private static String scProductId;
    private String signStrig;

    public GetCardInformationVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.UserName = builder.getUserName();
        this.SrcCardNumber = builder.getSrcCardNumber();
        this.DestCardNumber = builder.getDestCardNumber();
        this.Email = builder.getEmail();
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
        this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.GET_CARD_INFORMATION);
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

    public String getSrcCardNumber() {
        return SrcCardNumber;
    }

    public String getDestCardNumber() {
        return DestCardNumber;
    }

    public String getEmail() {
        return Email;
    }

    public String getTimestamp() {
        return Timestamp;
    }

    public String getSignature() {
        return signature;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private String userName;
        private String srcCardNumber;
        private String destCardNumber;
        private String email;
        private String timestamp;
        private SignatureInfo signature;

        public String getUserName() {
            return userName;
        }

        public Builder setUserName(String userName) {
            this.userName = userName;
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

        public String getTimestamp() {
            return timestamp;
        }

        public Builder setTimestamp(String timestamp) {
            this.timestamp = timestamp;
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

        public GetCardInformationVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null && this.signature!=null &&
                    this.baseInfoVo.getToken_issuer() != null && this.baseInfoVo.getServerType() != null
                    && this.srcCardNumber != null && this.destCardNumber != null && this.userName != null)
                return new GetCardInformationVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }

    ExclusionStrategy strategy = new ExclusionStrategy() {

        public boolean shouldSkipField(FieldAttributes field) {
            if (field.getDeclaringClass() == GetCardInformationVo.class && field.getName().equals("baseInfoVo")) {
                return true;
            }
            if (field.getDeclaringClass() == GetCardInformationVo.class && field.getName().equals("signature")) {
                return true;
            }
            if (field.getDeclaringClass() == GetCardInformationVo.class && field.getName().equals("signStrig")) {
                return true;
            }
            if (field.getDeclaringClass() == GetCardInformationVo.class && field.getName().equals("scProductId")) {
                return true;
            }
            return false;
        }

        public boolean shouldSkipClass(Class<?> clazz) {
            return false;
        }
    };


}