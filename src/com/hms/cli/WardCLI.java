//package com.hms.cli;
//
//import com.hms.controller.WardController;
//import com.hms.model.Ward;
//
//import java.util.Scanner;
//
//public class WardCLI {
//    private final Scanner scanner = new Scanner(System.in);
//    private final WardController controller = new WardController();
//
//    public void handleWardMenu() {
//        boolean back = false;
//
//        while (!back) {
//            printMenu();
//            int choice = getChoice();
//
//            switch (choice) {
//                case 1 -> addWard();
//                case 2 -> viewWards();
//                case 3 -> assignPatientToWard();
//                case 0 -> back = true;
//                default -> System.out.println("⚠️ Invalid choice. Try again.");
//            }
//        }
//    }
//
//    private void printMenu() {
//        System.out.println("\n🏨 Ward Management Menu");
//        System.out.println("1. Add Ward");
//        System.out.println("2. View Wards");
//        System.out.println("3. Assign Patient to Ward");
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
//    private void addWard() {
//        System.out.print("Enter Ward ID: ");
//        String id = scanner.nextLine().trim();
//        System.out.print("Enter Ward Name: ");
//        String name = scanner.nextLine().trim();
//
//        Ward ward = new Ward(id, name);
//        controller.addWard(ward);
//        System.out.println("✅ Ward added successfully!");
//    }
//
//    private void viewWards() {
//        System.out.println("\n📋 All Wards:");
//        for (Ward ward : controller.getAllWards()) {
//            System.out.println(ward);
//        }
//    }
//
//    private void assignPatientToWard() {
//        System.out.print("Enter Ward ID: ");
//        String wardId = scanner.nextLine().trim();
//        System.out.print("Enter Patient ID to assign: ");
//        String patientId = scanner.nextLine().trim();
//
//        boolean success = controller.assignPatient(wardId, patientId);
//        if (success) {
//            System.out.println("✅ Patient assigned to ward successfully!");
//        } else {
//            System.out.println("❌ Failed to assign patient. Check IDs.");
//        }
//    }
//}
