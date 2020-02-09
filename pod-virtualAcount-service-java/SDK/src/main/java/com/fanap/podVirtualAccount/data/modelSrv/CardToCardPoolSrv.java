package com.fanap.podVirtualAccount.data.modelSrv;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by Zahra Golinia on 2/4/2020.
 */

public class CardToCardPoolSrv implements Serializable {
    private long id;
    private String statusCode;
    private Date creationDate;
    private Date doneDate;
    private Boolean canEdit;
    private String causeId;
    private String causeCode;
    private String referenceNumber;
    private String uniqueId;
    private List<CardToCardPoolItemSrv> items;

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

    public Date getDoneDate() {
        return doneDate;
    }

    public void setDoneDate(Date doneDate) {
        this.doneDate = doneDate;
    }

    public Boolean getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(Boolean canEdit) {
        this.canEdit = canEdit;
    }

    public String getCauseId() {
        return causeId;
    }

    public void setCauseId(String causeId) {
        this.causeId = causeId;
    }

    public String getCauseCode() {
        return causeCode;
    }

    public void setCauseCode(String causeCode) {
        this.causeCode = causeCode;
    }

    public List<CardToCardPoolItemSrv> getItems() {
        return items;
    }

    public void setItems(List<CardToCardPoolItemSrv> items) {
        this.items = items;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }
}
