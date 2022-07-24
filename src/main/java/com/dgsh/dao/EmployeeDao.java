package com.dgsh.dao;

import com.dgsh.model.Employee;

import java.util.List;

public interface EmployeeDao {

    int addEmployee(Employee emp);

    List<Employee> getAllEmployees();

    Employee getEmployeeById(int id);

    int deleteEmployee(int id);

    //Update
//    int updateEmployee(int id,Employee emp);
}
