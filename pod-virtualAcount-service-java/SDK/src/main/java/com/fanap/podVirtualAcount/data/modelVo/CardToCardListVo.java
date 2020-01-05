package com.fanap.podVirtualAcount.data.modelVo;

import com.fanap.podBaseService.exception.PodException;
import com.fanap.podVirtualAcount.util.ScProductIdPodServicesProduction;
import com.fanap.podVirtualAcount.util.ScProductIdPodServicesSandBox;
import com.fanap.podBaseService.util.TypeConversionUtil;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.fanap.podBaseService.enums.Enum_Server_type.PRODUCTION;

public class CardToCardListVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer , serverType and offset, size are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String offset;
    private String size;
    private String canEdit;
    private String canceled;
    private String statusCode;
    private String causeCode;
    private String causeId;
    private String fromDate;
    private String toDate;
    private String fromAmount;
    private String toAmount;
    private String uniqueId;
    private String referenceNumber;

    private static String scProductId;

    public String getOffset() {
        return offset;
    }

    public String getSize() {
        return size;
    }

    public String getFromDate() {
        return fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public static String getScProductId() {
        return scProductId;
    }


    public String getFromAmount() {
        return fromAmount;
    }

    public String getToAmount() {
        return toAmount;
    }

    public String getCanEdit() {
        return canEdit;
    }

    public String getCanceled() {
        return canceled;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public String getCauseCode() {
        return causeCode;
    }

    public String getCauseId() {
        return causeId;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public CardToCardListVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.offset = TypeConversionUtil.intToString(builder.getOffset());
        this.size = TypeConversionUtil.intToString(builder.getSize());
        this.canEdit = TypeConversionUtil.booleanToString(builder.getCanEdit());
        this.canceled = TypeConversionUtil.booleanToString(builder.getCanceled());
        this.statusCode = builder.getStatusCode();
        this.causeCode = builder.getCauseCode();
        this.fromDate = builder.getFromDate();
        this.toDate = builder.getToDate();
        this.fromAmount = TypeConversionUtil.longToString(builder.getFromAmount());
        this.toAmount = TypeConversionUtil.longToString(builder.getToAmount());
        this.uniqueId = builder.getUniqueId();
        this.referenceNumber = builder.getReferenceNumber();

        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_BIZ_CARD_TO_CARD_LIST);
        else
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_BIZ_CARD_TO_CARD_LIST);

    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private Integer offset;
        private Integer size;
        private Boolean canEdit;
        private Boolean canceled;
        private String statusCode;
        private String causeCode;
        private Long causeId;
        private String fromDate;
        private String toDate;
        private Long fromAmount;
        private Long toAmount;
        private String uniqueId;
        private String referenceNumber;

        public Integer getOffset() {
            return offset;
        }

        public Boolean getCanEdit() {
            return canEdit;
        }

        public Builder setCanEdit(Boolean canEdit) {
            this.canEdit = canEdit;
            return this;
        }

        public Boolean getCanceled() {
            return canceled;
        }

        public Builder setCanceled(Boolean canceled) {
            this.canceled = canceled;
            return this;
        }

        public String getStatusCode() {
            return statusCode;
        }

        public Builder setStatusCode(String statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        public String getCauseCode() {
            return causeCode;
        }

        public Builder setCauseCode(String causeCode) {
            this.causeCode = causeCode;
            return this;
        }

        public Long getCauseId() {
            return causeId;
        }

        public Builder setCauseId(Long causeId) {
            this.causeId = causeId;
            return this;
        }

        public String getReferenceNumber() {
            return referenceNumber;
        }

        public Builder setReferenceNumber(String referenceNumber) {
            this.referenceNumber = referenceNumber;
            return this;
        }

        public Builder setOffset(Integer offset) {
            this.offset = offset;
            return this;
        }

        public Integer getSize() {
            return size;
        }

        public Builder setSize(Integer size) {
            this.size = size;
            return this;
        }

        public String getFromDate() {
            return fromDate;
        }

        public Builder setFromDate(String fromDate) throws PodException {
            String regex = "^[1][3-5][0-9]{2}\\/([1-9]|0[1-9]|1[0-2])\\/([1-2][0-9]|0[1-9]|3[0-1]|[1-9])( (2[0-3]|[01]?[0-9]):[0-5]?[0-9](:[0-5]?[0-9])?)?$";
            Pattern p = Pattern.compile(regex);
            Matcher mach = p.matcher(fromDate);
            if (mach.find() && mach.group().equals(fromDate))
                this.fromDate = fromDate;
            else
                throw PodException.invalidParameter(fromDate + " is not a valid fromDate");
            return this;
        }

        public String getToDate() {
            return toDate;
        }

        public Builder setToDate(String toDate) throws PodException {
            String regex = "^[1][3-5][0-9]{2}\\/([1-9]|0[1-9]|1[0-2])\\/([1-2][0-9]|0[1-9]|3[0-1]|[1-9])( (2[0-3]|[01]?[0-9]):[0-5]?[0-9](:[0-5]?[0-9])?)?$";
            Pattern p = Pattern.compile(regex);
            Matcher mach = p.matcher(toDate);
            if (mach.find() && mach.group().equals(toDate))
                this.toDate = toDate;
            else
                throw PodException.invalidParameter(toDate + " is not a valid toDate");
            return this;
        }

        public String getUniqueId() {
            return uniqueId;
        }

        public Builder setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
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


        public Long getFromAmount() {
            return fromAmount;
        }

        public Builder setFromAmount(Long fromAmount) {
            this.fromAmount = fromAmount;
            return this;
        }

        public Long getToAmount() {
            return toAmount;
        }

        public Builder setToAmount(Long toAmount) {
            this.toAmount = toAmount;
            return this;
        }


        public CardToCardListVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null && this.baseInfoVo.getServerType()!=null &&
                    this.baseInfoVo.getToken_issuer() != null && this.offset != null && this.size != null)
                return new CardToCardListVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }


    }
}