package com.fanap.podSakku.data.modelSrv;

import com.fanap.podSakku.data.modelVo.ApplicationGitVo;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author N.Zamiri
 */

public class AppInfoSrv {

    private long id;
    private String name;
    private double cpu;
    private double mem;
    private double disk;
    private AppImageSrv image;
    private ApplicationGitVo git;
    private int minInstance;
    private int maxInstance;
    private String cmd;
    private String entrypoint;
    private String scalingMode;
    private List<String> args;
    private Set<ModuleRequestSrv> modules;
    private Map<String, String> environments;
    private String deployType;
    private String lastRestartReason;
    private TaskFailureSrv lastTaskFailure;
    private int currentInstances;
    private long lastScalingAt;
    private List<TaskSrv> instances;
    private List<String> deploymentIds;
    private String network;
    private ApplicationBaseConfig jsonConfig;

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

    public AppImageSrv getImage() {
        return image;
    }

    public void setImage(AppImageSrv image) {
        this.image = image;
    }

    public ApplicationGitVo getGit() {
        return git;
    }

    public void setGit(ApplicationGitVo git) {
        this.git = git;
    }

    public int getMinInstance() {
        return minInstance;
    }

    public void setMinInstance(int minInstance) {
        this.minInstance = minInstance;
    }

    public int getMaxInstance() {
        return maxInstance;
    }

    public void setMaxInstance(int maxInstance) {
        this.maxInstance = maxInstance;
    }

    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
    }

    public String getEntrypoint() {
        return entrypoint;
    }

    public void setEntrypoint(String entrypoint) {
        this.entrypoint = entrypoint;
    }

    public String getScalingMode() {
        return scalingMode;
    }

    public void setScalingMode(String scalingMode) {
        this.scalingMode = scalingMode;
    }

    public List<String> getArgs() {
        return args;
    }

    public void setArgs(List<String> args) {
        this.args = args;
    }

    public Set<ModuleRequestSrv> getModules() {
        return modules;
    }

    public void setModules(Set<ModuleRequestSrv> modules) {
        this.modules = modules;
    }

    public Map<String, String> getEnvironments() {
        return environments;
    }

    public void setEnvironments(Map<String, String> environments) {
        this.environments = environments;
    }

    public String getDeployType() {
        return deployType;
    }

    public void setDeployType(String deployType) {
        this.deployType = deployType;
    }

    public String getLastRestartReason() {
        return lastRestartReason;
    }

    public void setLastRestartReason(String lastRestartReason) {
        this.lastRestartReason = lastRestartReason;
    }

    public TaskFailureSrv getLastTaskFailure() {
        return lastTaskFailure;
    }

    public void setLastTaskFailure(TaskFailureSrv lastTaskFailure) {
        this.lastTaskFailure = lastTaskFailure;
    }

    public int getCurrentInstances() {
        return currentInstances;
    }

    public void setCurrentInstances(int currentInstances) {
        this.currentInstances = currentInstances;
    }

    public long getLastScalingAt() {
        return lastScalingAt;
    }

    public void setLastScalingAt(long lastScalingAt) {
        this.lastScalingAt = lastScalingAt;
    }

    public List<TaskSrv> getInstances() {
        return instances;
    }

    public void setInstances(List<TaskSrv> instances) {
        this.instances = instances;
    }

    public List<String> getDeploymentIds() {
        return deploymentIds;
    }

    public void setDeploymentIds(List<String> deploymentIds) {
        this.deploymentIds = deploymentIds;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public ApplicationBaseConfig getJsonConfig() {
        return jsonConfig;
    }

    public void setJsonConfig(ApplicationBaseConfig jsonConfig) {
        this.jsonConfig = jsonConfig;
    }
}
