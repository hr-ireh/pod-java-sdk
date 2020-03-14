
package com.fanap.podSakku.data.modelVo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cpu",
    "disk",
    "git",
    "image",
    "instances",
    "mem",
    "portVos",
    "rebuild",
    "scalingMode"
})
public class UpdateConfigVo {

    @JsonProperty("cpu")
    private int cpu;
    @JsonProperty("disk")
    private int disk;
    @JsonProperty("git")
    private ApplicationGitVo git;
    @JsonProperty("image")
    private ApplicationImageVo image;
    @JsonProperty("instances")
    private int instances;
    @JsonProperty("mem")
    private int mem;
    @JsonProperty("portVos")
    private List<PortVo> portVos = null;
    @JsonProperty("rebuild")
    private boolean rebuild;
    @JsonProperty("scalingMode")
    private String scalingMode;

    @JsonProperty("cpu")
    public int getCpu() {
        return cpu;
    }

    @JsonProperty("cpu")
    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    @JsonProperty("disk")
    public int getDisk() {
        return disk;
    }

    @JsonProperty("disk")
    public void setDisk(int disk) {
        this.disk = disk;
    }

    @JsonProperty("git")
    public ApplicationGitVo getGit() {
        return git;
    }

    @JsonProperty("git")
    public void setGit(ApplicationGitVo git) {
        this.git = git;
    }

    @JsonProperty("image")
    public ApplicationImageVo getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(ApplicationImageVo image) {
        this.image = image;
    }

    @JsonProperty("instances")
    public int getInstances() {
        return instances;
    }

    @JsonProperty("instances")
    public void setInstances(int instances) {
        this.instances = instances;
    }

    @JsonProperty("mem")
    public int getMem() {
        return mem;
    }

    @JsonProperty("mem")
    public void setMem(int mem) {
        this.mem = mem;
    }

    @JsonProperty("portVos")
    public List<PortVo> getPortVos() {
        return portVos;
    }

    @JsonProperty("portVos")
    public void setPortVos(List<PortVo> portVos) {
        this.portVos = portVos;
    }

    @JsonProperty("rebuild")
    public boolean isRebuild() {
        return rebuild;
    }

    @JsonProperty("rebuild")
    public void setRebuild(boolean rebuild) {
        this.rebuild = rebuild;
    }

    @JsonProperty("scalingMode")
    public String getScalingMode() {
        return scalingMode;
    }

    @JsonProperty("scalingMode")
    public void setScalingMode(String scalingMode) {
        this.scalingMode = scalingMode;
    }





}
