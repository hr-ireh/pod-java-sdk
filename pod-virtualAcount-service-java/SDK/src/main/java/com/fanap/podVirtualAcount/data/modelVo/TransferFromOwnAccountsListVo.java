package com.fanap.podVirtualAcount.data.modelVo;

import com.fanap.podBaseService.exception.PodException;
import com.fanap.podVirtualAcount.util.ScProductIdPodServicesProduction;
import com.fanap.podVirtualAcount.util.ScProductIdPodServicesSandBox;
import com.fanap.podBaseService.util.TypeConversionUtil;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.fanap.podBaseService.enums.Enum_Server_type.PRODUCTION;

public class TransferFromOwnAccountsListVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, serverType, offset and size are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String uniqueId;
    private String offset;
    private String size;
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

    public TransferFromOwnAccountsListVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.uniqueId =builder.getUniqueId();
        this.offset = TypeConversionUtil.intToString(builder.getOffset());
        this.size = TypeConversionUtil.intToString(builder.getSize());
        this.fromDate = builder.getFromDate();
        this.toDate = builder.getToDate();
        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_BIZ_TRANSFER_FROM_OWN_ACCOUNTS_LIST);
        else
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_BIZ_TRANSFER_FROM_OWN_ACCOUNTS_LIST);

    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private String uniqueId;
        private Integer offset;
        private Integer size;
        private String fromDate;
        private String toDate;

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

        public TransferFromOwnAccountsListVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.offset!=null && this.size!=null && this.baseInfoVo.getServerType()!=null)
                return new TransferFromOwnAccountsListVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }


    }
}
