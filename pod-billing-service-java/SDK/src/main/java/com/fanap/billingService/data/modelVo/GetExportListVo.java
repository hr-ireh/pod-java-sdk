package com.fanap.billingService.data.modelVo;

import com.fanap.billingService.data.modelSrv.LinkSrv;
import com.fanap.billingService.exception.PodException;
import com.fanap.billingService.util.ScProductIdPodServicesProduction;
import com.fanap.billingService.util.ScProductIdPodServicesSandBox;
import com.fanap.podBaseService.util.TypeConversionUtil;

import static com.fanap.billingService.enums.Enum_Server_type.PRODUCTION;

public class GetExportListVo {


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, Offset and size are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String offset;
    private String size;
    private String id;
    private String statusCode;
    private String serviceUrl;
    private static String scProductId;


    public GetExportListVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.offset = TypeConversionUtil.intToString(builder.getOffset());
        this.size = TypeConversionUtil.intToString(builder.getSize());
        this.id = TypeConversionUtil.longToString(builder.getId());
        this.statusCode = builder.getStatusCode();

        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
        this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_BIZ_GET_EXPORT_LIST);
        else
            this.scProductId = com.fanap.podBaseService.util.TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_BIZ_GET_EXPORT_LIST);

    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getId() {
        return id;
    }


    public String getOffset() {
        return offset;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public String getServiceUrl() {
        return serviceUrl;
    }

    public String getSize() {
        return size;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public static class Builder {

        private BaseInfoVo baseInfoVo;
        private Integer offset;
        private Integer size;
        private Long id;
        private String statusCode;
        private String serviceUrl;


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

        public String getStatusCode() {
            return statusCode;
        }

        public Builder setStatusCode(String statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        public String getServiceUrl() {
            return serviceUrl;
        }

        public Builder setServiceUrl(String serviceUrl) {
            this.serviceUrl = serviceUrl;
            return this;
        }


        public GetExportListVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.offset != null &&
                    this.size != null)
                return new GetExportListVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }


    public LinkSrv getLink(long fileId, String hashCode) {
        String message = "The field is required.";
        if (hashCode == null || hashCode.isEmpty() == true) try {
            throw PodException.invalidParameter(message);
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
        if (fileId <= 0) try {
            throw PodException.invalidParameter(message);
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
        LinkSrv linkSrv = new LinkSrv();
        linkSrv.setHashCode(hashCode);
        linkSrv.setRedirectUrl("https://core.pod.ir/nzh/file/?fileId=" + fileId + "&hashCode=" + hashCode);
        return linkSrv;
    }

}





