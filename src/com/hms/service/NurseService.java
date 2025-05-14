package com.hms.service;

import com.hms.model.Nurse;

import java.util.ArrayList;
import java.util.List;

public class NurseService {
    private final List<Nurse> nurses = new ArrayList<>();


    public void addNurse(Nurse nurse) {
        nurses.add(nurse);
    }


    public boolean assignNurseToWard(String nurseId, String wardId) {
        for (Nurse nurse : nurses) {
            if (nurse.getId().equals(nurseId)) {
                nurse.setAssignedWard(wardId);
                return true;
            }
        }
        return false;
    }


    public List<Nurse> getAllNurses() {
        return nurses;
    }

    public boolean removeNurse(String nurseId) {
        return nurses.removeIf(nurse -> nurse.getId().equals(nurseId));
    }
}
