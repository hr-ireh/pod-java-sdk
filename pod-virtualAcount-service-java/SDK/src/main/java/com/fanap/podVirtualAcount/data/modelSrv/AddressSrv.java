package com.fanap.podVirtualAcount.data.modelSrv;


import com.fanap.podVirtualAcount.util.JsonUtil;

import java.io.Serializable;

/**
 * Created by h.mehrara on 1/30/2016.
 */
/*@ApiObject(
        name = "AddressSrv",
        description = "desc"
)*/
public class AddressSrv implements Serializable {
    private long id;
    private String address;
    private String city;
    private String state;
    private String country;
    private String phoneNumber;
    private String faxNumber;
    private String postalcode;
    private double latitude;
    private double longitude;
    private String simpleAddress;
    private boolean isDefault;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getSimpleAddress() {
        return simpleAddress;
    }

    public void setSimpleAddress(String simpleAddress) {
        this.simpleAddress = simpleAddress;
    }

    public boolean isDefault() {
        return isDefault;
    }

    public void setDefault(boolean aDefault) {
        isDefault = aDefault;
    }

    public static void main(String[] args) {
        AddressSrv a = new AddressSrv();
        a.setDefault(true);
        System.out.println(JsonUtil.getJson(a));
    }
}
