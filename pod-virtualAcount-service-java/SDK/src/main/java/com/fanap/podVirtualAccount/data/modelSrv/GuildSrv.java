package com.fanap.podVirtualAccount.data.modelSrv;

import java.io.Serializable;

/**
 * Created by Zahra Golinia on 2/4/2020.
 */

public class GuildSrv implements Serializable {
    private long id;
    private String name;
    private String code;
    private ImageInfoSrv imageInfo;
    private Boolean selected;

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ImageInfoSrv getImageInfo() {
        return imageInfo;
    }

    public void setImageInfo(ImageInfoSrv imageInfo) {
        this.imageInfo = imageInfo;
    }

    public Boolean getSelected() {
        return selected;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }
}
