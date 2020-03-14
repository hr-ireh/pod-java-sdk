package com.fanap.podSakku.data.modelSrv;


/**
 * Mehdi Akbarian-Rastaghi 7/3/19
 */

public class AppDomainStatusSrv {

    private Long id;
    private String host;
    private String uid;
    private int tryCounter = 1;
    private State state = State.PENDING;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public int getTryCounter() {
        return tryCounter;
    }

    public void setTryCounter(int tryCounter) {
        this.tryCounter = tryCounter;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "AppDomainStatusSrv{" +
                ", host='" + host + '\'' +
                ", uid='" + uid + '\'' +
                ", tryCounter=" + tryCounter +
                ", state=" + state +
                '}';
    }

    public enum State {
        PENDING, OK, FAILED;
    }
}
