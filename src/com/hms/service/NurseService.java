package com.hms.service;

import com.hms.model.Nurse;

import java.util.ArrayList;
import java.util.List;

public class NurseService {
    private final List<Nurse> nurses = new ArrayList<>();

    // Add a new nurse to the list
    public void addNurse(Nurse nurse) {
        nurses.add(nurse);
    }

    // Assign a nurse to a ward
    public boolean assignNurseToWard(String nurseId, String wardId) {
        for (Nurse nurse : nurses) {
            if (nurse.getId().equals(nurseId)) {
                nurse.setAssignedWard(wardId);
                return true;  // Successfully assigned
            }
        }
        return false;  // Nurse not found
    }

    // Retrieve a list of all nurses
    public List<Nurse> getAllNurses() {
        return nurses;
    }
}
