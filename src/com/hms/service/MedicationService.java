package com.hms.service;

import com.hms.model.Medication;

import java.util.ArrayList;
import java.util.List;

public class MedicationService {
    private final List<Medication> medications = new ArrayList<>();


    public void addMedication(Medication medication) {
        medications.add(medication);
    }

    // Get a list of all medications
    public List<Medication> getAllMedications() {
        return medications;
    }
}
