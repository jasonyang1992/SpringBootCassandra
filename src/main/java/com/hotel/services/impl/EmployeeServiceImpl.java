package com.hotel.services.impl;

import com.hotel.model.Employees;
import com.hotel.repository.EmployeeRepo;
import com.hotel.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public List<Employees> getAllEmployees() {
        return employeeRepo.findAll();
    }

    @Override
    public Employees createEmployee(Employees employees) {
        return employeeRepo.save(employees);
    }

    @Override
    public List<Employees> createMultipleEmployees(List<Employees> employees) {
        return employeeRepo.saveAll(employees);
    }
}
