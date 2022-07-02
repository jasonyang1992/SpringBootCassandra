package com.hotel.repository;

import com.hotel.model.Users;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepo extends CassandraRepository<Users, Integer> {

    @Query("SELECT * FROM users WHERE username = ?1 AND password = ?2 ALLOW FILTERING")
    Users getUsernamePassword(String username, String password);

}
