package com.hms;

import com.hms.cli.PatientCLI;
import com.hms.cli.DoctorCLI;
import com.hms.cli.NurseCLI;
import com.hms.cli.MedicationCLI;
import com.hms.cli.WardCLI;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("🏥 Welcome to the Hospital Management System!");
        boolean running = true;

        while (running) {
            printMainMenu();
            int choice = getUserChoice();

            switch (choice) {
                case 1 -> new PatientCLI().handlePatientMenu();
                case 2 -> new DoctorCLI().handleDoctorMenu();
                case 3 -> new NurseCLI().handleNurseMenu();
                case 4 -> new MedicationCLI().handleMedicationMenu();
                case 5 -> new WardCLI().handleWardMenu();
                case 0 -> {
                    running = false;
                    System.out.println("👋 Exiting Hospital Management System. Goodbye!");
                }
                default -> System.out.println("⚠️ Invalid choice. Please enter a valid option.");
            }
        }

        scanner.close();
    }

    private static void printMainMenu() {
        System.out.println("\n========= Main Menu =========");
        System.out.println("1. Patient Management");
        System.out.println("2. Doctor Management");
        System.out.println("3. Nurse Management");
        System.out.println("4. Medication Tracker");
        System.out.println("5. Ward Management");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    private static int getUserChoice() {
        try {
            return Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}
