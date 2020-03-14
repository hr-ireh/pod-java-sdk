
package com.fanap.podSakku.data.modelSrv;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "ownerId",
    "name",
    "uid",
    "image",
    "instances",
    "desc",
    "created",
    "access",
    "configuration",
    "status",
    "deployType",
    "ports",
    "collaborative",
    "environments",
    "userModule",
    "dependency",
    "basicAuthentications"
})
public class CreateApplicationSrv {

    @JsonProperty("id")
    private String id;
    @JsonProperty("ownerId")
    private int ownerId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("uid")
    private Object uid;
    @JsonProperty("image")
    private Object image;
    @JsonProperty("instances")
    private Object instances;
    @JsonProperty("desc")
    private Object desc;
    @JsonProperty("created")
    private String created;
    @JsonProperty("access")
    private Object access;
    @JsonProperty("configuration")
    private ConfigurationSrv configuration;
    @JsonProperty("status")
    private String status;
    @JsonProperty("deployType")
    private String deployType;
    @JsonProperty("ports")
    private List<PortSrv> ports = null;
    @JsonProperty("collaborative")
    private boolean collaborative;
    @JsonProperty("environments")
    private Environments environments;
    @JsonProperty("userModule")
    private Object userModule;
    @JsonProperty("dependency")
    private Object dependency;
    @JsonProperty("basicAuthentications")
    private List<Object> basicAuthentications = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("ownerId")
    public int getOwnerId() {
        return ownerId;
    }

    @JsonProperty("ownerId")
    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("uid")
    public Object getUid() {
        return uid;
    }

    @JsonProperty("uid")
    public void setUid(Object uid) {
        this.uid = uid;
    }

    @JsonProperty("image")
    public Object getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(Object image) {
        this.image = image;
    }

    @JsonProperty("instances")
    public Object getInstances() {
        return instances;
    }

    @JsonProperty("instances")
    public void setInstances(Object instances) {
        this.instances = instances;
    }

    @JsonProperty("desc")
    public Object getDesc() {
        return desc;
    }

    @JsonProperty("desc")
    public void setDesc(Object desc) {
        this.desc = desc;
    }

    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
    }

    @JsonProperty("access")
    public Object getAccess() {
        return access;
    }

    @JsonProperty("access")
    public void setAccess(Object access) {
        this.access = access;
    }

    @JsonProperty("configuration")
    public ConfigurationSrv getConfiguration() {
        return configuration;
    }

    @JsonProperty("configuration")
    public void setConfiguration(ConfigurationSrv configuration) {
        this.configuration = configuration;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("deployType")
    public String getDeployType() {
        return deployType;
    }

    @JsonProperty("deployType")
    public void setDeployType(String deployType) {
        this.deployType = deployType;
    }

    @JsonProperty("ports")
    public List<PortSrv> getPorts() {
        return ports;
    }

    @JsonProperty("ports")
    public void setPorts(List<PortSrv> ports) {
        this.ports = ports;
    }

    @JsonProperty("collaborative")
    public boolean isCollaborative() {
        return collaborative;
    }

    @JsonProperty("collaborative")
    public void setCollaborative(boolean collaborative) {
        this.collaborative = collaborative;
    }

    @JsonProperty("environments")
    public Environments getEnvironments() {
        return environments;
    }

    @JsonProperty("environments")
    public void setEnvironments(Environments environments) {
        this.environments = environments;
    }

    @JsonProperty("userModule")
    public Object getUserModule() {
        return userModule;
    }

    @JsonProperty("userModule")
    public void setUserModule(Object userModule) {
        this.userModule = userModule;
    }

    @JsonProperty("dependency")
    public Object getDependency() {
        return dependency;
    }

    @JsonProperty("dependency")
    public void setDependency(Object dependency) {
        this.dependency = dependency;
    }

    @JsonProperty("basicAuthentications")
    public List<Object> getBasicAuthentications() {
        return basicAuthentications;
    }

    @JsonProperty("basicAuthentications")
    public void setBasicAuthentications(List<Object> basicAuthentications) {
        this.basicAuthentications = basicAuthentications;
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
