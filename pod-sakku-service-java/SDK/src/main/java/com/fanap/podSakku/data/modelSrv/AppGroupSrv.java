package com.fanap.podSakku.data.modelSrv;

import java.util.List;

/**
 * @author N.Zamiri
 */

public class AppGroupSrv {
    private Long id;
    private String name;
    private List<ApplicationSrv> applications;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ApplicationSrv> getApplications() {
        return applications;
    }

    public void setApplications(List<ApplicationSrv> applications) {
        this.applications = applications;
    }
}
