package com.dgsh.service;

import com.dgsh.dao.EmployeeDao;
import com.dgsh.model.Employee;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    public int addEmployee(Employee emp){
        return employeeDao.addEmployee(emp);
    }


    public List<Employee> getAllEmployees(){
        return employeeDao.getAllEmployees();
    }

    public Employee getEmployeeById(int id){
        return employeeDao.getEmployeeById(id);
    }

    public int deleteEmployee(int id){
        return employeeDao.deleteEmployee(id);
    }
}
