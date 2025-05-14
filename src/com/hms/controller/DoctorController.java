package com.hms.controller;

import com.hms.model.Doctor;
import com.hms.model.Patient;
import com.hms.service.DoctorService;
import com.hms.service.PatientService;

import java.util.List;

public class DoctorController {
    private final DoctorService doctorService = new DoctorService();
    private final PatientService patientService = new PatientService() ;

    public void addDoctor(Doctor doctor) {
        doctorService.addDoctor(doctor);
    }

    public boolean assignDoctorToPatient(String doctorId, String patientId) {
        Doctor doctor = doctorService.getDoctorById(doctorId);
        Patient patient = patientService.getPatientById(patientId);

        if (doctor != null && patient != null) {
            return doctorService.assignDoctorToPatient(doctorId, patientId);
        }
        return false;
    }

    public List<Doctor> getAllDoctors() {
        return doctorService.getAllDoctors();
    }
}
