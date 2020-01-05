package com.fanap.podProduct.data.modelSrv;


import java.io.Serializable;

/**
 * Created by h.mehrara on 3/3/2015.
 */
/*@ApiObject(
        name = "AttributeSrv",
        description = "desc"
)*/
public class AttributeSrv implements Serializable {
    private long id;
    private String name;
    private String code;
    private Boolean searchable;

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

    public Boolean getSearchable() {
        return searchable;
    }

    public void setSearchable(Boolean searchable) {
        this.searchable = searchable;
    }
}
