package com.fanap.podVirtualAcount.data.modelSrv;

import java.io.Serializable;

public class CardListSrv implements Serializable {
    private long id;
    private String number;
    private String tracker;
    private String expiryMonth;
    private String expiryYear;
    private String tag;
    private String[] tags;
    private boolean active;
    private UserSrv user;
    private String ownerNameInquiry;
    private String name;
    private double order;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getTracker() {
        return tracker;
    }

    public void setTracker(String tracker) {
        this.tracker = tracker;
    }

    public String getExpiryMonth() {
        return expiryMonth;
    }

    public void setExpiryMonth(String expiryMonth) {
        this.expiryMonth = expiryMonth;
    }

    public String getExpiryYear() {
        return expiryYear;
    }

    public void setExpiryYear(String expiryYear) {
        this.expiryYear = expiryYear;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public UserSrv getUser() {
        return user;
    }

    public void setUser(UserSrv user) {
        this.user = user;
    }

    public String getOwnerNameInquiry() {
        return ownerNameInquiry;
    }

    public void setOwnerNameInquiry(String ownerNameInquiry) {
        this.ownerNameInquiry = ownerNameInquiry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getOrder() {
        return order;
    }

    public void setOrder(double order) {
        this.order = order;
    }
}