package com.hms.service;

import com.hms.model.Doctor;

import java.util.*;

public class DoctorService {
    private final Map<String, Doctor> doctorMap = new HashMap<>();
    private final Map<String, List<String>> doctorToPatientMap = new HashMap<>(); // doctorId -> List of patientIds

    public void addDoctor(Doctor doctor) {
        doctorMap.put(doctor.getId(), doctor);
        doctorToPatientMap.putIfAbsent(doctor.getId(), new ArrayList<>());
    }

    public Doctor getDoctorById(String doctorId) {
        return doctorMap.get(doctorId);
    }

    public boolean assignDoctorToPatient(String doctorId, String patientId) {
        if (!doctorMap.containsKey(doctorId)) return false;
        doctorToPatientMap.computeIfAbsent(doctorId, k -> new ArrayList<>()).add(patientId);
        return true;
    }

    public List<Doctor> getAllDoctors() {
        return new ArrayList<>(doctorMap.values());
    }

}
