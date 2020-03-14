package com.fanap.podSakku.data.modelVo;

import com.fanap.podSakku.enums.EnumCatalogFeedbackType;

import java.util.Date;


public class CatalogFeedbackVo {

    private Long id;
    private Date created;
    private Long catalogApp;
    private String subject;
    private String description;
    private String dockerName;
    private Integer price;
    private EnumCatalogFeedbackType type;
    private Double minCpu;
    private Double minMem;
    private Double minDisk;
    private Boolean checked;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Long getCatalogApp() {
        return catalogApp;
    }

    public void setCatalogApp(Long catalogApp) {
        this.catalogApp = catalogApp;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDockerName() {
        return dockerName;
    }

    public void setDockerName(String dockerName) {
        this.dockerName = dockerName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public EnumCatalogFeedbackType getType() {
        return type;
    }

    public void setType(EnumCatalogFeedbackType type) {
        this.type = type;
    }

    public Double getMinCpu() {
        return minCpu;
    }

    public void setMinCpu(Double minCpu) {
        this.minCpu = minCpu;
    }

    public Double getMinMem() {
        return minMem;
    }

    public void setMinMem(Double minMem) {
        this.minMem = minMem;
    }

    public Double getMinDisk() {
        return minDisk;
    }

    public void setMinDisk(Double minDisk) {
        this.minDisk = minDisk;
    }

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }
}
