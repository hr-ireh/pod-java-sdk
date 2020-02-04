package com.fanap.AvandService.data.modelSrv;

import java.io.Serializable;

/**
 * Created by Zahra.Gholinia on 2/4/2020.
 */
public class UserSrv implements Serializable {
    private long id;
    private String name;
    //    private ImageInfoSrv image;
    private String ssoId;
    private int ssoIssuerCode;
    private String profileImage;

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

//    public ImageInfoSrv getImage() {
//        return image;
//    }

//    public void setImage(ImageInfoSrv image) {
//        this.image = image;
//    }

    public String getSsoId() {
        return ssoId;
    }

    public void setSsoId(String ssoId) {
        this.ssoId = ssoId;
    }

    public int getSsoIssuerCode() {
        return ssoIssuerCode;
    }

    public void setSsoIssuerCode(int ssoIssuerCode) {
        this.ssoIssuerCode = ssoIssuerCode;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }
}
