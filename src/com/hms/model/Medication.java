package com.hms.model;

import java.util.Date;

public class Medication {
    private String medicationId;
    private String name;
    private String dosage;
    private Date timeGiven;
    private String patientId;

    public Medication(String medicationId, String name, String dosage, Date timeGiven, String patientId) {
        this.medicationId = medicationId;
        this.name = name;
        this.dosage = dosage;
        this.timeGiven = timeGiven;
        this.patientId = patientId;
    }

    // Getters and Setters
    public String getMedicationId() {
        return medicationId;
    }

    public void setMedicationId(String medicationId) {
        this.medicationId = medicationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public Date getTimeGiven() {
        return timeGiven;
    }

    public void setTimeGiven(Date timeGiven) {
        this.timeGiven = timeGiven;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    @Override
    public String toString() {
        return "Medication{medicationId='" + medicationId + "', name='" + name + "', dosage='" + dosage + "', timeGiven=" + timeGiven + ", patientId='" + patientId + "'}";
    }
}
