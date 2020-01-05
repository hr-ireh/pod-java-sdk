package com.fanap.podNeshan.data.modelSrv;

import java.util.List;

/**
 * Created by Z.gholinia on 9/22/2019.
 */

public class LegSrv {


    private String summary;
    private DistanceSrv distance;
    private DistanceSrv duration;
    private List<StepSrv> steps = null;

    public String getSummary() {
        return summary;
    }


    public void setSummary(String summary) {
        this.summary = summary;
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


    public List<StepSrv> getSteps() {
        return steps;
    }


    public void setSteps(List<StepSrv> steps) {
        this.steps = steps;
    }


}