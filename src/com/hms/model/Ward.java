package com.hms.model;

public class Ward {
    private String wardId;
    private String name;
    private String location;
    private int bedCount;

    public Ward(String wardId, String name, String location, int bedCount) {
        this.wardId = wardId;
        this.name = name;
        this.location = location;
        this.bedCount = bedCount;
    }

    // Getters and Setters
    public String getWardId() {
        return wardId;
    }

    public void setWardId(String wardId) {
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
