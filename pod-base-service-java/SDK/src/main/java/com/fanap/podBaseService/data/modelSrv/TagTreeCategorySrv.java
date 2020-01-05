package com.fanap.podBaseService.data.modelSrv;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by M.Vahedi on 9/17/2017.
 */
public class TagTreeCategorySrv implements Serializable {
    private long id;
    private String name;
    private String description;
    private BusinessSoftSrv businessSoftSrv;
    private Date creationDate;
    private boolean enable;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BusinessSoftSrv getBusinessSoftSrv() {
        return businessSoftSrv;
    }

    public void setBusinessSoftSrv(BusinessSoftSrv businessSoftSrv) {
        this.businessSoftSrv = businessSoftSrv;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }
}
