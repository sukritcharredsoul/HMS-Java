//package com.hms.cli;
//
//import com.hms.controller.DoctorController;
//import com.hms.model.Doctor;
//
//import java.util.List;
//import java.util.Scanner;
//
//public class DoctorCLI {
//    private final Scanner scanner = new Scanner(System.in);
//    private final DoctorController doctorController = new DoctorController();
//
//    public void handleDoctorMenu() {
//        boolean back = false;
//
//        while (!back) {
//            System.out.println("\n🩺 Doctor Management Menu");
//            System.out.println("1. Add Doctor");
//            System.out.println("2. Assign Doctor to Patient");
//            System.out.println("3. View Doctors");
//            System.out.println("0. Back to Main Menu");
//            System.out.print("Enter your choice: ");
//
//            int choice;
//            try {
//                choice = Integer.parseInt(scanner.nextLine().trim());
//            } catch (NumberFormatException e) {
//                System.out.println("Plese enter a num ");
//                continue;
//            }
//
//            switch (choice) {
//                case 1 -> addDoctor();
//                case 2 -> assignDoctorToPatient();
//                case 3 -> viewDoctors();
//                case 0 -> back = true;
//                default -> System.out.println("Invalid choice");
//            }
//        }
//    }
//
//    private void addDoctor() {
//        System.out.print("Enter Doctor ID: ");
//        String id = scanner.nextLine();
//        System.out.print("Enter Doctor Name: ");
//        String name = scanner.nextLine();
//        System.out.print("Enter Specialty: ");
//        String specialty = scanner.nextLine();
//
//        System.out.println("Enter Doctor Contact");
//        int contact = scanner.nextInt() ;
//
//        Doctor doctor = new Doctor(id, name, specialty,contact);
//        doctorController.addDoctor(doctor);
//        System.out.println("Doctor added successfully!");
//    }
//
//    private void assignDoctorToPatient() {
//        System.out.print("Enter Doctor ID: ");
//        String doctorId = scanner.nextLine();
//        System.out.print("Enter Patient ID: ");
//        String patientId = scanner.nextLine();
//
//        boolean success = doctorController.assignDoctorToPatient(doctorId, patientId);
//        if (success) {
//            System.out.println("Doctor assigned to patient successfully!");
//        } else {
//            System.out.println("Failed to assign doctor. Check if both IDs are correct.");
//        }
//    }
//
//    private void viewDoctors() {
//        List<Doctor> doctors = doctorController.getAllDoctors();
//        if (doctors.isEmpty()) {
//            System.out.println("No doctors found.");
//        } else {
//            System.out.println("\n List of Doctors:");
//            for (Doctor doc : doctors) {
//                System.out.println(doc);
//            }
//        }
//    }
//}

