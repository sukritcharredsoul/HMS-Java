//package com.hms.cli;
//
//import com.hms.controller.NurseController;
//import com.hms.model.Nurse;
//
//import java.util.List;
//import java.util.Scanner;
//
//public class NurseCLI {
//    private final Scanner scanner = new Scanner(System.in);
//    private final NurseController nurseController = new NurseController();
//
//    public void handleNurseMenu() {
//        boolean back = false;
//
//        while (!back) {
//            System.out.println("\n👩‍⚕️ Nurse Management Menu");
//            System.out.println("1. Add Nurse");
//            System.out.println("2. Assign Nurse to Ward");
//            System.out.println("3. View Nurses");
//            System.out.println("0. Back to Main Menu");
//            System.out.print("Enter your choice: ");
//
//            int choice;
//            try {
//                choice = Integer.parseInt(scanner.nextLine().trim());
//            } catch (NumberFormatException e) {
//                System.out.println("⚠️ Invalid input. Please enter a number.");
//                continue;
//            }
//
//            switch (choice) {
//                case 1 -> addNurse();
//                case 2 -> assignNurseToWard();
//                case 3 -> viewNurses();
//                case 0 -> back = true;
//                default -> System.out.println("⚠️ Invalid choice. Try again.");
//            }
//        }
//    }
//
//    private void addNurse() {
//        System.out.print("Enter Nurse ID: ");
//        String id = scanner.nextLine();
//        System.out.print("Enter Nurse Name: ");
//        String name = scanner.nextLine();
//        System.out.print("Enter Nurse Specialty: ");
//        String specialty = scanner.nextLine();
//        System.out.print("Enter Nurse Contact Number: ");
//        String contact = scanner.nextLine();
//
//        Nurse nurse = new Nurse(id, name, specialty, contact);
//        nurseController.addNurse(nurse);
//        System.out.println("✅ Nurse added successfully!");
//    }
//
//    private void assignNurseToWard() {
//        System.out.print("Enter Nurse ID: ");
//        String nurseId = scanner.nextLine();
//        System.out.print("Enter Ward ID: ");
//        String wardId = scanner.nextLine();
//
//        boolean success = nurseController.assignNurseToWard(nurseId, wardId);
//        if (success) {
//            System.out.println("✅ Nurse assigned to ward successfully!");
//        } else {
//            System.out.println("❌ Failed to assign nurse. Check if both IDs are correct.");
//        }
//    }
//
//    private void viewNurses() {
//        List<Nurse> nurses = nurseController.getAllNurses();
//        if (nurses.isEmpty()) {
//            System.out.println("📭 No nurses found.");
//        } else {
//            System.out.println("\n📋 List of Nurses:");
//            for (Nurse nurse : nurses) {
//                System.out.println(nurse);
//            }
//        }
//    }
//}
