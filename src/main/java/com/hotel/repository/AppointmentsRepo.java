package com.hotel.repository;

import com.hotel.model.Appointments;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentsRepo extends CassandraRepository<Appointments, Integer> {
}
