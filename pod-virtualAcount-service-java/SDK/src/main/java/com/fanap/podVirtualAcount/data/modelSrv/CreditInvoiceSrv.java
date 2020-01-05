package com.fanap.podVirtualAcount.data.modelSrv;


import java.util.List;

/**
 * Created by Heidari on 3/7/18.
 */
public class CreditInvoiceSrv {
    private long id;
    private long deliveryDate;
    private List<CreditInvoiceItemSrv> creditInvoiceItems;
    private boolean canceled;
    private CurrencySrv currency;
    private String description;
    private long issuanceDate;
    private String issuancePersianDate;
    private long billNumber;
    private UserSrv user;
    private long serial;
    private boolean payed;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(long deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public List<CreditInvoiceItemSrv> getCreditInvoiceItems() {
        return creditInvoiceItems;
    }

    public void setCreditInvoiceItems(List<CreditInvoiceItemSrv> creditInvoiceItems) {
        this.creditInvoiceItems = creditInvoiceItems;
    }

    public boolean isCanceled() {
        return canceled;
    }

    public void setCanceled(boolean canceled) {
        this.canceled = canceled;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getIssuanceDate() {
        return issuanceDate;
    }

    public void setIssuanceDate(long issuanceDate) {
        this.issuanceDate = issuanceDate;
    }

    public String getIssuancePersianDate() {
        return issuancePersianDate;
    }

    public void setIssuancePersianDate(String issuancePersianDate) {
        this.issuancePersianDate = issuancePersianDate;
    }

    public long getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(long billNumber) {
        this.billNumber = billNumber;
    }

    public UserSrv getUser() {
        return user;
    }

    public void setUser(UserSrv user) {
        this.user = user;
    }

    public long getSerial() {
        return serial;
    }

    public void setSerial(long serial) {
        this.serial = serial;
    }

    public CurrencySrv getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencySrv currency) {
        this.currency = currency;
    }

    public boolean isPayed() {
        return payed;
    }

    public void setPayed(boolean payed) {
        this.payed = payed;
    }
}
