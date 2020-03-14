package com.fanap.podSakku.data.modelSrv;

import java.util.List;


public class ConfigurationSrv {

    private String cmd;
    private List<String> args;
    private Integer minInstances;
    private Integer maxInstances;
    private Double cpu;
    private Double mem;
    private Double disk;
    private Double gpus;
    private String scalingMode;
    private String netAlias;

    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
    }

    public List<String> getArgs() {
        return args;
    }

    public void setArgs(List<String> args) {
        this.args = args;
    }

    public Integer getMinInstances() {
        return minInstances;
    }

    public void setMinInstances(Integer minInstances) {
        this.minInstances = minInstances;
    }

    public Integer getMaxInstances() {
        return maxInstances;
    }

    public void setMaxInstances(Integer maxInstances) {
        this.maxInstances = maxInstances;
    }

    public Double getCpu() {
        return cpu;
    }

    public void setCpu(Double cpu) {
        this.cpu = cpu;
    }

    public Double getMem() {
        return mem;
    }

    public void setMem(Double mem) {
        this.mem = mem;
    }

    public Double getDisk() {
        return disk;
    }

    public void setDisk(Double disk) {
        this.disk = disk;
    }

    public Double getGpus() {
        return gpus;
    }

    public void setGpus(Double gpus) {
        this.gpus = gpus;
    }

    public String getScalingMode() {
        return scalingMode;
    }

    public void setScalingMode(String scalingMode) {
        this.scalingMode = scalingMode;
    }

    public String getNetAlias() {
        return netAlias;
    }

    public void setNetAlias(String netAlias) {
        this.netAlias = netAlias;
    }
}
