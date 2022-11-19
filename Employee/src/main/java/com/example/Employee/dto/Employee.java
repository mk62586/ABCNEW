package com.example.Employee.dto;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "CompanyEmployee")
public class Employee {
    @Id
    @GenericGenerator(name = "empIncr",strategy ="increment")
    @GeneratedValue(generator= "empIncr")
    private int id;
    private String empName;
    private long empCode;
    private String empAddress;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public long getEmpCode() {
        return empCode;
    }

    public void setEmpCode(long empCode) {
        this.empCode = empCode;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", empName='" + empName + '\'' +
                ", empCode=" + empCode +
                ", empAddress='" + empAddress + '\'' +
                '}';
    }
}
