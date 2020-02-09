package com.fanap.podVirtualAccount.data.modelSrv;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Zahra Golinia on 2/4/2020.
 */

public class ExportServiceSrv implements Serializable {
    private long id;
    private String statusCode;
    private Date creationDate;
    private FileInfoSrv resultFile;
    private String service;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public FileInfoSrv getResultFile() {
        return resultFile;
    }

    public void setResultFile(FileInfoSrv resultFile) {
        this.resultFile = resultFile;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }
}
