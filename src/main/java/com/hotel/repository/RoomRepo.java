package com.hotel.repository;

import com.hotel.model.Rooms;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepo extends CassandraRepository<Rooms, Integer> {
}
