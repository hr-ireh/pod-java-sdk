package com.fanap.billingService.data.modelVo;

import com.fanap.billingService.exception.PodException;
import com.fanap.podBaseService.util.ScProductIdPodServicesSandBox;
import com.fanap.podBaseService.util.TypeConversionUtil;

public class PayInvoiceByWalletVo {
    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, ott, date and invoiceId are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String invoiceId;
    private String redirectUri;
    private String callUri;


    public PayInvoiceByWalletVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.invoiceId = TypeConversionUtil.longToString(builder.getInvoiceId());
        this.redirectUri = builder.getRedirectUri();
        this.callUri = builder.getCallUri();

    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public String getRedirectUri() {
        return redirectUri;
    }

    public String getCallUri() {
        return callUri;
    }

    public static class Builder {

        private BaseInfoVo baseInfoVo;
        private Long invoiceId;
        private String redirectUri;
        private String callUri;


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

        public String getRedirectUri() {
            return redirectUri;
        }

        public Builder setRedirectUri(String redirectUri) {
            this.redirectUri = redirectUri;
            return this;
        }

        public String getCallUri() {
            return callUri;
        }

        public Builder setCallUri(String callUri) {
            this.callUri = callUri;
            return this;
        }

        public PayInvoiceByWalletVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.getInvoiceId() != null )
                return new PayInvoiceByWalletVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }


    }


    public String getLink()
    {
        return  "https://pay.pod.ir/v1/pbc/payinvoice/?invoiceId="+invoiceId+"&redirectUri="+redirectUri+"&callUri="+callUri;
    }


}

