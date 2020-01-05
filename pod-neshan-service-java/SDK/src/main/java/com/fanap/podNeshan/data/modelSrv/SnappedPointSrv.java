package com.fanap.podNeshan.data.modelSrv;

public class SnappedPointSrv {


    private MapMatchingLocationSrv location;

    private long originalIndex;


    public MapMatchingLocationSrv getLocation() {
        return location;
    }


    public void setLocation(MapMatchingLocationSrv location) {
        this.location = location;
    }


    public long getOriginalIndex() {
        return originalIndex;
    }


    public void setOriginalIndex(long originalIndex) {
        this.originalIndex = originalIndex;
    }


}