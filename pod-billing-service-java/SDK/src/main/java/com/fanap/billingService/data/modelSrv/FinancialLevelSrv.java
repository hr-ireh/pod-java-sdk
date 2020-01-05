package com.fanap.billingService.data.modelSrv;

import java.io.Serializable;

public class FinancialLevelSrv implements Serializable {

    private long id;
    private String level;
    private String levelName;
    private int value;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
