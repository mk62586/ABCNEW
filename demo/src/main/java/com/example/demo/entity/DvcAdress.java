package com.example.demo.entity;

import lombok.Data;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Data
@Getter
public class DvcAdress {
    @Id
    private long id;
    @Column(name="emp_id")
    private long empId;
    private String line1;
    private String line2;
    private String city;
    private String state;
    private String country;
    private int pinCode;
    @ManyToOne
    @JoinColumn(name = "DvcEmployee")

    private DvcEmployee dvcEmployee;

}
