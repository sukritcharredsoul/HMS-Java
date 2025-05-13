package com.hms.service;

import com.hms.model.Ward;
import java.util.HashMap ;

public class WardService {
    HashMap <String, Ward> wardMap = new HashMap<>();

    public void addWard(Ward ward) {
        wardMap.put(ward.getWardId(), ward);
    }

    public Ward getWardByNumber(String number) {
        return wardMap.get(number);
    }
}
