package com.hms.controller;

import com.hms.model.Patient;
import com.hms.service.PatientService;
import java.util.List;

public class PatientController {
    private final PatientService patientService = new PatientService();

    public void addPatient(Patient patient) {
        patientService.addPatient(patient);
    }

    public Patient getPatient(String id) {
        return patientService.getPatientById(id);
    }

    public void removePatient(String id) {
        patientService.removePatient(id);
    }

    public List<Patient> getAllPatients() {
        return patientService.getAllPatients();
    }
}
