package com.hms.controller;

import com.hms.model.Ward;
import com.hms.service.WardService;

import java.util.List;

public class WardController {
    private final WardService wardService = new WardService();

    public void addWard(Ward ward) {
        wardService.addWard(ward);
    }

    public List<Ward> getAllWards() {
        return wardService.getAllWards();
    }

    public boolean assignPatient(String wardId, String patientId) {
        Ward ward = wardService.getWardById(wardId);
        if (ward == null) {
            return false;
        }
        if (!ward.getPatientIds().contains(patientId)) {
            ward.getPatientIds().add(patientId);
            return true;
        }
        return false;
    }
}
