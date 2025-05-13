package com.hms.service;

import com.hms.model.Patient;

import java.util.LinkedList;
import java.util.Queue;

public class AppointmentService {
    private final Queue<Patient> appointmentQueue = new LinkedList<>();

    // Add a patient to the appointment queue
    public void scheduleAppointment(Patient patient) {
        appointmentQueue.offer(patient);
        System.out.println("Appointment scheduled for: " + patient.getName());
    }

    // Get the next patient in line
    public Patient nextAppointment() {
        if (appointmentQueue.isEmpty()) {
            System.out.println("No appointments in queue.");
            return null;
        }
        Patient next = appointmentQueue.poll();
        System.out.println("Next appointment: " + next.getName());
        return next;
    }

    // Peek the next patient without removing
    public Patient peekNextAppointment() {
        return appointmentQueue.peek();
    }

    // Check if the queue has patients
    public boolean hasAppointments() {
        return !appointmentQueue.isEmpty();
    }
}
