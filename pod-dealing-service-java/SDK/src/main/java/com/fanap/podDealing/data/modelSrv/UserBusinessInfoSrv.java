package com.fanap.podDealing.data.modelSrv;


import java.io.Serializable;

/**
 * Created by M.Vahedi on 12/30/2017.
 */
public class UserBusinessInfoSrv implements Serializable {
    private long id;
    private String name;
    private int subscriptionCount;
    private boolean subscribed;
    private RateSrv rate;
    private ImageInfoSrv imageInfo;
    private String image;
    private boolean favorite;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSubscriptionCount() {
        return subscriptionCount;
    }

    public void setSubscriptionCount(int subscriptionCount) {
        this.subscriptionCount = subscriptionCount;
    }

    public boolean isSubscribed() {
        return subscribed;
    }

    public void setSubscribed(boolean subscribed) {
        this.subscribed = subscribed;
    }

    public RateSrv getRate() {
        return rate;
    }

    public void setRate(RateSrv rate) {
        this.rate = rate;
    }

    public ImageInfoSrv getImageInfo() {
        return imageInfo;
    }

    public void setImageInfo(ImageInfoSrv imageInfo) {
        this.imageInfo = imageInfo;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}
