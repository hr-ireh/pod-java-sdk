
package com.fanap.podSakku.data.modelVo;

import com.fanap.podSakku.data.modelSrv.Link;
import com.fanap.podSakku.enums.EnumDeployType;
import com.fanap.podSakku.exception.PodException;

import java.util.List;

public class ConfigContentVo {
    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "git , deployTpe  are required parameters!";
    private List<String> args;
    private List<BasicAuthenticationVo> basicAuthenticationVos;
    private String cmd;
    private double cpu;
    private List<String> dependsOn;
    private String deployType;
    private double disk;
    private String entrypoint;
    private Environments environments;
    private ApplicationGitVo git;
    private List<HealthCheckVo> healthCheckVos;
    private ApplicationImageVo image;
    private LabelsVo labelsVo;
    private List<Link> links;
    private int maxInstance;
    private double mem;
    private int minInstance;
    private List<ModuleVo> moduleVos;
    private String name;
    private String netAlias;
    private String network;
    private String pipeLineStatus;
    private List<PortVo> portVos;
    private String scalingMode;
    private String worker;

    public ConfigContentVo(Builder builder) {
        this.args = builder.getArgs();
        this.basicAuthenticationVos = builder.getBasicAuthenticationVos();
        this.cmd = builder.getCmd();
        this.cpu = builder.getCpu();
        this.dependsOn = builder.getDependsOn();
        this.deployType = builder.getDeployType();
        this.disk = builder.getDisk();
        this.entrypoint = builder.getEntrypoint();
        this.environments = builder.getEnvironments();
        this.git = builder.getGit();
        this.healthCheckVos = builder.getHealthCheckVos();
        this.image = builder.getImage();
        this.labelsVo = builder.getLabelsVo();
        this.links = builder.getLinks();
        this.maxInstance = builder.getMaxInstance();
        this.mem = builder.getMem();
        this.minInstance = builder.getMinInstance();
        this.moduleVos = builder.getModuleVos();
        this.name = builder.getName();
        this.netAlias = builder.getNetAlias();
        this.network = builder.getNetwork();
        this.pipeLineStatus = builder.getPipeLineStatus();
        this.portVos = builder.getPortVos();
        this.scalingMode = builder.getScalingMode();
        this.worker = builder.getWorker();
    }

    public List<String> getArgs() {
        return args;
    }

    public List<BasicAuthenticationVo> getBasicAuthenticationVos() {
        return basicAuthenticationVos;
    }

    public String getCmd() {
        return cmd;
    }


    public double getCpu() {
        return cpu;
    }

    public List<String> getDependsOn() {
        return dependsOn;
    }

    public String getDeployType() {
        return deployType;
    }

    public double getDisk() {
        return disk;
    }

    public String getEntrypoint() {
        return entrypoint;
    }

    public Environments getEnvironments() {
        return environments;
    }

    public ApplicationGitVo getGit() {
        return git;
    }

    public List<HealthCheckVo> getHealthCheckVos() {
        return healthCheckVos;
    }

    public ApplicationImageVo getImage() {
        return image;
    }

    public LabelsVo getLabelsVo() {
        return labelsVo;
    }

    public List<Link> getLinks() {
        return links;
    }

    public int getMaxInstance() {
        return maxInstance;
    }

    public double getMem() {
        return mem;
    }

    public int getMinInstance() {
        return minInstance;
    }

    public List<ModuleVo> getModuleVos() {
        return moduleVos;
    }

    public String getName() {
        return name;
    }

    public String getNetAlias() {
        return netAlias;
    }

    public String getNetwork() {
        return network;
    }

    public String getPipeLineStatus() {
        return pipeLineStatus;
    }

    public List<PortVo> getPortVos() {
        return portVos;
    }

    public String getScalingMode() {
        return scalingMode;
    }

    public String getWorker() {
        return worker;
    }

    public static class Builder {

        private List<String> args = null;
        private List<BasicAuthenticationVo> basicAuthenticationVos = null;
        private String cmd;
        private int cpu;
        private List<String> dependsOn = null;
        private String deployType;
        private int disk;
        private String entrypoint;
        private Environments environments;
        private ApplicationGitVo git;
        private List<HealthCheckVo> healthCheckVos = null;
        private ApplicationImageVo image;
        private LabelsVo labelsVo;
        private List<Link> links = null;
        private int maxInstance;
        private int mem;
        private int minInstance;
        private List<ModuleVo> moduleVos = null;
        private String name;
        private String netAlias;
        private String network;
        private String pipeLineStatus;
        private List<PortVo> portVos = null;
        private String scalingMode;
        private String worker;

        public List<String> getArgs() {
            return args;
        }

        public Builder setArgs(List<String> args) {
            this.args = args;
            return this;
        }

        public List<BasicAuthenticationVo> getBasicAuthenticationVos() {
            return basicAuthenticationVos;
        }

        public Builder setBasicAuthenticationVos(List<BasicAuthenticationVo> basicAuthenticationVos) {
            this.basicAuthenticationVos = basicAuthenticationVos;
            return this;
        }

        public String getCmd() {
            return cmd;
        }

        public Builder setCmd(String cmd) {
            this.cmd = cmd;
            return this;
        }

        public int getCpu() {
            return cpu;
        }

        public Builder setCpu(int cpu) {
            this.cpu = cpu;
            return this;
        }

        public List<String> getDependsOn() {
            return dependsOn;
        }

        public Builder setDependsOn(List<String> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }

        public String getDeployType() {
            return deployType;
        }

        public Builder setDeployType(EnumDeployType enumDeployType) {
            this.deployType = enumDeployType.getValue();
            return this;
        }

        public int getDisk() {
            return disk;
        }

        public Builder setDisk(int disk) {
            this.disk = disk;
            return this;
        }

        public String getEntrypoint() {
            return entrypoint;
        }

        public Builder setEntrypoint(String entrypoint) {
            this.entrypoint = entrypoint;
            return this;
        }

        public Environments getEnvironments() {
            return environments;
        }

        public Builder setEnvironments(Environments environments) {
            this.environments = environments;
            return this;
        }

        public ApplicationGitVo getGit() {
            return git;
        }

        public Builder setGit(ApplicationGitVo git) {
            this.git = git;
            return this;
        }

        public List<HealthCheckVo> getHealthCheckVos() {
            return healthCheckVos;
        }

        public Builder setHealthCheckVos(List<HealthCheckVo> healthCheckVos) {
            this.healthCheckVos = healthCheckVos;
            return this;
        }

        public ApplicationImageVo getImage() {
            return image;
        }

        public Builder setImage(ApplicationImageVo image) {
            this.image = image;
            return this;
        }

        public LabelsVo getLabelsVo() {
            return labelsVo;
        }

        public Builder setLabelsVo(LabelsVo labelsVo) {
            this.labelsVo = labelsVo;
            return this;
        }

        public List<Link> getLinks() {
            return links;
        }

        public Builder setLinks(List<Link> links) {
            this.links = links;
            return this;
        }

        public int getMaxInstance() {
            return maxInstance;
        }

        public Builder setMaxInstance(int maxInstance) {
            this.maxInstance = maxInstance;
            return this;
        }

        public int getMem() {
            return mem;
        }

        public Builder setMem(int mem) {
            this.mem = mem;
            return this;
        }

        public int getMinInstance() {
            return minInstance;
        }

        public Builder setMinInstance(int minInstance) {
            this.minInstance = minInstance;
            return this;
        }

        public List<ModuleVo> getModuleVos() {
            return moduleVos;
        }

        public Builder setModuleVos(List<ModuleVo> moduleVos) {
            this.moduleVos = moduleVos;
            return this;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public String getNetAlias() {
            return netAlias;
        }

        public Builder setNetAlias(String netAlias) {
            this.netAlias = netAlias;
            return this;
        }

        public String getNetwork() {
            return network;
        }

        public Builder setNetwork(String network) {
            this.network = network;
            return this;
        }

        public String getPipeLineStatus() {
            return pipeLineStatus;
        }

        public Builder setPipeLineStatus(String pipeLineStatus) {
            this.pipeLineStatus = pipeLineStatus;
            return this;
        }

        public List<PortVo> getPortVos() {
            return portVos;
        }

        public Builder setPortVos(List<PortVo> portVos) {
            this.portVos = portVos;
            return this;
        }

        public String getScalingMode() {
            return scalingMode;
        }

        public Builder setScalingMode(String scalingMode) {
            this.scalingMode = scalingMode;
            return this;
        }

        public String getWorker() {
            return worker;
        }

        public Builder setWorker(String worker) {
            this.worker = worker;
            return this;
        }

        public ConfigContentVo build() throws PodException {
            if (this.git != null && this.deployType!= null )
                return new ConfigContentVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }

    }

}
