package com.hotel.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@EntityScan
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("Rooms")
public class Rooms {

    @PrimaryKey
    private int roomID;
    private int employeeID;
    private int customerID;
}
