package com.fanap.podNeshan.data.modelSrv;

/**
 * Created by Z.gholinia on 9/22/2019.
 */
public class ItemSrv {


    private String title;
    private String address;
    private String neighbourhood;
    private String region;
    private String type;
    private String category;
    private LocationSrv location;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNeighbourhood() {
        return neighbourhood;
    }

    public void setNeighbourhood(String neighbourhood) {
        this.neighbourhood = neighbourhood;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocationSrv getLocation() {
        return location;
    }

    public void setLocation(LocationSrv location) {
        this.location = location;
    }


}