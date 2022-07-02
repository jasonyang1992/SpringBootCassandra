package com.hotel.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.Date;

@EntityScan
@Table("Appointments")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Appointments {

    @PrimaryKey
    private int appointmentID;
    private int roomID;
    private int customerID;
    private Date startDate;
    private Date endDate;
}
