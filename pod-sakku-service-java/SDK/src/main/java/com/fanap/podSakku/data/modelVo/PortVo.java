
package com.fanap.podSakku.data.modelVo;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "basicAuthentication",
    "host",
    "onlyInternal",
    "port",
    "protocol",
    "ssl"
})
public class PortVo {

    @JsonProperty("basicAuthentication")
    private boolean basicAuthentication;
    @JsonProperty("host")
    private int host;
    @JsonProperty("onlyInternal")
    private boolean onlyInternal;
    @JsonProperty("port")
    private int port;
    @JsonProperty("protocol")
    private String protocol;
    @JsonProperty("ssl")
    private boolean ssl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("basicAuthentication")
    public boolean isBasicAuthentication() {
        return basicAuthentication;
    }

    @JsonProperty("basicAuthentication")
    public void setBasicAuthentication(boolean basicAuthentication) {
        this.basicAuthentication = basicAuthentication;
    }

    @JsonProperty("host")
    public int getHost() {
        return host;
    }

    @JsonProperty("host")
    public void setHost(int host) {
        this.host = host;
    }

    @JsonProperty("onlyInternal")
    public boolean isOnlyInternal() {
        return onlyInternal;
    }

    @JsonProperty("onlyInternal")
    public void setOnlyInternal(boolean onlyInternal) {
        this.onlyInternal = onlyInternal;
    }

    @JsonProperty("port")
    public int getPort() {
        return port;
    }

    @JsonProperty("port")
    public void setPort(int port) {
        this.port = port;
    }

    @JsonProperty("protocol")
    public String getProtocol() {
        return protocol;
    }

    @JsonProperty("protocol")
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    @JsonProperty("ssl")
    public boolean isSsl() {
        return ssl;
    }

    @JsonProperty("ssl")
    public void setSsl(boolean ssl) {
        this.ssl = ssl;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
