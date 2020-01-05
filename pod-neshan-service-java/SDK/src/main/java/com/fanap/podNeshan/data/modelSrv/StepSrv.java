package com.fanap.podNeshan.data.modelSrv;

import java.util.List;

/**
 * Created by Z.gholinia on 9/22/2019.
 */
public class StepSrv {


    private String name;
    private String instruction;
    private DistanceSrv distance;
    private DistanceSrv duration;
    private String polyline;
    private String maneuver;
    private List<Double> start_location = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public DistanceSrv getDistance() {
        return distance;
    }

    public void setDistance(DistanceSrv distance) {
        this.distance = distance;
    }

    public DistanceSrv getDuration() {
        return duration;
    }

    public void setDuration(DistanceSrv duration) {
        this.duration = duration;
    }

    public String getPolyline() {
        return polyline;
    }

    public void setPolyline(String polyline) {
        this.polyline = polyline;
    }

    public String getManeuver() {
        return maneuver;
    }

    public void setManeuver(String maneuver) {
        this.maneuver = maneuver;
    }

    public List<Double> getStartLocation() {
        return start_location;
    }

    public void setStartLocation(List<Double> startLocation) {
        this.start_location = startLocation;
    }


}