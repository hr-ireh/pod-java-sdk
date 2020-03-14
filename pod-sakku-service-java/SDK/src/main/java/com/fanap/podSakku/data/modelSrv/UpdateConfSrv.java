package com.fanap.podSakku.data.modelSrv;

import com.fanap.podSakku.data.modelVo.ApplicationGitVo;
import com.fanap.podSakku.data.modelVo.ApplicationImageVo;
import com.fanap.podSakku.enums.EnumAutoScaleTriggerMode;

import java.util.List;

/**
 * @author N.Zamiri
 */

public class UpdateConfSrv {

    private double cpu;
    private double mem;
    private double disk;
    private int instances;
    private EnumAutoScaleTriggerMode scalingMode;
    private List<UpdatePortSrv> ports;
    private ApplicationImageVo image;
    private ApplicationGitVo git;
    private boolean rebuild;

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

    public int getInstances() {
        return instances;
    }

    public void setInstances(int instances) {
        this.instances = instances;
    }

    public EnumAutoScaleTriggerMode getScalingMode() {
        return scalingMode;
    }

    public void setScalingMode(EnumAutoScaleTriggerMode scalingMode) {
        this.scalingMode = scalingMode;
    }

    public List<UpdatePortSrv> getPorts() {
        return ports;
    }

    public void setPorts(List<UpdatePortSrv> ports) {
        this.ports = ports;
    }

    public ApplicationImageVo getImage() {
        return image;
    }

    public void setImage(ApplicationImageVo image) {
        this.image = image;
    }

    public ApplicationGitVo getGit() {
        return git;
    }

    public void setGit(ApplicationGitVo git) {
        this.git = git;
    }

    public boolean isRebuild() {
        return rebuild;
    }

    public void setRebuild(boolean rebuild) {
        this.rebuild = rebuild;
    }
}
