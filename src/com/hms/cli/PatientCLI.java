//package com.hms.cli;
//
//import com.hms.controller.PatientController;
//import com.hms.model.Patient;
//
//import java.util.Scanner;
//
//public class PatientCLI {
//    private final Scanner scanner = new Scanner(System.in);
//    private final PatientController controller = new PatientController();
//
//    public void handlePatientMenu() {
//        boolean back = false;
//
//        while (!back) {
//            printMenu();
//            int choice = getChoice();
//
//            switch (choice) {
//                case 1 -> addPatient();
//                case 2 -> viewPatient();
//                case 3 -> removePatient();
//                case 0 -> back = true;
//                default -> System.out.println("⚠️ Invalid choice. Please try again.");
//            }
//        }
//    }
//
//    private void printMenu() {
//        System.out.println("\n---- Patient Management ----");
//        System.out.println("1. Add Patient");
//        System.out.println("2. View Patient by ID");
//        System.out.println("3. Remove Patient by ID");
//        System.out.println("0. Back to Main Menu");
//        System.out.print("Enter your choice: ");
//    }
//
//    private int getChoice() {
//        try {
//            return Integer.parseInt(scanner.nextLine().trim());
//        } catch (NumberFormatException e) {
//            return -1;
//        }
//    }
//
//    private void addPatient() {
//        System.out.print("Enter Patient ID: ");
//        String id = scanner.nextLine().trim();
//        System.out.print("Enter Name: ");
//        String name = scanner.nextLine().trim();
//        System.out.print("Enter Age: ");
//        int age = Integer.parseInt(scanner.nextLine().trim());
//        System.out.print("Enter Gender: ");
//        String gender = scanner.nextLine().trim();
//        System.out.print("Enter Medical History: ");
//        String history = scanner.nextLine().trim();
//
//        Patient patient = new Patient(id, name, age, gender, history);
//        controller.addPatient(patient);
//        System.out.println("✅ Patient added successfully!");
//    }
//
//    private void viewPatient() {
//        System.out.print("Enter Patient ID: ");
//        String id = scanner.nextLine().trim();
//        Patient patient = controller.getPatient(id);
//
//        if (patient != null) {
//            System.out.println("\n📋 Patient Details:");
//            System.out.println(patient);
//        } else {
//            System.out.println("❌ No patient found with ID: " + id);
//        }
//    }
//
//    private void removePatient() {
//        System.out.print("Enter Patient ID: ");
//        String id = scanner.nextLine().trim();
//        controller.removePatient(id);
//        System.out.println("🗑️ Patient removed (if existed).");
//    }
//}
