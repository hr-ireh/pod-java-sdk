package com.fanap.podTools.data.modelVo;

import com.fanap.podTools.exception.PodException;
import com.fanap.podTools.util.ToolsProductId;
import com.fanap.podTools.util.TypeConversionUtil;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PayBillVo {


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, serverType ,productId,apiKey, origins and destinations are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String billId;
    private String paymentId;
    private static String scProductId;

    public String getBillId() {
        return billId;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public PayBillVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.scProductId = TypeConversionUtil.intToString(ToolsProductId.PAY_BILL);
        this.billId = TypeConversionUtil.longToString(builder.getBillId());
        this.paymentId = TypeConversionUtil.longToString(builder.getPaymentId());

    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private Long billId;
        private Long paymentId;


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

        public PayBillVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null &&
                    this.billId != null && this.paymentId != null)
                return new PayBillVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }

}
