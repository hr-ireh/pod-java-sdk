package com.fanap.podVirtualAcount.data.modelVo;

import com.fanap.podBaseService.exception.PodException;
import com.fanap.podVirtualAcount.util.ScProductIdPodServicesProduction;
import com.fanap.podVirtualAcount.util.ScProductIdPodServicesSandBox;
import com.fanap.podBaseService.util.TypeConversionUtil;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.fanap.podBaseService.enums.Enum_Server_type.PRODUCTION;

public class ListTransferByInvoiceVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, serverType, offset and size are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String invoiceId;
    private String guildCode;
    private String wallet;
    private String fromAmount;
    private String toAmount;
    private String currencyCode;
    private String offset;
    private String size;
    private String uniqueId;
    private String fromDate;
    private String toDate;
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

    public String getCurrencyCode() {
        return currencyCode;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public String getGuildCode() {
        return guildCode;
    }

    public String getWallet() {
        return wallet;
    }

    public ListTransferByInvoiceVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.invoiceId=TypeConversionUtil.longToString(builder.getInvoiceId());
        this.guildCode=builder.getGuildCode();
        this.wallet=builder.getWallet();
        this.fromAmount = TypeConversionUtil.longToString(builder.getFromAmount());
        this.toAmount = TypeConversionUtil.longToString(builder.getToAmount());
        this.currencyCode = builder.getCurrencyCode();
        this.uniqueId =builder.getUniqueId();
        this.offset = TypeConversionUtil.intToString(builder.getOffset());
        this.size = TypeConversionUtil.intToString(builder.getSize());
        this.fromDate = builder.getFromDate();
        this.toDate = builder.getToDate();
        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_BIZ_LIST_TRANSFER_BY_INVOICE);
        else
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_BIZ_LIST_TRANSFER_BY_INVOICE);

    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private Long invoiceId;
        private String guildCode;
        private String wallet;
        private Long fromAmount;
        private Long toAmount;
        private String currencyCode;
        private Integer offset;
        private Integer size;
        private String uniqueId;
        private String fromDate;
        private String toDate;

        public Integer getOffset() {
            return offset;
        }

        public Long getInvoiceId() {
            return invoiceId;
        }

        public Builder setInvoiceId(Long invoiceId) {
            this.invoiceId = invoiceId;
            return this;
        }

        public String getGuildCode() {
            return guildCode;
        }

        public Builder setGuildCode(String guildCode) {
            this.guildCode = guildCode;
            return this;
        }

        public String getWallet() {
            return wallet;
        }

        public Builder setWallet(String wallet) {
            this.wallet = wallet;
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
            String regex = "^[1][3-5][0-9]{2}\\/([1-9]|0[1-9]|1[0-2])\\/([1-2][0-9]|0[1-9]|3[0-1]|[1-9])$";
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
            String regex = "^[1][3-5][0-9]{2}\\/([1-9]|0[1-9]|1[0-2])\\/([1-2][0-9]|0[1-9]|3[0-1]|[1-9])$";
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

        public String getCurrencyCode() {
            return currencyCode;
        }

        public Builder setCurrencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
            return this;
        }

        public ListTransferByInvoiceVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.offset != null && this.size != null && this.baseInfoVo.getServerType()!=null)
                return new ListTransferByInvoiceVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }


    }
}
