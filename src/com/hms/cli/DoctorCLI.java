package com.hms.cli;

import java.util.Scanner;

public class DoctorCLI {
    private final Scanner scanner = new Scanner(System.in);

    public void handleDoctorMenu() {
        System.out.println("\n🩺 Doctor Management Menu");
        System.out.println("1. Add Doctor");
        System.out.println("2. Assign Doctor to Patient");
        System.out.println("3. View Doctors");
        System.out.println("0. Back to Main Menu");
        System.out.print("Enter your choice: ");
        int choice = Integer.parseInt(scanner.nextLine().trim());

        switch (choice) {
            case 1 -> System.out.println("➕ Adding doctor (functionality not implemented yet)");
            case 2 -> System.out.println("👨‍⚕️ Assigning doctor (functionality not implemented yet)");
            case 3 -> System.out.println("📋 Viewing all doctors (functionality not implemented yet)");
            case 0 -> System.out.println("↩️ Returning to Main Menu...");
            default -> System.out.println("⚠️ Invalid choice. Returning to Main Menu.");
        }
    }
}
