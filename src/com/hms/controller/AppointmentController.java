package com.hms.controller;

import com.hms.model.Patient;
import com.hms.service.AppointmentService;

public class AppointmentController {
    private final AppointmentService appointmentService = new AppointmentService();

    public void schedule(Patient patient) {
        appointmentService.scheduleAppointment(patient);
    }

    public Patient nextAppointment() {
        return appointmentService.nextAppointment();
    }

    public Patient peekNext() {
        return appointmentService.peekNextAppointment();
    }

    public boolean hasAppointments() {
        return appointmentService.hasAppointments();
    }
}
