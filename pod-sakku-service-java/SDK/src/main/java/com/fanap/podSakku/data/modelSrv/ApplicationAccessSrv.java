package com.fanap.podSakku.data.modelSrv;


import com.fanap.podSakku.enums.EnumAccessLevel;


public class ApplicationAccessSrv {

    /*id of each application*/
    private Long id;
    /*created date of application access*/
    private String created;
    /*expiration date of application access*/
    private String expiration;
    /*functions available to user*/
    private EnumAccessLevel accessLevel;
    /* user who gain this access to application*/
    private UserPublicSrv person;
    private String imageRegistry = "";

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    public EnumAccessLevel getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(EnumAccessLevel accessLevel) {
        this.accessLevel = accessLevel;
    }

    public UserPublicSrv getPerson() {
        return person;
    }

    public void setPerson(UserPublicSrv person) {
        this.person = person;
    }

    public String getImageRegistry() {
        return imageRegistry;
    }

    public void setImageRegistry(String imageRegistry) {
        this.imageRegistry = imageRegistry;
    }
}
