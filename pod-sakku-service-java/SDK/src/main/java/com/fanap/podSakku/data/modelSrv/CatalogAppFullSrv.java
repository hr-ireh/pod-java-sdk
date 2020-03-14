package com.fanap.podSakku.data.modelSrv;

import java.util.List;

/**
 * Mehdi Akbarian-Rastaghi 4/28/19
 */


public class CatalogAppFullSrv {

    private Long id;
    private String name;
    private String description;
    private String avatar;
    private int price = 0;
    private int deployCount = 0;
    private int deployLimitCount;
    private String created;
    private String updated;
    private double minCpu;
    private double minMem;
    private double minDisk;
    private String jsonConfiguration;
    private List<CatalogAppMetadata> metadata;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDeployCount() {
        return deployCount;
    }

    public void setDeployCount(int deployCount) {
        this.deployCount = deployCount;
    }

    public int getDeployLimitCount() {
        return deployLimitCount;
    }

    public void setDeployLimitCount(int deployLimitCount) {
        this.deployLimitCount = deployLimitCount;
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

    public double getMinCpu() {
        return minCpu;
    }

    public void setMinCpu(double minCpu) {
        this.minCpu = minCpu;
    }

    public double getMinMem() {
        return minMem;
    }

    public void setMinMem(double minMem) {
        this.minMem = minMem;
    }

    public double getMinDisk() {
        return minDisk;
    }

    public void setMinDisk(double minDisk) {
        this.minDisk = minDisk;
    }

    public String getJsonConfiguration() {
        return jsonConfiguration;
    }

    public void setJsonConfiguration(String jsonConfiguration) {
        this.jsonConfiguration = jsonConfiguration;
    }

    public List<CatalogAppMetadata> getMetadata() {
        return metadata;
    }

    public void setMetadata(List<CatalogAppMetadata> metadata) {
        this.metadata = metadata;
    }
}
