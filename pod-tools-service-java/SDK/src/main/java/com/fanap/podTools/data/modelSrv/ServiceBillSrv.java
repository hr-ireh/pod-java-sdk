package com.fanap.podTools.data.modelSrv;



import java.io.Serializable;
import java.util.Date;

public class ServiceBillSrv implements Serializable {

    private long id;
    private String billId;
    private String paymentId;
    private Double price;
    private String utilityCompanyName;
    private String subUtilityCompanyName;
    private Date requestDate;
    private Date failedDate;
    private int referenceNumber;
    private String status;
    private long invoiceId;
    private long settlementRequestId;
    private UserSrv userSrv;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getUtilityCompanyName() {
        return utilityCompanyName;
    }

    public void setUtilityCompanyName(String utilityCompanyName) {
        this.utilityCompanyName = utilityCompanyName;
    }

    public String getSubUtilityCompanyName() {
        return subUtilityCompanyName;
    }

    public void setSubUtilityCompanyName(String subUtilityCompanyName) {
        this.subUtilityCompanyName = subUtilityCompanyName;
    }


    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }


    public int getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(int referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getFailedDate() {
        return failedDate;
    }

    public void setFailedDate(Date failedDate) {
        this.failedDate = failedDate;
    }

    public long getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(long invoiceId) {
        this.invoiceId = invoiceId;
    }

    public UserSrv getUserSrv() {
        return userSrv;
    }

    public void setUserSrv(UserSrv userSrv) {
        this.userSrv = userSrv;
    }

    public long getSettlementRequestId() {
        return settlementRequestId;
    }

    public void setSettlementRequestId(long settlementRequestId) {
        this.settlementRequestId = settlementRequestId;
    }
}
