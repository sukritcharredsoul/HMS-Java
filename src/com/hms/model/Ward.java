package com.hms.model;

import java.util.ArrayList;
import java.util.List;

public class Ward {
    private String id;
    private String name;
    private List<String> patientIds;

    public Ward(String id, String name) {
        this.id = id;
        this.name = name;
        this.patientIds = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getPatientIds() {
        return patientIds;
    }

    @Override
    public String toString() {
        return "Ward{id='" + id + "', name='" + name + "', patients=" + patientIds + "}";
    }
}
