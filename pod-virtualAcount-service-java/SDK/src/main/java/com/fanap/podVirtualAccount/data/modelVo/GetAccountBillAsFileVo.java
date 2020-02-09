package com.fanap.podVirtualAccount.data.modelVo;

import com.fanap.podBaseService.exception.PodException;
import com.fanap.podBaseService.util.TypeConversionUtil;
import com.fanap.podVirtualAccount.util.ScProductIdPodServicesProduction;
import com.fanap.podVirtualAccount.util.ScProductIdPodServicesSandBox;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.fanap.podBaseService.enums.Enum_Server_type.PRODUCTION;

/**
 * Created by Zahra Golinia on 2/4/2020.
 */

public class GetAccountBillAsFileVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, serverType, dateTo or dateFrom are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String dateFrom;
    private String dateTo;
    private String description;
    private String amountFrom;
    private String amountTo;
    private String block;
    private String guildCode;
    private String currencyCode;
    private String debtor;
    private String lastNRows;
    private String callbackUrl;
    private static String scProductId;


    public static String getScProductId() {
        return scProductId;
    }

    public String getDateFrom() {
        return dateFrom;
    }

    public String getDateTo() {
        return dateTo;
    }

    public String getDescription() {
        return description;
    }

    public String getAmountFrom() {
        return amountFrom;
    }

    public String getAmountTo() {
        return amountTo;
    }

    public String getBlock() {
        return block;
    }

    public String getGuildCode() {
        return guildCode;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public String getDebtor() {
        return debtor;
    }

    public String getLastNRows() {
        return lastNRows;
    }

    public String getCallbackUrl() {
        return callbackUrl;
    }


    public GetAccountBillAsFileVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.dateFrom = builder.getDateFrom();
        this.dateTo = builder.getDateTo();
        this.description = builder.getDescription();
        this.amountFrom = TypeConversionUtil.longToString(builder.getAmountFrom());
        this.amountTo = TypeConversionUtil.longToString(builder.getAmountTo());
        this.block = TypeConversionUtil.booleanToString(builder.getBlock());
        this.guildCode = builder.getGuildCode();
        this.currencyCode = builder.getCurrencyCode();
        this.debtor = TypeConversionUtil.booleanToString(builder.getDebtor());
        this.lastNRows = TypeConversionUtil.intToString(builder.getLastNRows());
        this.callbackUrl = builder.getCallbackUrl();
        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_BIZ_GET_ACCOUNT_BILL_AS_FILE);
        else
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_BIZ_GET_ACCOUNT_BILL_AS_FILE);

    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private String dateFrom;
        private String dateTo;
        private String description;
        private Long amountFrom;
        private Long amountTo;
        private Boolean block;
        private String guildCode;
        private String currencyCode;
        private Boolean debtor;
        private Integer lastNRows;
        private String callbackUrl;


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

        public String getDateFrom() {
            return dateFrom;
        }

        public Builder setDateFrom(String dateFrom) throws PodException {
            String regex = "^[1][3-5][0-9]{2}\\/([1-9]|0[1-9]|1[0-2])\\/([1-2][0-9]|0[1-9]|3[0-1]|[1-9])$";
            Pattern p = Pattern.compile(regex);
            Matcher mach = p.matcher(dateFrom);
            if (mach.find() && mach.group().equals(dateFrom))
                this.dateFrom = dateFrom;
            else
                throw PodException.invalidParameter(dateFrom + " is not a valid dateFrom");
            return this;
        }

        public String getDateTo() {
            return dateTo;
        }

        public Builder setDateTo(String dateTo) throws PodException {
            String regex = "^[1][3-5][0-9]{2}\\/([1-9]|0[1-9]|1[0-2])\\/([1-2][0-9]|0[1-9]|3[0-1]|[1-9])$";
            Pattern p = Pattern.compile(regex);
            Matcher mach = p.matcher(dateTo);
            if (mach.find() && mach.group().equals(dateTo))
                this.dateTo = dateTo;
            else
                throw PodException.invalidParameter(dateTo + " is not a valid dateTo");
            return this;
        }

        public String getDescription() {
            return description;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Long getAmountFrom() {
            return amountFrom;
        }

        public Builder setAmountFrom(Long amountFrom) {
            this.amountFrom = amountFrom;
            return this;
        }

        public Long getAmountTo() {
            return amountTo;
        }

        public Builder setAmountTo(Long amountTo) {
            this.amountTo = amountTo;
            return this;
        }

        public Boolean getBlock() {
            return block;
        }

        public Builder setBlock(Boolean block) {
            this.block = block;
            return this;
        }

        public String getGuildCode() {
            return guildCode;
        }

        public Builder setGuildCode(String guildCode) {
            this.guildCode = guildCode;
            return this;
        }

        public String getCurrencyCode() {
            return currencyCode;
        }

        public Builder setCurrencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
            return this;
        }

        public Boolean getDebtor() {
            return debtor;
        }

        public Builder setDebtor(Boolean debtor) {
            this.debtor = debtor;
            return this;
        }

        public Integer getLastNRows() {
            return lastNRows;
        }

        public Builder setLastNRows(Integer lastNRows) {
            this.lastNRows = lastNRows;
            return this;
        }

        public String getCallbackUrl() {
            return callbackUrl;
        }

        public Builder setCallbackUrl(String callbackUrl) {
            this.callbackUrl = callbackUrl;
            return this;
        }

        public GetAccountBillAsFileVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.baseInfoVo.getServerType() != null)
                if (this.dateFrom != null || this.dateTo != null)
                    return new GetAccountBillAsFileVo(this);
            throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }


    }
}