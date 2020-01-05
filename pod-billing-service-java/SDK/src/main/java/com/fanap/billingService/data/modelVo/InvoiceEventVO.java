package com.fanap.billingService.data.modelVo;


import java.io.Serializable;
import java.util.List;

public class InvoiceEventVO implements Serializable {
    private String title;
    private String timeZone;
    private List<String> reminders;
    private String description;
    private String metadata;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public List<String> getReminders() {
        return reminders;
    }

    public void setReminders(List<String> reminders) {
        this.reminders = reminders;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }
}
