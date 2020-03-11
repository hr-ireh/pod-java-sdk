package com.fanap.podAIPlatform.data.modelSrv;

public class NLUIOTContentSrv {

    private String order;
    private String object;
    private String place;
    private String time;
    private String degree;
    private IOTMode mode;
    private String itme_to_play;
    private String item_to_play_type;
    private String location;
    private long timeToGo;

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getItme_to_play() {
        return itme_to_play;
    }

    public void setItme_to_play(String itme_to_play) {
        this.itme_to_play = itme_to_play;
    }

    public String getItem_to_play_type() {
        return item_to_play_type;
    }

    public void setItem_to_play_type(String item_to_play_type) {
        this.item_to_play_type = item_to_play_type;
    }

    public long getTimeToGo() {
        return timeToGo;
    }

    public void setTimeToGo(long timeToGo) {
        this.timeToGo = timeToGo;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }


    public IOTMode getMode() {
        return mode;
    }

    public void setMode(IOTMode mode) {
        this.mode = mode;
    }

}
