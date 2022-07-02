package com.hotel.controller;

import com.hotel.model.Appointments;
import com.hotel.services.impl.AppointmentsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Appointments/Api")
public class AppointmentsController {

    @Autowired
    private AppointmentsServiceImpl appointmentsService;

    @GetMapping
    public List<Appointments> getAllAppointments() {
        return appointmentsService.getAllAppointments();
    }

    @PostMapping
    public ResponseEntity<Appointments> createAppointment(@RequestBody Appointments appointments) {
        return new ResponseEntity<>(appointmentsService.createAppointment(appointments), HttpStatus.CREATED);
    }

    @PutMapping
    public List<Appointments> createMultipleAppointments(@RequestBody List<Appointments> appointments){
        return appointmentsService.createMultipleEmployees(appointments);
    }
}
