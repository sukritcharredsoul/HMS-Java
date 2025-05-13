package com.hms.controller;

import com.hms.model.Doctor;
import com.hms.service.DoctorService;

public class DoctorController {
    private final DoctorService doctorService = new DoctorService();

    public void addDoctor(Doctor doctor) {
        doctorService.addDoctor(doctor);
    }

    public Doctor getDoctor(String id) {
        return doctorService.getDoctorById(id);
    }

    public void removeDoctor(String id) {
        doctorService.removeDoctor(id);
    }
}
