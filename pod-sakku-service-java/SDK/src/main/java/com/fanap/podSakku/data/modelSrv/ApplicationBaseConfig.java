package com.fanap.podSakku.data.modelSrv;

import com.fanap.podSakku.data.modelVo.ApplicationGitVo;
import com.fanap.podSakku.data.modelVo.ApplicationImageVo;
import com.fanap.podSakku.enums.EnumDeployType;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.*;

public class ApplicationBaseConfig {

    private String name;
    private double cpu;
    private double mem;
    private double disk;
    private List<PortMapping> ports;
    private int minInstance = 1;
    private int maxInstance = 1;
    private String cmd;
    private String entrypoint;
    private String scalingMode;
    private List<String> args;
    private Set<ModuleRequestSrv> modules;
    private Map<String, String> environments = new HashMap<>();
    private Map<String, String> labels = new HashMap<>();
    private List<Link> links;
    private String netAlias;
    private Set<AddHealthCheckSrv> healthChecks = new HashSet<>();
    private Set<BasicAuthentication> basicAuthentications = new HashSet<>();
    private ApplicationImageVo image;
    private ApplicationGitVo git;
    private EnumDeployType deployType;
    private String worker;
    private String network;
    private List<String> dependsOn;
    private String pipeLineStatus;


    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PortMapping> getPorts() {
        return ports;
    }

    public void setPorts(List<PortMapping> ports) {
        this.ports = ports;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public ApplicationImageVo getImage() {
        return image;
    }

    public void setImage(ApplicationImageVo image) {
        this.image = image;
    }

    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
    }

    public String getNetAlias() {
        return netAlias;
    }

    public void setNetAlias(String netAlias) {
        this.netAlias = netAlias;
    }

    public List<String> getArgs() {
        return args;
    }

    public void setArgs(List<String> args) {
        this.args = args;
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

    public Map<String, String> getEnvironments() {
        return environments;
    }

    public void setEnvironments(Map<String, String> environments) {
        this.environments = environments;
    }

    public Map<String, String> getLabels() {
        return labels;
    }

    public void setLabels(Map<String, String> labels) {
        this.labels = labels;
    }

    public double getDisk() {
        return disk;
    }

    public void setDisk(double disk) {
        this.disk = disk;
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

    public String getScalingMode() {
        return scalingMode;
    }

    public void setScalingMode(String scalingMode) {
        this.scalingMode = scalingMode;
    }

    public EnumDeployType getDeployType() {
        return deployType;
    }

    public void setDeployType(EnumDeployType deployType) {
        this.deployType = deployType;
    }

    public void setPipeLineStatus(String pipeLineStatus) {
        this.pipeLineStatus = pipeLineStatus;
    }

    public ApplicationGitVo getGit() {
        return git;
    }

    public void setGit(ApplicationGitVo git) {
        this.git = git;
    }

    public Set<AddHealthCheckSrv> getHealthChecks() {
        return healthChecks;
    }

    public void setHealthChecks(Set<AddHealthCheckSrv> healthChecks) {
        this.healthChecks = healthChecks;
    }

    public String getEntrypoint() {
        return entrypoint;
    }

    public void setEntrypoint(String entrypoint) {
        this.entrypoint = entrypoint;
    }

    public Set<ModuleRequestSrv> getModules() {
        return modules;
    }

    public void setModules(Set<ModuleRequestSrv> modules) {
        this.modules = modules;
    }

    public String getWorker() {
        return worker;
    }

    public void setWorker(String worker) {
        this.worker = worker;
    }

    public String getPipeLineStatus() {
        return pipeLineStatus;
    }

    public Set<BasicAuthentication> getBasicAuthentications() {
        return basicAuthentications;
    }

    public void setBasicAuthentications(Set<BasicAuthentication> basicAuthentications) {
        this.basicAuthentications = basicAuthentications;
    }

    public List<String> getDependsOn() {
        return dependsOn;
    }

    public void setDependsOn(List<String> dependsOn) {
        this.dependsOn = dependsOn;
    }

}