package com.fanap.SsoService.data.modelSrv;

/**
 * Created by Shahab Askarian on 6/19/2019.
 */
public class FanapMiniUserSrv {
    private String preferred_username;
    private String given_name;
    private String family_name;
    private int id;

    public String getPreferred_username() {
        return preferred_username;
    }

    public void setPreferred_username(String preferred_username) {
        this.preferred_username = preferred_username;
    }

    public String getGiven_name() {
        return given_name;
    }

    public void setGiven_name(String given_name) {
        this.given_name = given_name;
    }

    public String getFamily_name() {
        return family_name;
    }

    public void setFamily_name(String family_name) {
        this.family_name = family_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
