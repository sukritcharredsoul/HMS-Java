package com.hms.controller;

import com.hms.service.PatientLog;

public class PatientLogController {
    private final PatientLog logService = new PatientLog();

    public void addLog(String patientId, String event) {
        logService.addLog(patientId, event);
    }

    public void viewLog(String patientId) {
        var logs = logService.getLogs(patientId);
        logs.printAll(); // Assuming MyLinkedList has a printAll() method
    }
}
