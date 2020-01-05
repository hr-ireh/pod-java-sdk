package com.fanap.podVirtualAcount.data.modelSrv;

import java.io.Serializable;

/**
 * Created by M.Vahedi on 5/5/2018.
 */
public class RelatedUserSrv implements Serializable {
    private String username;
    private String nickname;
    private String name;
    private String image;
    private long id;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
