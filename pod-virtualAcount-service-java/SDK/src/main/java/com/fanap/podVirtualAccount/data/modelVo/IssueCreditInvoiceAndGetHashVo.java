package com.fanap.podVirtualAccount.data.modelVo;

import com.fanap.podBaseService.exception.PodException;
import com.fanap.podBaseService.util.TypeConversionUtil;
import com.fanap.podVirtualAccount.util.ScProductIdPodServicesProduction;
import com.fanap.podVirtualAccount.util.ScProductIdPodServicesSandBox;

import static com.fanap.podBaseService.enums.Enum_Server_type.PRODUCTION;

/**
 * Created by Zahra Golinia on 2/4/2020.
 */

public class IssueCreditInvoiceAndGetHashVo {


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, serverType, amount , billNumber, redirectUrl, userId and wallet are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String amount;
    private String userId;
    private String billNumber;
    private String wallet;
    private String redirectUrl;
    private static String scProductId;


    public String getAmount() {
        return amount;
    }

    public String getUserId() {
        return userId;
    }

    public String getBillNumber() {
        return billNumber;
    }

    public String getWallet() {
        return wallet;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public IssueCreditInvoiceAndGetHashVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.amount = TypeConversionUtil.longToString(builder.getAmount());
        this.userId = TypeConversionUtil.longToString(builder.getUserId());
        this.billNumber = builder.getBillNumber();
        this.wallet = builder.getWallet();
        this.redirectUrl = builder.getRedirectUrl();
        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_BIZ_ISSUE_CREDIT_INVOICE_AND_GET_HASH);
        else
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_BIZ_ISSUE_CREDIT_INVOICE_AND_GET_HASH);

    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private Long amount;
        private Long userId;
        private String billNumber;
        private String wallet;
        private String redirectUrl;


        public Long getAmount() {
            return amount;
        }

        public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
        }

        public Long getUserId() {
            return userId;
        }

        public Builder setUserId(Long userId) {
            this.userId = userId;
            return this;
        }

        public String getBillNumber() {
            return billNumber;
        }

        public Builder setBillNumber(String billNumber) {
            this.billNumber = billNumber;
            return this;
        }

        public String getWallet() {
            return wallet;
        }

        public Builder setWallet(String wallet) {
            this.wallet = wallet;
            return this;
        }

        public String getRedirectUrl() {
            return redirectUrl;
        }

        public Builder setRedirectUrl(String redirectUrl) {
            this.redirectUrl = redirectUrl;
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

        public IssueCreditInvoiceAndGetHashVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.baseInfoVo.getServerType() != null &&
                    this.amount != null && this.billNumber != null && this.redirectUrl != null
                    && this.userId != null && this.wallet != null)
                return new IssueCreditInvoiceAndGetHashVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }


    }

    public String getLink(String hash) {
        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
            return " https://core.pod.land/nzh/payAnyCreditInvoice?hash=" + hash + "&gateway=PEP";
        else
            return " http://sandbox.pod.land:8080/nzh/payAnyCreditInvoice?hash=" + hash + "&gateway=LOC";
    }


}
