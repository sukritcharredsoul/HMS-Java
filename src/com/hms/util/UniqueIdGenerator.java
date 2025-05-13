package com.hms.util;

import java.util.UUID;

public class UniqueIdGenerator {

    public static String generateUniqueId() {
        return UUID.randomUUID().toString();
    }

    public static String generatePatientId() {
        return "P" + (1000 + (int) (Math.random() * 9000));
    }

    public static String generateDoctorId() {
        return "D" + (1000 + (int) (Math.random() * 9000));
    }
}
