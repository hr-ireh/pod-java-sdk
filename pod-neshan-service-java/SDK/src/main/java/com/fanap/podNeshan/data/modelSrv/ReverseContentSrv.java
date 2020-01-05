package com.fanap.podNeshan.data.modelSrv;

import java.util.List;

/**
 * Created by Z.gholinia on 9/22/2019.
 */
public class ReverseContentSrv {


    private String status;
    private String formatted_address;
    private String route_name;
    private String route_type;
    private String neighbourhood;
    private String city;
    private String state;
    private Object place;
    private String municipality_zone;
    private boolean in_traffic_zone;
    private boolean in_odd_even_zone;
    private List<AddressSrv> addresses = null;


    public String getStatus() {
        return status;
    }


    public void setStatus(String status) {
        this.status = status;
    }


    public String getFormattedAddress() {
        return formatted_address;
    }


    public void setFormattedAddress(String formattedAddress) {
        this.formatted_address = formattedAddress;
    }


    public String getRouteName() {
        return route_name;
    }


    public void setRouteName(String routeName) {
        this.route_name = routeName;
    }


    public String getRouteType() {
        return route_type;
    }


    public void setRouteType(String routeType) {
        this.route_type = routeType;
    }


    public String getNeighbourhood() {
        return neighbourhood;
    }


    public void setNeighbourhood(String neighbourhood) {
        this.neighbourhood = neighbourhood;
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


    public Object getPlace() {
        return place;
    }


    public void setPlace(Object place) {
        this.place = place;
    }


    public String getMunicipalityZone() {
        return municipality_zone;
    }


    public void setMunicipalityZone(String municipalityZone) {
        this.municipality_zone = municipalityZone;
    }


    public boolean isInTrafficZone() {
        return in_traffic_zone;
    }


    public void setInTrafficZone(boolean inTrafficZone) {
        this.in_traffic_zone = inTrafficZone;
    }


    public boolean isInOddEvenZone() {
        return in_odd_even_zone;
    }


    public void setInOddEvenZone(boolean inOddEvenZone) {
        this.in_odd_even_zone = inOddEvenZone;
    }


    public List<AddressSrv> getAddresses() {
        return addresses;
    }


    public void setAddresses(List<AddressSrv> addresses) {
        this.addresses = addresses;
    }


}