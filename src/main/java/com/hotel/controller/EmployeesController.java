package com.hotel.controller;

import com.hotel.model.Employees;
import com.hotel.services.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Employee/Api")
public class EmployeesController {

    @Autowired
    private EmployeeServiceImpl employeeService;

    @GetMapping
    public List<Employees> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @PostMapping
    public ResponseEntity<Employees> createEmployee(@RequestBody Employees employees){
        return new ResponseEntity<>(employeeService.createEmployee(employees), HttpStatus.CREATED);
    }

    @PutMapping
    public List<Employees> createMultipleEmployees(@RequestBody List<Employees> employees){
        return employeeService.createMultipleEmployees(employees);
    }
}
