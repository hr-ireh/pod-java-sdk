package com.fanap.AvandService.data.modelSrv;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Zahra.Gholinia on 2/4/2020.
 */
public class Header {

    private String cacheControl;
    private String server;
    private String accessControlAllowOrigin;
    private String accessControlAllowCredentials;
    private String accessControlAllowMethods;
    private String pragma;
    private String contentLength;
    private String date;
    private String accessControlAllowHeaders;
    private String contentType;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getCacheControl() {
        return cacheControl;
    }

    public void setCacheControl(String cacheControl) {
        this.cacheControl = cacheControl;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getAccessControlAllowOrigin() {
        return accessControlAllowOrigin;
    }

    public void setAccessControlAllowOrigin(String accessControlAllowOrigin) {
        this.accessControlAllowOrigin = accessControlAllowOrigin;
    }

    public String getAccessControlAllowCredentials() {
        return accessControlAllowCredentials;
    }

    public void setAccessControlAllowCredentials(String accessControlAllowCredentials) {
        this.accessControlAllowCredentials = accessControlAllowCredentials;
    }

    public String getAccessControlAllowMethods() {
        return accessControlAllowMethods;
    }

    public void setAccessControlAllowMethods(String accessControlAllowMethods) {
        this.accessControlAllowMethods = accessControlAllowMethods;
    }

    public String getPragma() {
        return pragma;
    }

    public void setPragma(String pragma) {
        this.pragma = pragma;
    }

    public String getContentLength() {
        return contentLength;
    }

    public void setContentLength(String contentLength) {
        this.contentLength = contentLength;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAccessControlAllowHeaders() {
        return accessControlAllowHeaders;
    }

    public void setAccessControlAllowHeaders(String accessControlAllowHeaders) {
        this.accessControlAllowHeaders = accessControlAllowHeaders;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}