package com.fanap.podSubscription.data.modelSrv;


import java.io.Serializable;

/**
 * Created by Z.gholinia on 7/30/2019.
 */
public class SubscriptionFullSrv extends SubscriptionSrv implements Serializable {
    private UserSrv subscriber;

    public UserSrv getSubscriber() {
        return subscriber;
    }

    public void setSubscriber(UserSrv subscriber) {
        this.subscriber = subscriber;
    }
}
