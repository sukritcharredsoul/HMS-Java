package com.hms.model;

import java.util.Date;

public class Medication {
    private String medicationId;
    private String name;
    private String dosage;
    private int patientId;

    public Medication(String medicationId, String name, String dosage, int patientId) {
        this.medicationId = medicationId;
        this.name = name;
        this.dosage = dosage;
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

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    @Override
    public String toString() {
        return "Medication{medicationId='" + medicationId + "', name='" + name + "', dosage='" + dosage + "', timeGiven="  + ", patientId='" + patientId + "'}";
    }
}
