package com.fanap.billingService.util;

public class Voucher {
    private Integer count;
    private Long amount;
    private String name;
    private String description;
    public Voucher(Integer count,Long amount, String name, String description){
        this.count=count;
        this.amount=amount;
        this.name=name;
        this.description=description;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
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
}
