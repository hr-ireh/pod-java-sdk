package com.fanap.billingService.data.modelVo;

public class EventRemindersContent {
    private Long id;
    private Long alarmTime;
    private String alarmType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAlarmTime() {
        return alarmTime;
    }

    public void setAlarmTime(Long alarmTime) {
        this.alarmTime = alarmTime;
    }

    public String getAlarmType() {
        return alarmType;
    }

    public void setAlarmType(String alarmType) {
        this.alarmType = alarmType;
    }
}
