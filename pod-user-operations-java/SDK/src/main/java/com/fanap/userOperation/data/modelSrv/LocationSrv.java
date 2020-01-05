package com.fanap.userOperation.data.modelSrv;

/**
 * Created by Shahab Askarian on 6/19/2019.
 */
public class LocationSrv {
    private double lat;
    private double lon;
    private String countryCode;
    private String name;

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
