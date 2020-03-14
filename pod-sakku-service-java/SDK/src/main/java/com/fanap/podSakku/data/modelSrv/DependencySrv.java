package com.fanap.podSakku.data.modelSrv;


import com.fanap.podSakku.enums.EnumDependencyType;

public class DependencySrv {

    private Long id;
    private ApplicationSrv application;
    private EnumDependencyType type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ApplicationSrv getApplication() {
        return application;
    }

    public void setApplication(ApplicationSrv application) {
        this.application = application;
    }

    public EnumDependencyType getType() {
        return type;
    }

    public void setType(EnumDependencyType type) {
        this.type = type;
    }
}
