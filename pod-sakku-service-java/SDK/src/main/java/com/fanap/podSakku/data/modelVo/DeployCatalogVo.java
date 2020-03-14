package com.fanap.podSakku.data.modelVo;

import java.util.List;

/**
 * @author N.Zamiri
 */

public class DeployCatalogVo {

    private String name;
    private double cpu;
    private double mem;
    private double disk;
    private List<CatalogMetadataRequestVo> metadata;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public double getMem() {
        return mem;
    }

    public void setMem(double mem) {
        this.mem = mem;
    }

    public double getDisk() {
        return disk;
    }

    public void setDisk(double disk) {
        this.disk = disk;
    }

    public List<CatalogMetadataRequestVo> getMetadata() {
        return metadata;
    }

    public void setMetadata(List<CatalogMetadataRequestVo> metadata) {
        this.metadata = metadata;
    }
}
