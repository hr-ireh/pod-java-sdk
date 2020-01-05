package com.fanap.podSubscription.data.modelSrv;

import java.io.Serializable;

/**
 * Created by h.mehrara on 9/20/2014 @Nozhaco.
 */
/*@ApiObject(
        name = "BusinessSoftSrv",
        description = "desc"
)*/
public class BusinessSoftSrv implements Serializable {
    private long id;
    private String name;
    private ImageInfoSrv imageInfo;
    private String image;
    private int numOfProducts;
    private RateSrv rate;
    private String sheba;
    private String phone;


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

    public int getNumOfProducts() {
        return numOfProducts;
    }

    public void setNumOfProducts(int numOfProducts) {
        this.numOfProducts = numOfProducts;
    }

    public RateSrv getRate() {
        return rate;
    }

    public void setRate(RateSrv rate) {
        this.rate = rate;
    }

    public String getSheba() {
        return sheba;
    }

    public void setSheba(String sheba) {
        this.sheba = sheba;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
