package com.hms.model;

public class Nurse {
    private String id;
    private String name;
    private String shift;
    private String assignedWard;

    public Nurse(String id, String name, String shift, String assignedWard) {
        this.id = id;
        this.name = name;
        this.shift = shift;
        this.assignedWard = assignedWard;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public String getAssignedWard() {
        return assignedWard;
    }

    public void setAssignedWard(String assignedWard) {
        this.assignedWard = assignedWard;
    }

    @Override
    public String toString() {
        return "Nurse{id='" + id + "', name='" + name + "', shift='" + shift + "', assignedWard='" + assignedWard + "'}";
    }
}
