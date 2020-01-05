package com.fanap.billingService.data.modelVo;

import com.fanap.billingService.exception.PodException;
import com.fanap.podBaseService.util.TypeConversionUtil;
import com.fanap.billingService.util.ScProductIdPodServicesProduction;
import com.fanap.billingService.util.ScProductIdPodServicesSandBox;

import java.time.LocalDate;

import static com.fanap.billingService.enums.Enum_Server_type.PRODUCTION;

public class PayInvoiceInFutureVo {


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, ott, date and invoiceId are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String invoiceId;
    private String date;
    private String guildCode;
    private String wallet;
    private static String scProductId;


    public PayInvoiceInFutureVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.invoiceId = TypeConversionUtil.longToString(builder.getInvoiceId());
        this.date = builder.getDate();
        this.guildCode = builder.getGuildCode();
        this.wallet = builder.getWallet();
        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_BIZ_PAY_INVOICE_IN_FUTURE);
        else
            this.scProductId = com.fanap.podBaseService.util.TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_BIZ_PAY_INVOICE_IN_FUTURE);

    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public String getDate() {
        return date;
    }

    public String getGuildCode() {
        return guildCode;
    }

    public String getWallet() {
        return wallet;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public static class Builder {

        private BaseInfoVo baseInfoVo;
        private Long invoiceId;
        private String date;
        private String guildCode;
        private String wallet;


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

        public Long getInvoiceId() {
            return invoiceId;
        }

        public Builder setInvoiceId(Long invoiceId) {
            this.invoiceId = invoiceId;
            return this;
        }

        public String getDate() {
            return date;
        }

        public Builder setDate(String date) {
            this.date = date;
            return this;
        }

        public Builder setDate(LocalDate date) {
            String s = date.toString();
            String[] q = s.split("-");
            int gy = Integer.parseInt(q[0]);
            int gm = Integer.parseInt(q[1]);
            int gd = Integer.parseInt(q[2]);
            String d = TypeConversionUtil.toShamsi(gy, gm, gd);
            this.date = d;
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

        public PayInvoiceInFutureVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.getInvoiceId() != null && this.getDate() != null )
                if (this.wallet != null && this.guildCode == null || this.wallet == null && this.guildCode != null)
                    return new PayInvoiceInFutureVo(this);
                else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);

        }


    }
}








