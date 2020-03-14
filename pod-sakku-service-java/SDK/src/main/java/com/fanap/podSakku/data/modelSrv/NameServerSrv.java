package com.fanap.podSakku.data.modelSrv;

/**
 * Mehdi Akbarian-Rastaghi 9/2/19
 */


public class NameServerSrv {
    private String current;
    private boolean error;

    public String getCurrent() {
        return current;
    }

    public void setCurrent(String current) {
        this.current = current;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }
}
