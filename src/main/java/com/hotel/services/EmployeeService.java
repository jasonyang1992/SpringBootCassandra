package com.hotel.services;

import com.hotel.model.Employees;

import java.util.List;

public interface EmployeeService {

    List<Employees> getAllEmployees();
    Employees createEmployee(Employees employees);
    List<Employees> createMultipleEmployees(List<Employees> employees);
}
