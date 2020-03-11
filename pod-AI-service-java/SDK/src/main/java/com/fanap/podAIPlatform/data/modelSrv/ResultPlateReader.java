package com.fanap.podAIPlatform.data.modelSrv;

public class ResultPlateReader {

    private String confidence;
    private String text;
    private String token;
    private String xmax;
    private String xmin;
    private String ymax;
    private String ymin;

    public String getConfidence() {
        return confidence;
    }

    public void setConfidence(String confidence) {
        this.confidence = confidence;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getXmax() {
        return xmax;
    }

    public void setXmax(String xmax) {
        this.xmax = xmax;
    }

    public String getXmin() {
        return xmin;
    }

    public void setXmin(String xmin) {
        this.xmin = xmin;
    }

    public String getYmax() {
        return ymax;
    }

    public void setYmax(String ymax) {
        this.ymax = ymax;
    }

    public String getYmin() {
        return ymin;
    }

    public void setYmin(String ymin) {
        this.ymin = ymin;
    }
}
