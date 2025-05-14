package com.hms.model;

public class Doctor {
    private String id;
    private String name;
    private String specialty;
    private Integer contact;

    public Doctor(String id, String name, String specialty, Integer contact) {
        this.id = id;
        this.name = name;
        this.specialty = specialty;
        this.contact = contact;
    }


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

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Integer getContact() {
        return contact;
    }

    public void setContact(Integer contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Doctor{id='" + id + "', name='" + name + "', specialty='" + specialty + "', contact='" + contact + "'}";
    }
}
