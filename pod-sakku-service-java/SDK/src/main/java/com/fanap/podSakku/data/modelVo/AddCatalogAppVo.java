package com.fanap.podSakku.data.modelVo;

import com.fanap.podSakku.data.modelSrv.ApplicationBaseConfig;
import com.fanap.podSakku.data.modelSrv.CatalogAppMetadata;

import java.util.List;

/**
 * Mehdi AKbarian-Rastaghi 4/28/19
 */

public class AddCatalogAppVo {

    private long id;
    private String name;
    private String description;
    private String avatar;
    private int price = 0;
    private int deployLimitCount;
    private double minCpu;
    private double minMem;
    private double minDisk;
    private ApplicationBaseConfig config;
    private String dockerFileText;
    private List<CatalogAppMetadata> metadata;

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public int getDeployLimitCount() {
        return deployLimitCount;
    }

    public void setDeployLimitCount(int deployLimitCount) {
        this.deployLimitCount = deployLimitCount;
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

    public ApplicationBaseConfig getConfig() {
        return config;
    }

    public void setConfig(ApplicationBaseConfig config) {
        this.config = config;
    }

    public String getDockerFileText() {
        return dockerFileText;
    }

    public void setDockerFileText(String dockerFileText) {
        this.dockerFileText = dockerFileText;
    }

    public List<CatalogAppMetadata> getMetadata() {
        return metadata;
    }

    public void setMetadata(List<CatalogAppMetadata> metadata) {
        this.metadata = metadata;
    }
}
