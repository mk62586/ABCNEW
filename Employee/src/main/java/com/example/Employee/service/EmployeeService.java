package com.example.Employee.service;

import com.example.Employee.dto.Employee;
import com.example.Employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
  private  EmployeeRepository repo;

    public Employee save(Employee employee){
      return  repo.save(employee);
    }
    public List<Employee> viewAllEmployee(){
       return repo.findAll();
    }
    public Employee updateEmployee(Employee employee){
       Employee emp = repo.findById(1).orElse(null);
       emp.setEmpName(employee.getEmpName());
       emp.setEmpCode(employee.getEmpCode());
       emp.setEmpAddress(emp.getEmpAddress());
       return repo.save(emp);
    }
}
