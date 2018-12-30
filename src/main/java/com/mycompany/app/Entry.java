package com.mycompany.app;

import java.util.Date;

public class Entry {
    private Date stamp;

    public Entry(Date stamp, String entry) {
        this.stamp = stamp;
        this.entry = entry;
    }

    private String entry;

    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }

    public Date getStamp() {
        return stamp;
    }

    public void setStamp(Date stamp) {
        this.stamp = stamp;
    }
}
