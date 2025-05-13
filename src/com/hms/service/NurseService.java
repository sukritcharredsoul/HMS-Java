package com.hms.service;

import com.hms.model.Nurse;
import java.util.HashMap ;

public class NurseService {
     HashMap <String, Nurse> nurseMap = new HashMap<>();

    public void addNurse(Nurse nurse) {
        nurseMap.put(nurse.getId(), nurse);
    }

    public Nurse getNurseById(String id) {
        return nurseMap.get(id);
    }

    public void removeNurse(String id) {
        nurseMap.remove(id);
    }
}
