package com.hms.cli;

import java.util.Scanner;

public class WardCLI {
    private final Scanner scanner = new Scanner(System.in);

    public void handleWardMenu() {
        System.out.println("\n🏨 Ward Management Menu");
        System.out.println("1. Add Ward");
        System.out.println("2. View Wards");
        System.out.println("3. Assign Patients to Wards");
        System.out.println("0. Back to Main Menu");
        System.out.print("Enter your choice: ");
        int choice = Integer.parseInt(scanner.nextLine().trim());

        switch (choice) {
            case 1 -> System.out.println("➕ Adding ward (functionality not implemented yet)");
            case 2 -> System.out.println("📋 Viewing wards (functionality not implemented yet)");
            case 3 -> System.out.println("🏥 Assigning patients (functionality not implemented yet)");
            case 0 -> System.out.println("↩️ Returning to Main Menu...");
            default -> System.out.println("⚠️ Invalid choice. Returning to Main Menu.");
        }
    }
}
