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
public class GetDepositNumberByCardNumberVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer,Signature serverType, apiKey ,userName,cardNumber are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String UserName;
    private String CardNumber;
    private String Timestamp;
    private String SignatureInfo;
    private static String scProductId;
    private static String signStrig;

    public GetDepositNumberByCardNumberVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.UserName = builder.getUserName();
        this.CardNumber = builder.getCardNumber();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss:SSS");
        LocalDateTime now = LocalDateTime.now();
        this.Timestamp = dtf.format(now);
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
        this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.GET_DEPOSIT_NUMBER_BY_CARD_NUMBER);
//        else
//            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_GET_SHEBA_INFO);


    }

    public static String getSignStrig() {
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

    public String getCardNumber() {
        return CardNumber;
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
        private String CardNumber;
        private SignatureInfo SignatureInfo;

        public com.fanap.podBank.data.modelVo.SignatureInfo getSignatureInfo() {
            return SignatureInfo;
        }

        public Builder setSignatureInfo(com.fanap.podBank.data.modelVo.SignatureInfo signatureInfo) {
            SignatureInfo = signatureInfo;
            return this;
        }

        public String getUserName() {
            return UserName;
        }

        public Builder setUserName(String UserName) {
            this.UserName = UserName;
            return this;
        }

        public String getCardNumber() {
            return CardNumber;
        }

        public Builder setCardNumber(String cardNumber) throws PodException {
            String regex = "^[1-9][0-9]{15}$";
            Pattern p = Pattern.compile(regex);
            Matcher mach = p.matcher(cardNumber);
            if (mach.find() && mach.group().equals(cardNumber))
                this.CardNumber = cardNumber;
            else
                throw PodException.invalidParameter(cardNumber + " is not a valid cardNumber");
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

        public GetDepositNumberByCardNumberVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null && this.SignatureInfo != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.UserName != null && this.baseInfoVo.getServerType() != null
                    && this.CardNumber != null && this.baseInfoVo.getScApiKey() != null)
                return new GetDepositNumberByCardNumberVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }

    ExclusionStrategy strategy = new ExclusionStrategy() {

        public boolean shouldSkipField(FieldAttributes field) {
            if (field.getDeclaringClass() == GetDepositNumberByCardNumberVo.class && field.getName().equals("baseInfoVo")) {
                return true;
            }
            if (field.getDeclaringClass() == GetDepositNumberByCardNumberVo.class && field.getName().equals("signature")) {
                return true;
            }
            if (field.getDeclaringClass() == GetDepositNumberByCardNumberVo.class && field.getName().equals("signStrig")) {
                return true;
            }
            if (field.getDeclaringClass() == GetDepositNumberByCardNumberVo.class && field.getName().equals("scProductId")) {
                return true;
            }
            return false;
        }

        public boolean shouldSkipClass(Class<?> clazz) {
            return false;
        }
    };

}
