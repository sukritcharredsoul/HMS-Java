package com.hms.service;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.hms.model.Patient;


public class PatientService {
    HashMap <String, Patient>  patientMap = new HashMap<>();

    public void addPatient(Patient patient) {
        patientMap.put(patient.getId(), patient);
    }

    public Patient getPatientById(String id) {
        return patientMap.get(id);
    }

    public void removePatient(String id) {
        patientMap.remove(id);
    }

    public List<Patient> getAllPatients() {
        return new ArrayList<>(patientMap.values());
    }
}
