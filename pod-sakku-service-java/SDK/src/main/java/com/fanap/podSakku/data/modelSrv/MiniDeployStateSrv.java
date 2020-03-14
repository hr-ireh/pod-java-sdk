package com.fanap.podSakku.data.modelSrv;


/**
 * @author N.Zamiri
 */

public class MiniDeployStateSrv {
    private int code;
    private String title;
    private boolean passed;

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

    public boolean isPassed() {
        return passed;
    }

    public void setPassed(boolean passed) {
        this.passed = passed;
    }
}
