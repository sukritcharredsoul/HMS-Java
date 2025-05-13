package com.hms.cli;

import java.util.Scanner;

public class NurseCLI {
    private final Scanner scanner = new Scanner(System.in);

    public void handleNurseMenu() {
        System.out.println("\n👩‍⚕️ Nurse Management Menu");
        System.out.println("1. Add Nurse");
        System.out.println("2. Assign Nurse to Ward");
        System.out.println("3. View Nurses");
        System.out.println("0. Back to Main Menu");
        System.out.print("Enter your choice: ");
        int choice = Integer.parseInt(scanner.nextLine().trim());

        switch (choice) {
            case 1 -> System.out.println("➕ Adding nurse (functionality not implemented yet)");
            case 2 -> System.out.println("🏥 Assigning nurse (functionality not implemented yet)");
            case 3 -> System.out.println("📋 Viewing all nurses (functionality not implemented yet)");
            case 0 -> System.out.println("↩️ Returning to Main Menu...");
            default -> System.out.println("⚠️ Invalid choice. Returning to Main Menu.");
        }
    }
}
