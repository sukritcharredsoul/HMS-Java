package com.hms.controller;

import com.hms.model.Medication;
import com.hms.service.MedicationService;

public class MedicationController {
    private final MedicationService medicationService = new MedicationService();

    public void logMedication(String patientId, Medication medication) {
        medicationService.addMedication(patientId, medication);
    }

    public void viewMedications(String patientId) {
        var meds = medicationService.getMedications(patientId);
        meds.printAll(); // Assuming MyLinkedList has a printAll() method
    }
}
