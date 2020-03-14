package com.fanap.podSakku.data.modelSrv;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author N.Zamiri
 */


public class AppNetworkSrv {

    private Long id;
    private String created;
    private String updated;
    private String name;
    private UserSrv owner;
    private List<Long> apps;
    @JsonProperty("default")
    @SerializedName("default")
    private boolean defaultNetwork;
    private String subnet;
    private String gateway;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserSrv getOwner() {
        return owner;
    }

    public void setOwner(UserSrv owner) {
        this.owner = owner;
    }

    public List<Long> getApps() {
        return apps;
    }

    public void setApps(List<Long> apps) {
        this.apps = apps;
    }

    public boolean isDefaultNetwork() {
        return defaultNetwork;
    }

    public void setDefaultNetwork(boolean defaultNetwork) {
        this.defaultNetwork = defaultNetwork;
    }

    public String getSubnet() {
        return subnet;
    }

    public void setSubnet(String subnet) {
        this.subnet = subnet;
    }

    public String getGateway() {
        return gateway;
    }

    public void setGateway(String gateway) {
        this.gateway = gateway;
    }
}