package com.hotel.repository;

import com.hotel.model.Employees;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends CassandraRepository<Employees,Integer> {
}
