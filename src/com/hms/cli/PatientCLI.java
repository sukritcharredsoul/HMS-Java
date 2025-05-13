package com.hms.cli;

import java.util.Scanner;

public class PatientCLI {
    private final Scanner scanner = new Scanner(System.in);

    public void handlePatientMenu() {
        System.out.println("\n👤 Patient Management Menu");
        System.out.println("1. Add Patient");
        System.out.println("2. View Patient");
        System.out.println("3. View All Patients");
        System.out.println("0. Back to Main Menu");
        System.out.print("Enter your choice: ");
        int choice = Integer.parseInt(scanner.nextLine().trim());

        switch (choice) {
            case 1 -> System.out.println("➕ Adding patient (functionality not implemented yet)");
            case 2 -> System.out.println("🔍 Viewing patient (functionality not implemented yet)");
            case 3 -> System.out.println("📋 Viewing all patients (functionality not implemented yet)");
            case 0 -> System.out.println("↩️ Returning to Main Menu...");
            default -> System.out.println("⚠️ Invalid choice. Returning to Main Menu.");
        }
    }
}
