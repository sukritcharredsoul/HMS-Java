package com.hms.service;

import com.hms.model.Doctor;

import java.util.*;

public class DoctorService {
    private final Map<String, Doctor> doctorMap = new HashMap<>();
    private final Map<String, List<String>> doctorToPatientMap = new HashMap<>(); // doctorId -> List of patientIds
    private final PatientService patientService = new PatientService();

    public void addDoctor(Doctor doctor) {
        doctorMap.put(doctor.getId(), doctor);
        doctorToPatientMap.putIfAbsent(doctor.getId(), new ArrayList<>());
    }

    public Doctor getDoctorById(String doctorId) {
        return doctorMap.get(doctorId);
    }

    public boolean assignDoctorToPatient(String doctorId, String patientId) {
        System.out.println("Attempting to assign Doctor ID: " + doctorId + " to Patient ID: " + patientId);
        if (!doctorMap.containsKey(doctorId)) {
            System.out.println("Doctor ID not found: " + doctorId);
            return false;
        }
        if (patientService.getPatientById(patientId) == null) {
            System.out.println("Patient ID not found: " + patientId);
            return false;
        }
        doctorToPatientMap.computeIfAbsent(doctorId, k -> new ArrayList<>()).add(patientId);
        System.out.println("Assignment successful.");
        return true;
    }

    public List<Doctor> getAllDoctors() {
        return new ArrayList<>(doctorMap.values());
    }

    public boolean deleteDoctor(String doctorId) {
        if (doctorMap.containsKey(doctorId)) {
            doctorMap.remove(doctorId);
            doctorToPatientMap.remove(doctorId);
            return true;
        }
        return false;
    }

}
