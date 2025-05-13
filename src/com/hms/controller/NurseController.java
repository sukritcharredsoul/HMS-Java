package com.hms.controller;

import com.hms.model.Nurse;
import com.hms.service.NurseService;

public class NurseController {
    private final NurseService nurseService = new NurseService();

    public void addNurse(Nurse nurse) {
        nurseService.addNurse(nurse);
    }

    public Nurse getNurse(String id) {
        return nurseService.getNurseById(id);
    }

    public void removeNurse(String id) {
        nurseService.removeNurse(id);
    }
}
