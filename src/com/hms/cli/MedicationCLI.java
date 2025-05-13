package com.hms.cli;

import java.util.Scanner;

public class MedicationCLI {
    private final Scanner scanner = new Scanner(System.in);

    public void handleMedicationMenu() {
        System.out.println("\n💊 Medication Tracker Menu");
        System.out.println("1. Add Medication Entry");
        System.out.println("2. View Medication History");
        System.out.println("0. Back to Main Menu");
        System.out.print("Enter your choice: ");
        int choice = Integer.parseInt(scanner.nextLine().trim());

        switch (choice) {
            case 1 -> System.out.println("💉 Adding medication (functionality not implemented yet)");
            case 2 -> System.out.println("📜 Viewing medication history (functionality not implemented yet)");
            case 0 -> System.out.println("↩️ Returning to Main Menu...");
            default -> System.out.println("⚠️ Invalid choice. Returning to Main Menu.");
        }
    }
}
