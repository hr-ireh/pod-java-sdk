package com.fanap.billingService.data.modelVo;

import com.fanap.billingService.exception.PodException;
import com.fanap.billingService.util.ScProductIdPodServicesProduction;
import com.fanap.billingService.util.ScProductIdPodServicesSandBox;
import com.fanap.podBaseService.util.TypeConversionUtil;

import java.time.LocalDate;

import static com.fanap.billingService.enums.Enum_Server_type.PRODUCTION;

public class ListSettlementsVo {


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer,offset, size are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String statusCode;
    private String currencyCode;
    private String fromAmount;
    private String toAmount;
    private String fromDate;
    private String toDate;
    private String offset;
    private String uniqueId;
    private String size;
    private String id;
    private String firstName;
    private String lastName;
    private String toolCode;
    private String toolId;
    private static String scProductId;


    public ListSettlementsVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.firstName = builder.getFirstName();
        this.lastName = builder.getLastName();
        this.statusCode = builder.getStatusCode();
        this.fromAmount = TypeConversionUtil.doubleToString(builder.getFromAmount());
        this.toAmount = TypeConversionUtil.doubleToString(builder.getToAmount());
        this.currencyCode = builder.getCurrencyCode();
        this.uniqueId = builder.getUniqueId();
        this.fromDate = TypeConversionUtil.localDateToString(builder.getFromDate());
        this.toDate = TypeConversionUtil.localDateToString(builder.getToDate());
        this.offset = TypeConversionUtil.intToString(builder.getOffset());
        this.size = TypeConversionUtil.intToString(builder.getSize());
        this.id = TypeConversionUtil.longToString(builder.getId());
        this.toolCode = builder.getToolCode();
        this.toolId = builder.getToolId();
        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_LIST_SETTLEMENTS);
        else
            this.scProductId = com.fanap.podBaseService.util.TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_LIST_SETTLEMENTS);

    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public String getFromAmount() {
        return fromAmount;
    }

    public String getToAmount() {
        return toAmount;
    }

    public String getFromDate() {
        return fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public String getOffset() {
        return offset;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public String getSize() {
        return size;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getToolCode() {
        return toolCode;
    }

    public String getToolId() {
        return toolId;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public static class Builder {

        private BaseInfoVo baseInfoVo;
        private String statusCode;
        private String currencyCode;
        private Double fromAmount;
        private Double toAmount;
        private LocalDate fromDate;
        private LocalDate toDate;
        private Integer offset;
        private String uniqueId;
        private Integer size;
        private Long id;
        private String firstName;
        private String lastName;
        private String toolCode;
        private String toolId;


        public String getFirstName() {
            return firstName;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public String getLastName() {
            return lastName;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public String getStatusCode() {
            return statusCode;
        }

        public Builder setStatusCode(String statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        public String getCurrencyCode() {
            return currencyCode;
        }

        public Builder setCurrencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
            return this;
        }


        public LocalDate getFromDate() {
            return fromDate;
        }

        public Builder setFromDate(LocalDate fromDate) {
            this.fromDate = fromDate;
            return this;
        }

        public LocalDate getToDate() {
            return toDate;
        }

        public Builder setToDate(LocalDate toDate) {
            this.toDate = toDate;
            return this;
        }


        public String getUniqueId() {
            return uniqueId;
        }

        public Builder setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }

        public Double getFromAmount() {
            return fromAmount;
        }

        public Builder setFromAmount(Double fromAmount) {
            this.fromAmount = fromAmount;
            return this;
        }

        public Double getToAmount() {
            return toAmount;
        }

        public Builder setToAmount(Double toAmount) {
            this.toAmount = toAmount;
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

        public Long getId() {
            return id;
        }

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public String getToolCode() {
            return toolCode;
        }

        public Builder setToolCode(String toolCode) {
            this.toolCode = toolCode;
            return this;
        }

        public String getToolId() {
            return toolId;
        }

        public Builder setToolId(String toolId) {
            this.toolId = toolId;
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


        public ListSettlementsVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.offset != null && this.size != null)
                return new ListSettlementsVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }


    }


}

