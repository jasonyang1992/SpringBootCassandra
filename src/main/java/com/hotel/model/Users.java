package com.hotel.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@EntityScan
@Table("Customer")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users {

    @PrimaryKey
    private int customerID;
    private String username;
    private String password;
    private String name;
}
