package com.hms.util;

public class InputValidator {

    public static boolean isValidPatientId(String patientId) {
        return patientId != null && patientId.matches("P\\d{4}");
    }

    public static boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber != null && phoneNumber.matches("\\d{10}");
    }

    public static boolean isValidMedicationName(String medicationName) {
        return medicationName != null && !medicationName.isEmpty();
    }

}
