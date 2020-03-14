
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
    "appId",
    "code",
    "metadataVo"
})
public class ModuleVo {

    @JsonProperty("appId")
    private int appId;
    @JsonProperty("code")
    private int code;
    @JsonProperty("metadataVo")
    private MetadataVo metadataVo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("appId")
    public int getAppId() {
        return appId;
    }

    @JsonProperty("appId")
    public void setAppId(int appId) {
        this.appId = appId;
    }

    @JsonProperty("code")
    public int getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(int code) {
        this.code = code;
    }

    @JsonProperty("metadataVo")
    public MetadataVo getMetadataVo() {
        return metadataVo;
    }

    @JsonProperty("metadataVo")
    public void setMetadataVo(MetadataVo metadataVo) {
        this.metadataVo = metadataVo;
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
