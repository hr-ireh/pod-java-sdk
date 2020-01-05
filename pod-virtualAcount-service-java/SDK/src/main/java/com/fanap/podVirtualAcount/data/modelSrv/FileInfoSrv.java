package com.fanap.podVirtualAcount.data.modelSrv;


import java.io.Serializable;
import java.util.Date;

/**
 * Created by h.mehrara on 9/20/2014 @Nozhaco.
 */
/*@ApiObject(
        name = "FileInfoSrv",
        description = "desc"
)*/
public class FileInfoSrv implements Serializable {
    private long id;
    private String name;
    private String hashCode;
    private String description;
    private Date created;
    private long size;
    private String type;



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

    public String getHashCode() {
        return hashCode;
    }

    public void setHashCode(String hashCode) {
        this.hashCode = hashCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
