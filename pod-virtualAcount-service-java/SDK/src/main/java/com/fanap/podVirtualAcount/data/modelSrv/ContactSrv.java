package com.fanap.podVirtualAcount.data.modelSrv;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by M.Vahedi on 2/27/2018.
 */
public class ContactSrv implements Serializable {
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String cellphoneNumber;
    private String uniqueId;
    private RelatedUserSrv linkedUser;
    private Date creationDate;
    private Date lastModifyDate ;
    private String contactType;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCellphoneNumber() {
        return cellphoneNumber;
    }

    public void setCellphoneNumber(String cellphoneNumber) {
        this.cellphoneNumber = cellphoneNumber;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public RelatedUserSrv getLinkedUser() {
        return linkedUser;
    }

    public void setLinkedUser(RelatedUserSrv linkedUser) {
        this.linkedUser = linkedUser;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }

    public String getContactType() {
        return contactType;
    }

    public void setContactType(String contactType) {
        this.contactType = contactType;
    }
}
