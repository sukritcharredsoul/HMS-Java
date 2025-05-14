package com.hms.model;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Medication {
    private String medicationId;
    private String name;
    private String dosage;
    private int patientId;
    private Date timeGiven;

    public Medication(String medicationId, String name, String dosage, int patientId, Date timeGiven) {
        this.medicationId = medicationId;
        this.name = name;
        this.dosage = dosage;
        this.patientId = patientId;
        this.timeGiven = timeGiven;
    }

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

    public Date getTimeGiven() {
        return timeGiven;
    }

    public void setTimeGiven(Date timeGiven) {
        this.timeGiven = timeGiven;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedTimeGiven = sdf.format(timeGiven);
        return "Medication{medicationId='" + medicationId + "', name='" + name + "', dosage='" + dosage + "', timeGiven='" + formattedTimeGiven + "', patientId='" + patientId + "'}";
    }
}
