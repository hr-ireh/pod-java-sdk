package com.fanap.podSakku.data.modelSrv;

import java.util.List;

/**
 * @author N.Zamiri
 */

public class CatalogUpdate {
    private String name;
    private String description;
    private String avatar;
    private int price = 0;
    private int deployLimitCount;
    private double minCpu;
    private double minMem;
    private double minDisk;
    private List<CatalogAppMetadata> metadata;

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

    public List<CatalogAppMetadata> getMetadata() {
        return metadata;
    }

    public void setMetadata(List<CatalogAppMetadata> metadata) {
        this.metadata = metadata;
    }
}
