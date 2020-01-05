package com.fanap.podVirtualAcount.data.modelSrv;

public class BusinessLegalInfoSrv {
    private Long id;
    private String companyName;
    private String shopName;
    private String shopNameEn;
    private String website;
    private Long dateEstablishing;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopNameEn() {
        return shopNameEn;
    }

    public void setShopNameEn(String shopNameEn) {
        this.shopNameEn = shopNameEn;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Long getDateEstablishing() {
        return dateEstablishing;
    }

    public void setDateEstablishing(Long dateEstablishing) {
        this.dateEstablishing = dateEstablishing;
    }
}
