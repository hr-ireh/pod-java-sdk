package com.fanap.podTools.data.modelVo;

import com.fanap.podTools.exception.PodException;
import com.fanap.podTools.util.ToolsProductId;
import com.fanap.podTools.util.TypeConversionUtil;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PayedBillListVo {


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, serverType ,productId,apiKey, origins and destinations are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String id;
    private String referenceNumber;
    private String fromDate;
    private String toDate;
    private String billId;
    private String paymentId;
    private String offset;
    private String size;
    private static String scProductId;


    public String getBillId() {
        return billId;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public String getId() {
        return id;
    }

    public String getReferenceNumber() {
        return referenceNumber;
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

    public String getSize() {
        return size;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public PayedBillListVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.scProductId = TypeConversionUtil.intToString(ToolsProductId.PAYED_BILL_LIST);
        this.billId = TypeConversionUtil.longToString(builder.getBillId());
        this.paymentId = TypeConversionUtil.longToString(builder.getPaymentId());
        this.id = TypeConversionUtil.longToString(builder.getId());
        this.referenceNumber = builder.getReferenceNumber();
        this.fromDate = builder.getFromDate();
        this.toDate = builder.getToDate();
        this.size = TypeConversionUtil.intToString(builder.getSize());
        this.offset = TypeConversionUtil.intToString(builder.getOffset());

    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private Long id;
        private String referenceNumber;
        private String fromDate;
        private String toDate;
        private Long billId;
        private Long paymentId;
        private Integer offset;
        private Integer size;


        public Long getBillId() {
            return billId;
        }

        public Builder setBillId(Long billId) throws PodException {
            String regex = "^[0-9]{4,11}[1-6][0-9]$";
            Pattern p = Pattern.compile(regex);
            Matcher mach = p.matcher(billId.toString());
            if (mach.find() && mach.group().equals(billId.toString()))
                this.billId = billId;
            else
                throw PodException.invalidParameter(billId.toString() + " is not a valid billId");
            return this;
        }

        public Long getPaymentId() {
            return paymentId;
        }

        public Builder setPaymentId(Long paymentId) throws PodException {
            String regex = "^[0-9]{6,13}$";
            Pattern p = Pattern.compile(regex);
            Matcher mach = p.matcher(paymentId.toString());
            if (mach.find() && mach.group().equals(paymentId.toString()))
                this.paymentId = paymentId;
            else
                throw PodException.invalidParameter(paymentId.toString() + " is not a valid paymentId");
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

        public Long getId() {
            return id;
        }

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public String getReferenceNumber() {
            return referenceNumber;
        }

        public Builder setReferenceNumber(String referenceNumber) {
            this.referenceNumber = referenceNumber;
            return this;
        }

        public String getFromDate() {
            return fromDate;
        }

        public Builder setFromDate(String fromDate) {
            this.fromDate = fromDate;
            return this;
        }

        public String getToDate() {
            return toDate;
        }

        public Builder setToDate(String toDate) {
            this.toDate = toDate;
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

        public PayedBillListVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null &&
                    this.size != null && this.offset != null)
                return new PayedBillListVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }

}



