package com.hms.service;

import com.hms.model.Medication;
import java.util.LinkedList ;
import java.util.HashMap;

public class MedicationService {
    private final HashMap<String, LinkedList<Medication>> medicationLog = new HashMap<>();

    public void addMedication(String patientId, Medication medication) {
        medicationLog.putIfAbsent(patientId, new LinkedList<>());
        medicationLog.get(patientId).add(medication);
    }

    public LinkedList<Medication> getMedications(String patientId) {
        return medicationLog.getOrDefault(patientId, new LinkedList<>());
    }
}
