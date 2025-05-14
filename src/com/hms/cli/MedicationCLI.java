//package com.hms.cli;
//
//import com.hms.controller.MedicationController;
//import com.hms.model.Medication;
//
//import java.util.Scanner;
//
//public class MedicationCLI {
//    private final Scanner scanner = new Scanner(System.in);
//    private final MedicationController medicationController = new MedicationController();
//
//    public void handleMedicationMenu() {
//        System.out.println("\n💊 Medication Management Menu");
//        System.out.println("1. Add Medication");
//        System.out.println("2. View Medications");
//        System.out.println("0. Back to Main Menu");
//        System.out.print("Enter your choice: ");
//        int choice = Integer.parseInt(scanner.nextLine().trim());
//
//        switch (choice) {
//            case 1 -> addMedication();
//            case 2 -> viewMedications();
//            case 0 -> System.out.println("↩️ Returning to Main Menu...");
//            default -> System.out.println("⚠️ Invalid choice. Returning to Main Menu.");
//        }
//    }
//
//    private void addMedication() {
//        System.out.print("Enter Medication ID: ");
//        String medicationId = scanner.nextLine().trim();
//        System.out.print("Enter Medication Name: ");
//        String name = scanner.nextLine().trim();
//        System.out.print("Enter Dosage: ");
//        String dosage = scanner.nextLine().trim();
//        System.out.print("Enter Patient ID: ");
//        int patientId = Integer.parseInt(scanner.nextLine().trim());
//
//        Medication medication = new Medication(medicationId, name, dosage, patientId);
//        medicationController.addMedication(medication);
//        System.out.println("➕ Medication added successfully!");
//    }
//
//    private void viewMedications() {
//        System.out.println("📋 Medications:");
//        medicationController.getAllMedications().forEach(System.out::println);
//    }
//}
