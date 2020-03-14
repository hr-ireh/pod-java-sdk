package com.fanap.podSakku.data.modelSrv;

import com.fanap.podSakku.enums.EnumApplicationStatus;
import com.fanap.podSakku.enums.EnumDeployType;

import java.util.List;
import java.util.Map;
import java.util.Set;


public class ApplicationSrv {

    private String id;
    private Long ownerId;
    private String name;
    private String uid;
    private String image;
    private List<ApplicationInstanceSrv> instances;
    private String desc;
    private String created;
    private List<ApplicationAccessSrv> access;
    private ConfigurationSrv configuration;
    private EnumApplicationStatus status;
    private EnumDeployType enumDeployType;
    private List<PortSrv> ports;
    private boolean collaborative;
    private Map<String, String> environments;
    private Set<ModuleRequestSrv> userModule;
    private Set<DependencySrv> dependency;
    private Set<BasicAuthenticationSrv> basicAuthentications;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<ApplicationInstanceSrv> getInstances() {
        return instances;
    }

    public void setInstances(List<ApplicationInstanceSrv> instances) {
        this.instances = instances;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public List<ApplicationAccessSrv> getAccess() {
        return access;
    }

    public void setAccess(List<ApplicationAccessSrv> access) {
        this.access = access;
    }

    public ConfigurationSrv getConfiguration() {
        return configuration;
    }

    public void setConfiguration(ConfigurationSrv configuration) {
        this.configuration = configuration;
    }

    public EnumApplicationStatus getStatus() {
        return status;
    }

    public void setStatus(EnumApplicationStatus status) {
        this.status = status;
    }

    public EnumDeployType getEnumDeployType() {
        return enumDeployType;
    }

    public void setEnumDeployType(EnumDeployType enumDeployType) {
        this.enumDeployType = enumDeployType;
    }

    public List<PortSrv> getPorts() {
        return ports;
    }

    public void setPorts(List<PortSrv> ports) {
        this.ports = ports;
    }

    public boolean isCollaborative() {
        return collaborative;
    }

    public void setCollaborative(boolean collaborative) {
        this.collaborative = collaborative;
    }

    public Map<String, String> getEnvironments() {
        return environments;
    }

    public void setEnvironments(Map<String, String> environments) {
        this.environments = environments;
    }

    public Set<ModuleRequestSrv> getUserModule() {
        return userModule;
    }

    public void setUserModule(Set<ModuleRequestSrv> userModule) {
        this.userModule = userModule;
    }

    public Set<DependencySrv> getDependency() {
        return dependency;
    }

    public void setDependency(Set<DependencySrv> dependency) {
        this.dependency = dependency;
    }

    public Set<BasicAuthenticationSrv> getBasicAuthentications() {
        return basicAuthentications;
    }

    public void setBasicAuthentications(Set<BasicAuthenticationSrv> basicAuthentications) {
        this.basicAuthentications = basicAuthentications;
    }
}
