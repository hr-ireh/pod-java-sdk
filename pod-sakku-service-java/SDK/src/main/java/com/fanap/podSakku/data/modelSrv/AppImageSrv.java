package com.fanap.podSakku.data.modelSrv;

public class AppImageSrv {
    private String name;
    private String registry;
    private String username;
    private String tag;
    private long createDate;
    private boolean buildSuccessfully;
    private String autoBuildUUID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegistry() {
        return registry;
    }

    public void setRegistry(String registry) {
        this.registry = registry;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public long getCreateDate() {
        return createDate;
    }

    public void setCreateDate(long createDate) {
        this.createDate = createDate;
    }

    public boolean isBuildSuccessfully() {
        return buildSuccessfully;
    }

    public void setBuildSuccessfully(boolean buildSuccessfully) {
        this.buildSuccessfully = buildSuccessfully;
    }

    public String getAutoBuildUUID() {
        return autoBuildUUID;
    }

    public void setAutoBuildUUID(String autoBuildUUID) {
        this.autoBuildUUID = autoBuildUUID;
    }
}
