package com.fanap.podSakku.data.modelSrv;

import java.util.List;

/**
 * @author N.Zamiri
 */


public class DeployStateSrv {
    private int code;
    private String title;
    private String message;
    private double percent;
    private String deployQueueId;
    private List<MiniDeployStateSrv> steps;
    private String updated;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public String getDeployQueueId() {
        return deployQueueId;
    }

    public void setDeployQueueId(String deployQueueId) {
        this.deployQueueId = deployQueueId;
    }

    public List<MiniDeployStateSrv> getSteps() {
        return steps;
    }

    public void setSteps(List<MiniDeployStateSrv> steps) {
        this.steps = steps;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }
}
