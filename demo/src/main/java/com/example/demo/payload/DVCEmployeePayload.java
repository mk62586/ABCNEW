package com.example.demo.payload;

import lombok.Data;
import lombok.Setter;

import java.sql.Date;
@Data
@Setter
public class DVCEmployeePayload {
    private int id;
    private long emp_id;
    private String name;
    private String address;
    private long phone;
    private Date date;
    private String gender;
}
