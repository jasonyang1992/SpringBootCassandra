package com.hotel.services.impl;

import com.hotel.model.Appointments;
import com.hotel.repository.AppointmentsRepo;
import com.hotel.services.AppointmentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentsServiceImpl implements AppointmentsService {

    @Autowired
    private AppointmentsRepo appointmentsRepo;

    @Override
    public List<Appointments> getAllAppointments() {
        return appointmentsRepo.findAll();
    }

    @Override
    public List<Appointments> createMultipleEmployees(List<Appointments> appointments) {
        return appointmentsRepo.saveAll(appointments);
    }

    @Override
    public Appointments createAppointment(Appointments appointments) {
        return appointmentsRepo.save(appointments);
    }
}
