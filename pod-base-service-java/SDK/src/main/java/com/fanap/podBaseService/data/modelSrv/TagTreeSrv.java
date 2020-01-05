package com.fanap.podBaseService.data.modelSrv;


import java.io.Serializable;
import java.util.Date;

/**
 * Created by M.Vahedi on 9/19/2017.
 */
public class TagTreeSrv implements Serializable {
    private long id;
    private String name;
    private int level;
    private TagTreeCategorySrv category;
    private Date creationDate;
    private Long parent;
    private boolean enable;

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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public TagTreeCategorySrv getCategory() {
        return category;
    }

    public void setCategory(TagTreeCategorySrv category) {
        this.category = category;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Long getParent() {
        return parent;
    }

    public void setParent(Long parent) {
        this.parent = parent;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }
}
