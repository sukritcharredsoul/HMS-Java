package com.hms.controller;

import com.hms.model.Nurse;
import com.hms.service.NurseService;

import java.util.List;

public class NurseController {
    private final NurseService nurseService = new NurseService();

    public void addNurse(Nurse nurse) {
        nurseService.addNurse(nurse);
    }

    public boolean assignNurseToWard(String nurseId, String wardId) {
        return nurseService.assignNurseToWard(nurseId, wardId);
    }

    public List<Nurse> getAllNurses() {
        return nurseService.getAllNurses();
    }
}
