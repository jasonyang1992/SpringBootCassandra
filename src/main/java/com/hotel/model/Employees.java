package com.hotel.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@EntityScan
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("Employees")
public class Employees {

    @PrimaryKey
    private int employeeID;
    private String name;
    private String jobTitle;

}
