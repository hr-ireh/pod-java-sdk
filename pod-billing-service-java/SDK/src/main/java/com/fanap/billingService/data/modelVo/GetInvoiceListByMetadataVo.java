package com.fanap.billingService.data.modelVo;

import com.fanap.billingService.exception.PodException;
import com.fanap.billingService.util.ScProductIdPodServicesProduction;
import com.fanap.billingService.util.ScProductIdPodServicesSandBox;
import com.fanap.podBaseService.util.TypeConversionUtil;

import static com.fanap.billingService.enums.Enum_Server_type.PRODUCTION;

/**
 * Created by Shahab Askarian on 5/28/2019.
 */
public class GetInvoiceListByMetadataVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token and token_issuer and metaQuery are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String metaQuery;
    private String isCanceled;
    private String isPayed;
    private String offset;
    private String size;
    private static String scProductId;


    public GetInvoiceListByMetadataVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.isCanceled = TypeConversionUtil.booleanToString(builder.getIsCanceled());
        this.isPayed = TypeConversionUtil.booleanToString(builder.getIsPayed());
        this.offset = TypeConversionUtil.intToString(builder.getOffset());
        this.size = TypeConversionUtil.intToString(builder.getSize());
        this.metaQuery = builder.getMetaQuery();
        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_BIZ_GET_INVOICE_LIST_BY_METADATA);
        else
            this.scProductId = com.fanap.podBaseService.util.TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_BIZ_GET_INVOICE_LIST_BY_METADATA);
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getIsCanceled() {
        return isCanceled;
    }

    public String getIsPayed() {
        return isPayed;
    }

    public String getOffset() {
        return offset;
    }

    public String getSize() {
        return size;
    }

    public String getMetaQuery() {
        return metaQuery;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public static class Builder {

        private BaseInfoVo baseInfoVo;
        private String metaQuery;
        private Boolean isCanceled;
        private Boolean isPayed;
        private Integer offset;
        private Integer size;

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

        public Boolean getIsCanceled() {
            return isCanceled;
        }

        public Builder setIsCanceled(Boolean isCanceled) {
            this.isCanceled = isCanceled;
            return this;
        }

        public Boolean getIsPayed() {
            return isPayed;
        }

        public Builder setIsPayed(Boolean isPayed) {
            this.isPayed = isPayed;
            return this;
        }

        public Integer getOffset() {
            return offset;
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

        public String getMetaQuery() {
            return metaQuery;
        }

        public Builder setMetaQuery(String metaQuery) {
            this.metaQuery = metaQuery;
            return this;
        }

        public GetInvoiceListByMetadataVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.metaQuery != null)
                return new GetInvoiceListByMetadataVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}
