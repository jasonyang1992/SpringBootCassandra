package com.hotel.services;

import com.hotel.model.Appointments;

import java.util.List;

public interface AppointmentsService {

    List<Appointments> getAllAppointments();
    List<Appointments> createMultipleEmployees(List<Appointments> appointments);
    Appointments createAppointment(Appointments appointments);
}
