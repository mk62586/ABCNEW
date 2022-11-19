package com.example.Employee.controller;

import com.example.Employee.dto.Employee;
import com.example.Employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
@ComponentScan
public class EmployeeController {

    @Autowired
   private EmployeeService employeeService;

    @PostMapping("/save")
    public Employee saveemployee(@RequestBody Employee employee){
      return  employeeService.save(employee);
    }
    @GetMapping("/viewAll")
    public List<Employee> employeeList(){
        return employeeService.viewAllEmployee();
    }
    @PutMapping("/editEmployee/{id}")
    public Employee modify(@RequestBody Employee employee){
        return employeeService.updateEmployee(employee);
    }
}
