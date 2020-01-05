package com.fanap.podNeshan.data.modelSrv;

/**
 * Created by Z.gholinia on 9/22/2019.
 */


public class ElementSrv {


    private String status;
    private DistanceSrv duration;
    private DistanceSrv distance;

    public String getStatus() {
        return status;
    }


    public void setStatus(String status) {
        this.status = status;
    }

    public DistanceSrv getDuration() {
        return duration;
    }

    public void setDuration(DistanceSrv duration) {
        this.duration = duration;
    }

    public DistanceSrv getDistance() {
        return distance;
    }

    public void setDistance(DistanceSrv distance) {
        this.distance = distance;
    }


}