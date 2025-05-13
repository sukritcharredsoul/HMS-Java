package com.hms.controller;

import com.hms.model.Ward;
import com.hms.service.WardService;

public class WardController {
    private final WardService wardService = new WardService();

    public void addWard(Ward ward) {
        wardService.addWard(ward);
    }

    public Ward getWard(String number) {
        return wardService.getWardByNumber(number);
    }
}
