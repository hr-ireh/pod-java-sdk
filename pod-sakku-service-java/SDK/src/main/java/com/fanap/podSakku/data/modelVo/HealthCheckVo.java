
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
    "checkRate",
    "endpoint",
    "initialDelay",
    "responseCode",
    "responseString",
    "scheme"
})
public class HealthCheckVo {

    @JsonProperty("checkRate")
    private int checkRate;
    @JsonProperty("endpoint")
    private String endpoint;
    @JsonProperty("initialDelay")
    private int initialDelay;
    @JsonProperty("responseCode")
    private int responseCode;
    @JsonProperty("responseString")
    private String responseString;
    @JsonProperty("scheme")
    private String scheme;

    @JsonProperty("checkRate")
    public int getCheckRate() {
        return checkRate;
    }

    @JsonProperty("checkRate")
    public void setCheckRate(int checkRate) {
        this.checkRate = checkRate;
    }

    @JsonProperty("endpoint")
    public String getEndpoint() {
        return endpoint;
    }

    @JsonProperty("endpoint")
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    @JsonProperty("initialDelay")
    public int getInitialDelay() {
        return initialDelay;
    }

    @JsonProperty("initialDelay")
    public void setInitialDelay(int initialDelay) {
        this.initialDelay = initialDelay;
    }

    @JsonProperty("responseCode")
    public int getResponseCode() {
        return responseCode;
    }

    @JsonProperty("responseCode")
    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    @JsonProperty("responseString")
    public String getResponseString() {
        return responseString;
    }

    @JsonProperty("responseString")
    public void setResponseString(String responseString) {
        this.responseString = responseString;
    }

    @JsonProperty("scheme")
    public String getScheme() {
        return scheme;
    }

    @JsonProperty("scheme")
    public void setScheme(String scheme) {
        this.scheme = scheme;
    }


}
