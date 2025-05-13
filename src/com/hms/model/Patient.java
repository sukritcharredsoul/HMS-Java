package com.hms.model;

import java.util.Date;

public class Patient {
    private String id;
    private String name;
    private Date dateOfBirth;
    private String gender;
    private String medicalHistory;

    public Patient(String id, String name, Date dateOfBirth, String gender, String medicalHistory) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.medicalHistory = medicalHistory;
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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    @Override
    public String toString() {
        return "Patient{id='" + id + "', name='" + name + "', dateOfBirth=" + dateOfBirth + ", gender='" + gender + "', medicalHistory='" + medicalHistory + "'}";
    }
}
