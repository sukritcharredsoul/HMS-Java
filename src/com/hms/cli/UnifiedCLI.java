package com.hms.cli;

import com.hms.controller.*;
import com.hms.model.*;
import com.hms.service.PatientService;
import java.util.List;
import java.util.Scanner;
import java.util.Date;
import com.hms.util.InputValidator;
import java.util.HashSet;

public class UnifiedCLI {
    private final Scanner scanner = new Scanner(System.in);
    private final PatientService patientService = new PatientService();
    private final DoctorController doctorController = new DoctorController(patientService);
    private final NurseController nurseController = new NurseController();
    private final MedicationController medicationController = new MedicationController();
    private final PatientController patientController = new PatientController();
    private final WardController wardController = new WardController();
    private final HashSet<String> usedPatientIds = new HashSet<>();

    public void start() {
        boolean exit = false;

        while (!exit) {
            printMainMenu();
            int choice = getChoice();

            switch (choice) {
                case 1 -> handleDoctorMenu();
                case 2 -> handleNurseMenu();
                case 3 -> handlePatientMenu();
                case 4 -> handleMedicationMenu();
                case 5 -> handleWardMenu();
                case 0 -> exit = true;
                default -> System.out.println("Invalid choice. Try again laterg.");
            }
        }
    }

    private void printMainMenu() {
        System.out.println("\n Hospital Management Systems");
        System.out.println("1. Doctor Management");
        System.out.println("2. Nurse Management");
        System.out.println("3. Patient Management");
        System.out.println("4. Medication Management");
        System.out.println("5. Ward Management");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    private int getChoice() {
        try {
            return Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            return -1;
        }
    }


    private void handleDoctorMenu() {
        boolean back = false;

        while (!back) {
            System.out.println("\nDoctor Management Menu");
            System.out.println("1. Add Doctor");
            System.out.println("2. Assign Doctor to Patient");
            System.out.println("3. View Doctors");
            System.out.println("4. Delete Doctor");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter your choice: ");

            int choice = getChoice();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Doctor ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Doctor Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Specialty: ");
                    String specialty = scanner.nextLine();
                    System.out.println("Enter Doctor Contact: ");
                    int contact = Integer.parseInt(scanner.nextLine());

                    Doctor doctor = new Doctor(id, name, specialty, contact);
                    doctorController.addDoctor(doctor);
                    System.out.println("Doctor added successfully!");
                }
                case 2 -> {
                    System.out.print("Enter Doctor ID: ");
                    String doctorId = scanner.nextLine();
                    System.out.print("Enter Patient ID: ");
                    String patientId = scanner.nextLine();

                    boolean success = doctorController.assignDoctorToPatient(doctorId, patientId);
                    System.out.println(success ? "Doctor assigned to patient successfully!" : "Assignment failed. Check IDs and try again.");
                }
                case 3 -> {
                    List<Doctor> doctors = doctorController.getAllDoctors();
                    if (doctors.isEmpty()) System.out.println("No doctors found.");
                    else doctors.forEach(System.out::println);
                }
                case 4 -> {
                    System.out.print("Enter Doctor ID to delete: ");
                    String id = scanner.nextLine();
                    boolean success = doctorController.deleteDoctor(id);
                    System.out.println(success ? "Doctor deleted successfully!" : "Doctor not found.");
                }
                case 0 -> back = true;
                default -> System.out.println("Invalid choice.");
            }
        }
    }


    private void handleNurseMenu() {
        boolean back = false;

        while (!back) {
            System.out.println("\nNurse Management Menu");
            System.out.println("1. Add Nurse");
            System.out.println("2. Assign Nurse to Ward");
            System.out.println("3. View Nurses");
            System.out.println("4. Remove Nurse");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter your choice: ");

            int choice = getChoice();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Nurse ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Nurse Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Nurse Specialty: ");
                    String specialty = scanner.nextLine();
                    System.out.print("Enter Contact: ");
                    String contact = scanner.nextLine();

                    Nurse nurse = new Nurse(id, name, specialty, contact);
                    nurseController.addNurse(nurse);
                    System.out.println("Nurse added successfully!");
                }
                case 2 -> {
                    System.out.print("Enter Nurse ID: ");
                    String nurseId = scanner.nextLine();
                    System.out.print("Enter Ward ID: ");
                    String wardId = scanner.nextLine();

                    boolean success = nurseController.assignNurseToWard(nurseId, wardId);
                    System.out.println(success ? "Assigned successfully!" : "Assignment failed.");
                }
                case 3 -> {
                    List<Nurse> nurses = nurseController.getAllNurses();
                    if (nurses.isEmpty()) System.out.println("📭 No nurses found.");
                    else nurses.forEach(nurse -> System.out.println("ID: " + nurse.getId() + ", Name: " + nurse.getName() + ", Shift: " + nurse.getShift() + ", Assigned Ward : " + nurse.getAssignedWard()));
                }
                case 4 -> {
                    System.out.print("Enter Nurse ID to remove: ");
                    String id = scanner.nextLine();
                    boolean success = nurseController.removeNurse(id);
                    System.out.println(success ? "Nurse removed successfully!" : "Nurse not found.");
                }
                case 0 -> back = true;
                default -> System.out.println("Invalid choice.");
            }
        }
    }


    private void handlePatientMenu() {
        boolean back = false;

        while (!back) {
            System.out.println("\n Patient Management Menu");
            System.out.println("1. Add Patient");
            System.out.println("2. View Patient by ID");
            System.out.println("3. Remove Patient");
            System.out.println("4. View All Patients");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter your choice: ");

            int choice = getChoice();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Patient ID: ");
                    String id = scanner.nextLine().trim();
                    System.out.println("Checking if ID is unique...");
                    if (usedPatientIds.contains(id)) {
                        System.out.println("Duplicate Patient ID. It should be unique.");
                        break;
                    }
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine().trim();
                    System.out.print("Enter Age: ");
                    int age = Integer.parseInt(scanner.nextLine().trim());
                    System.out.print("Enter Gender: ");
                    String gender = scanner.nextLine().trim();
                    System.out.print("Enter Medical History: ");
                    String history = scanner.nextLine().trim();

                    Patient patient = new Patient(id, name, age, gender, history);
                    patientController.addPatient(patient);
                    System.out.println("Adding ID to usedPatientIds...");
                    usedPatientIds.add(id);
                    System.out.println("Updated usedPatientIds: " + usedPatientIds);
                    System.out.println("✅ Patient added successfully!");
                }
                case 2 -> {
                    System.out.print("Enter Patient ID: ");
                    String id = scanner.nextLine().trim();
                    Patient patient = patientController.getPatient(id);
                    System.out.println(patient != null ? patient : "❌ Patient not found.");
                }
                case 3 -> {
                    System.out.print("Enter Patient ID: ");
                    String id = scanner.nextLine().trim();
                    patientController.removePatient(id);
                    System.out.println("Patient removed (if existed).");
                }
                case 4 -> {
                    List<Patient> patients = patientController.getAllPatients();
                    if (patients.isEmpty()) System.out.println("No patients found.");
                    else patients.forEach(System.out::println);
                }
                case 0 -> back = true;
                default -> System.out.println("Invalid choice.");
            }
        }
    }


    private void handleMedicationMenu() {
        boolean back = false;

        while (!back) {
            System.out.println("\n Medication Management Menu");
            System.out.println("1. Add Medication");
            System.out.println("2. View Medications");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter your choice: ");

            int choice = getChoice();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Medication ID: ");
                    String id = scanner.nextLine().trim();
                    System.out.print("Enter Medication Name: ");
                    String name = scanner.nextLine().trim();
                    if (!InputValidator.isValidMedicationName(name)) {
                        System.out.println("Invalid Medication Name. It cannot be empty.");
                        break;
                    }
                    System.out.print("Enter Dosage: ");
                    String dosage = scanner.nextLine().trim();
                    System.out.print("Enter Patient ID: ");
                    int patientId = Integer.parseInt(scanner.nextLine().trim());

                    Date timeGiven = new Date();
                    Medication med = new Medication(id, name, dosage, patientId, timeGiven);
                    medicationController.addMedication(med);
                    System.out.println("Medication added successfully!");
                }
                case 2 -> medicationController.getAllMedications().forEach(System.out::println);
                case 0 -> back = true;
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    // ====== Ward Management ======
    private void handleWardMenu() {
        boolean back = false;

        while (!back) {
            System.out.println("\nWard Management Menu");
            System.out.println("1. Add Ward");
            System.out.println("2. View Wards");
            System.out.println("3. Assign Patient to Ward");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter your choice: ");

            int choice = getChoice();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Ward ID: ");
                    String id = scanner.nextLine().trim();
                    System.out.print("Enter Ward Name: ");
                    String name = scanner.nextLine().trim();

                    Ward ward = new Ward(id, name);
                    wardController.addWard(ward);
                    System.out.println("Ward added successfully!");
                }
                case 2 -> wardController.getAllWards().forEach(System.out::println);
                case 3 -> {
                    System.out.print("Enter Ward ID: ");
                    String wardId = scanner.nextLine().trim();
                    System.out.print("Enter Patient ID: ");
                    String patientId = scanner.nextLine().trim();

                    boolean success = wardController.assignPatient(wardId, patientId);
                    System.out.println(success ? "Patient assigned!" : " Assignment failed.");
                }
                case 0 -> back = true;
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}
