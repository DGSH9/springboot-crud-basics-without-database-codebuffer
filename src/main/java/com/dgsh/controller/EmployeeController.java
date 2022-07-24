package com.dgsh.controller;

import com.dgsh.model.Employee;
import com.dgsh.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/")
    public int addEmployee(@RequestBody Employee emp){

        return employeeService.addEmployee(emp);
    }

    @GetMapping("/")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable("id") int id){
        return employeeService.getEmployeeById(id);
    }

    @DeleteMapping("/{id}")
    public int deleteEmployee(@PathVariable("id") int id){
        return employeeService.deleteEmployee(id);
    }

}
