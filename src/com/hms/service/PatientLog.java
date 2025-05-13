package com.hms.service;

import java.util.LinkedList ;
import java.util.HashMap;

public class PatientLog {
    private final HashMap<String, LinkedList<String>> logMap = new HashMap<>();

    public void addLog(String patientId, String event) {
        logMap.putIfAbsent(patientId, new LinkedList<>());
        logMap.get(patientId).add(event);
    }

    public LinkedList<String> getLogs(String patientId) {
        return logMap.getOrDefault(patientId, new LinkedList<>());
    }
}
