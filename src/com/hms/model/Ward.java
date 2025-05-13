package com.hms.model;

import jdk.jshell.ImportSnippet;

public class Ward {
    private Integer wardId;
    private String name;
    private String location;
    private int bedCount;

    public Ward(Integer wardId, String name, String location, int bedCount) {
        this.wardId = wardId;
        this.name = name;
        this.location = location;
        this.bedCount = bedCount;
    }

    // Getters and Setters
    public Integer getWardId() {
        return wardId;
    }

    public void setWardId(Integer wardId) {
        this.wardId = wardId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getBedCount() {
        return bedCount;
    }

    public void setBedCount(int bedCount) {
        this.bedCount = bedCount;
    }

    @Override
    public String toString() {
        return "Ward{wardId='" + wardId + "', name='" + name + "', location='" + location + "', bedCount=" + bedCount + "}";
    }
}
