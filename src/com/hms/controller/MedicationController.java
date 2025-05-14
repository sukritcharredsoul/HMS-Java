package com.hms.controller;

import com.hms.model.Medication;
import com.hms.service.MedicationService;

import java.util.List;

public class MedicationController {
    private final MedicationService medicationService = new MedicationService();

    public void addMedication(Medication medication) {
        medicationService.addMedication(medication);
    }

    public List<Medication> getAllMedications() {
        return medicationService.getAllMedications();
    }
}
