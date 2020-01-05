package com.fanap.userOperation.data.modelSrv;

import java.io.Serializable;

public class CustomerLegalInfoSrv implements Serializable {
    private String fatherName;          // from inquiryNationalCode
    private String identificationNumber; //shomare shenasname
    private String birthState;
    private String deathStatus;     // from inquiryNationalCode
    private String birthDate;     // from inquiryNationalCode
    private String deathDate;     // from inquiryNationalCode
    private String gender;     // from inquiryNationalCode
    private String identifierSerial;     // from inquiryNationalCode
    private String identifierSeri;     // from inquiryNationalCode
    private Long postalCode;     // from inquiryNationalCode
    private String postalCodeDescription;     // from inquiryNationalCode
    private Long bookNo;     // from inquiryNationalCode
    private Long bookRow;     // from inquiryNationalCode
    private Long officeCode;     // from inquiryNationalCode
    private String officeName;     // from inquiryNationalCode

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String shNumber) {
        this.identificationNumber = shNumber;
    }

    public String getBirthState() {
        return birthState;
    }

    public void setBirthState(String stateBirth) {
        this.birthState = stateBirth;
    }

    public String getDeathStatus() {
        return deathStatus;
    }

    public void setDeathStatus(String deathStatus) {
        this.deathStatus = deathStatus;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(String deathDate) {
        this.deathDate = deathDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdentifierSerial() {
        return identifierSerial;
    }

    public void setIdentifierSerial(String identifierSerial) {
        this.identifierSerial = identifierSerial;
    }

    public String getIdentifierSeri() {
        return identifierSeri;
    }

    public void setIdentifierSeri(String identifierSeri) {
        this.identifierSeri = identifierSeri;
    }

    public Long getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Long postalCode) {
        this.postalCode = postalCode;
    }

    public String getPostalCodeDescription() {
        return postalCodeDescription;
    }

    public void setPostalCodeDescription(String postalCodeDescription) {
        this.postalCodeDescription = postalCodeDescription;
    }

    public Long getBookNo() {
        return bookNo;
    }

    public void setBookNo(Long bookNo) {
        this.bookNo = bookNo;
    }

    public Long getBookRow() {
        return bookRow;
    }

    public void setBookRow(Long bookRow) {
        this.bookRow = bookRow;
    }

    public Long getOfficeCode() {
        return officeCode;
    }

    public void setOfficeCode(Long officeCode) {
        this.officeCode = officeCode;
    }

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }
}
