package com.fanap.podVirtualAccount.data.modelSrv;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by Zahra Golinia on 2/4/2020.
 */

public class CardToCardPoolItemSrv implements Serializable {
    private long id;
    private long amount;
    private String description;
    private String destCardNumber;
    private String trackingId;
    private Date doneDate;
    private List<CardToCardPoolLogSrv> cardToCardPoolLogList;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDestCardNumber() {
        return destCardNumber;
    }

    public void setDestCardNumber(String destCardNumber) {
        this.destCardNumber = destCardNumber;
    }

    public String getTrackingId() {
        return trackingId;
    }

    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    public Date getDoneDate() {
        return doneDate;
    }

    public void setDoneDate(Date doneDate) {
        this.doneDate = doneDate;
    }

    public List<CardToCardPoolLogSrv> getCardToCardPoolLogList() {
        return cardToCardPoolLogList;
    }

    public void setCardToCardPoolLogList(List<CardToCardPoolLogSrv> cardToCardPoolLogList) {
        this.cardToCardPoolLogList = cardToCardPoolLogList;
    }
}
