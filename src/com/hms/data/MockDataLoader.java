package com.hms.data;

import com.hms.model.*;

import java.util.*;

public class MockDataLoader {

    public static List<Patient> loadSamplePatients() {
        List<Patient> patients = new ArrayList<>();
        patients.add(new Patient("P001", "John Doe", 30, "M", "Flu"));
        patients.add(new Patient("P002", "Jane Smith", 25, "F", "Fever"));
        return patients;
    }

    public static List<Doctor> loadSampleDoctors() {
        List<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("D001", "Dr. Alice", "Cardiologist",9888));
        doctors.add(new Doctor("D002", "Dr. Bob", "General Physician",99999));
        return doctors;
    }

    public static List<Nurse> loadSampleNurses() {
        List<Nurse> nurses = new ArrayList<>();
        nurses.add(new Nurse("N001", "Nina", "Day","icu"));
        nurses.add(new Nurse("N002", "Leo", "Night","gicu"));
        return nurses;
    }

    public static List<Ward> loadSampleWards() {
        List<Ward> wards = new ArrayList<>();
        wards.add(new Ward(101, "General", "icu",4));
        wards.add(new Ward(102, "ICU", "icu",23));
        return wards;
    }

    public static List<Medication> loadSampleMedications() {
        List<Medication> medications = new ArrayList<>();
        medications.add(new Medication("Paracetamol", "500mg", "P001", "D001"));
        medications.add(new Medication("Ibuprofen", "200mg", "P002", "D002"));
        return medications;
    }


}
