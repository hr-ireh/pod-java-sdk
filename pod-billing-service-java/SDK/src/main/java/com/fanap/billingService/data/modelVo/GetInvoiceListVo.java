package com.fanap.billingService.data.modelVo;

import com.fanap.billingService.exception.PodException;
import com.fanap.billingService.util.ScProductIdPodServicesProduction;
import com.fanap.billingService.util.ScProductIdPodServicesSandBox;
import com.fanap.podBaseService.util.TypeConversionUtil;

import java.time.LocalDateTime;
import java.util.List;

import static com.fanap.billingService.enums.Enum_Server_type.PRODUCTION;

/**
 * Created by Shahab Askarian on 5/28/2019.
 */
public class GetInvoiceListVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, Offset and size are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String id;
    private String billNumber;
    private String uniqueNumber;
    private String trackerId;
    private String fromDate;
    private String toDate;
    private String isCanceled;
    private String isPayed;
    private String isClosed;
    private String isWaiting;
    private String guildCode;
    private String referenceNumber;
    private String userId;
    private List<String> issuerId;
    private String query;
    private String firstId;
    private String lastId;
    private String offset;
    private List<String> entityIdList;
    private String size;
    private static String scProductId;

    public GetInvoiceListVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.id = TypeConversionUtil.longToString(builder.getId());
        this.billNumber = builder.getBillNumber();
        this.uniqueNumber = builder.getUniqueNumber();
        this.trackerId = builder.getTrackerId();
        this.fromDate = TypeConversionUtil.localDateTimeToString(builder.getFromDate());
        this.toDate = TypeConversionUtil.localDateTimeToString(builder.getToDate());
        this.isCanceled = TypeConversionUtil.booleanToString(builder.getIsCanceled());
        this.isPayed = TypeConversionUtil.booleanToString(builder.getIsPayed());
        this.isClosed = TypeConversionUtil.booleanToString(builder.getIsClosed());
        this.isWaiting = TypeConversionUtil.booleanToString(builder.getIsWaiting());
        this.guildCode = builder.getGuildCode();
        this.referenceNumber = builder.getReferenceNumber();
        this.userId = TypeConversionUtil.longToString(builder.getUserId());
        this.issuerId = TypeConversionUtil.longToString(builder.getIssuerId());
        this.query = builder.getQuery();
        this.firstId = TypeConversionUtil.longToString(builder.getFirstId());
        this.lastId = TypeConversionUtil.longToString(builder.getLastId());
        this.offset = TypeConversionUtil.intToString(builder.getOffset());
        this.entityIdList = TypeConversionUtil.longToString(builder.getEntityIdList());
        this.size = TypeConversionUtil.intToString(builder.getSize());
        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_BIZ_GET_INVOICE_LIST);
        else
            this.scProductId = com.fanap.podBaseService.util.TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_BIZ_GET_INVOICE_LIST);
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getId() {
        return id;
    }

    public String getBillNumber() {
        return billNumber;
    }

    public String getUniqueNumber() {
        return uniqueNumber;
    }

    public String getTrackerId() {
        return trackerId;
    }

    public String getFromDate() {
        return fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public String getIsCanceled() {
        return isCanceled;
    }

    public String getIsPayed() {
        return isPayed;
    }

    public String getIsClosed() {
        return isClosed;
    }

    public String getIsWaiting() {
        return isWaiting;
    }

    public String getGuildCode() {
        return guildCode;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public String getUserId() {
        return userId;
    }

    public List<String> getIssuerId() {
        return issuerId;
    }

    public String getQuery() {
        return query;
    }

    public String getFirstId() {
        return firstId;
    }

    public String getLastId() {
        return lastId;
    }

    public String getOffset() {
        return offset;
    }

    public List<String> getEntityIdList() {
        return entityIdList;
    }

    public String getSize() {
        return size;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public static class Builder {

        private BaseInfoVo baseInfoVo;
        private Long id;
        private String billNumber;
        private String uniqueNumber;
        private String trackerId;
        private LocalDateTime fromDate;
        private LocalDateTime toDate;
        private Boolean isCanceled;
        private Boolean isPayed;
        private Boolean isClosed;
        private Boolean isWaiting;
        private String guildCode;
        private String referenceNumber;
        private Long userId;
        private List<Long> issuerId;
        private String query;
        private Long firstId;
        private Long lastId;
        private Integer offset;
        private List<Long> entityIdList;
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

        public Long getId() {
            return id;
        }

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public String getBillNumber() {
            return billNumber;
        }

        public Builder setBillNumber(String billNumber) {
            this.billNumber = billNumber;
            return this;
        }

        public String getUniqueNumber() {
            return uniqueNumber;
        }

        public Builder setUniqueNumber(String uniqueNumber) {
            this.uniqueNumber = uniqueNumber;
            return this;
        }

        public String getTrackerId() {
            return trackerId;
        }

        public Builder setTrackerId(String trackerId) {
            this.trackerId = trackerId;
            return this;
        }

        public LocalDateTime getFromDate() {
            return fromDate;
        }

        public Builder setFromDate(LocalDateTime fromDate) {
            this.fromDate = fromDate;
            return this;
        }

        public LocalDateTime getToDate() {
            return toDate;
        }

        public Builder setToDate(LocalDateTime toDate) {
            this.toDate = toDate;
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

        public Boolean getIsClosed() {
            return isClosed;
        }

        public Builder setIsClosed(Boolean isClosed) {
            this.isClosed = isClosed;
            return this;
        }

        public Boolean getIsWaiting() {
            return isWaiting;
        }

        public Builder setIsWaiting(Boolean isWaiting) {
            this.isWaiting = isWaiting;
            return this;
        }

        public String getGuildCode() {
            return guildCode;
        }

        public Builder setGuildCode(String guildCode) {
            this.guildCode = guildCode;
            return this;
        }

        public String getReferenceNumber() {
            return referenceNumber;
        }

        public Builder setReferenceNumber(String referenceNumber) {
            this.referenceNumber = referenceNumber;
            return this;
        }

        public Long getUserId() {
            return userId;
        }

        public Builder setUserId(Long userId) {
            this.userId = userId;
            return this;
        }

        public List<Long> getIssuerId() {
            return issuerId;
        }

        public Builder setIssuerId(List<Long> issuerId) {
            this.issuerId = issuerId;
            return this;
        }

        public String getQuery() {
            return query;
        }

        public Builder setQuery(String query) {
            this.query = query;
            return this;
        }

        public Long getFirstId() {
            return firstId;
        }

        public Builder setFirstId(Long firstId) {
            this.firstId = firstId;
            return this;
        }

        public Long getLastId() {
            return lastId;
        }

        public Builder setLastId(Long lastId) {
            this.lastId = lastId;
            return this;
        }

        public Integer getOffset() {
            return offset;
        }

        public Builder setOffset(Integer offset) {
            this.offset = offset;
            return this;
        }

        public List<Long> getEntityIdList() {
            return entityIdList;
        }

        public Builder setEntityIdList(List<Long> productIdList) {
            this.entityIdList = productIdList;
            return this;
        }

        public Integer getSize() {
            return size;
        }

        public Builder setSize(Integer size) {
            this.size = size;
            return this;
        }

        public GetInvoiceListVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.offset != null &&
                    this.size != null)
                return new GetInvoiceListVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}
