package com.fanap.podVirtualAccount.data.modelSrv;

import java.io.Serializable;

/**
 * Created by Zahra Golinia on 2/4/2020.
 */

public class BusinessAgentSrv implements Serializable {
    private long id;
    private String firstName;
    private String lastName;
    private String cellphoneNumber;
    private String nationalCode;

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

    public String getCellphoneNumber() {
        return cellphoneNumber;
    }

    public void setCellphoneNumber(String cellphoneNumber) {
        this.cellphoneNumber = cellphoneNumber;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }
}
