package com.fanap.podAIPlatform.data.modelSrv;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Z.gholinia on 8/11/2019.
 */
public class Header {

    //    @JsonProperty("Cache-Control")
    private String cacheControl;
    //    @JsonProperty("Server")
    private String server;
    //    @JsonProperty("Access-Control-Allow-Origin")
    private String accessControlAllowOrigin;
    //    @JsonProperty("Access-Control-Allow-Credentials")
    private String accessControlAllowCredentials;
    //    @JsonProperty("Access-Control-Allow-Methods")
    private String accessControlAllowMethods;
    //    @JsonProperty("Pragma")
    private String pragma;
    //    @JsonProperty("Content-Length")
    private String contentLength;
    //    @JsonProperty("Date")
    private String date;
    //    @JsonProperty("Access-Control-Allow-Headers")
    private String accessControlAllowHeaders;
    //    @JsonProperty("Content-Type")
    private String contentType;
    //    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    //    @JsonProperty("Cache-Control")
    public String getCacheControl() {
        return cacheControl;
    }

    //    @JsonProperty("Cache-Control")
    public void setCacheControl(String cacheControl) {
        this.cacheControl = cacheControl;
    }

    //    @JsonProperty("Server")
    public String getServer() {
        return server;
    }

    //    @JsonProperty("Server")
    public void setServer(String server) {
        this.server = server;
    }

    //    @JsonProperty("Access-Control-Allow-Origin")
    public String getAccessControlAllowOrigin() {
        return accessControlAllowOrigin;
    }

    //    @JsonProperty("Access-Control-Allow-Origin")
    public void setAccessControlAllowOrigin(String accessControlAllowOrigin) {
        this.accessControlAllowOrigin = accessControlAllowOrigin;
    }

    //    @JsonProperty("Access-Control-Allow-Credentials")
    public String getAccessControlAllowCredentials() {
        return accessControlAllowCredentials;
    }

    //    @JsonProperty("Access-Control-Allow-Credentials")
    public void setAccessControlAllowCredentials(String accessControlAllowCredentials) {
        this.accessControlAllowCredentials = accessControlAllowCredentials;
    }

    //    @JsonProperty("Access-Control-Allow-Methods")
    public String getAccessControlAllowMethods() {
        return accessControlAllowMethods;
    }

    //    @JsonProperty("Access-Control-Allow-Methods")
    public void setAccessControlAllowMethods(String accessControlAllowMethods) {
        this.accessControlAllowMethods = accessControlAllowMethods;
    }

    //    @JsonProperty("Pragma")
    public String getPragma() {
        return pragma;
    }

    //    @JsonProperty("Pragma")
    public void setPragma(String pragma) {
        this.pragma = pragma;
    }

    //    @JsonProperty("Content-Length")
    public String getContentLength() {
        return contentLength;
    }

    //    @JsonProperty("Content-Length")
    public void setContentLength(String contentLength) {
        this.contentLength = contentLength;
    }

    //    @JsonProperty("Date")
    public String getDate() {
        return date;
    }

    //    @JsonProperty("Date")
    public void setDate(String date) {
        this.date = date;
    }

    //    @JsonProperty("Access-Control-Allow-Headers")
    public String getAccessControlAllowHeaders() {
        return accessControlAllowHeaders;
    }

    //    @JsonProperty("Access-Control-Allow-Headers")
    public void setAccessControlAllowHeaders(String accessControlAllowHeaders) {
        this.accessControlAllowHeaders = accessControlAllowHeaders;
    }

    //    @JsonProperty("Content-Type")
    public String getContentType() {
        return contentType;
    }

    //    @JsonProperty("Content-Type")
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    //    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    //    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}