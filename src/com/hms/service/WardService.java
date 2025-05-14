package com.hms.service;

import com.hms.model.Ward;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WardService {
    private final HashMap<String, Ward> wardMap = new HashMap<>();

    public void addWard(Ward ward) {
        wardMap.put(ward.getId(), ward);
    }

    public Ward getWardById(String id) {
        return wardMap.get(id);
    }

    public List<Ward> getAllWards() {
        return new ArrayList<>(wardMap.values());
    }
}
