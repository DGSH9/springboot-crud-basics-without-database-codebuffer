package com.dgsh.dao;

import com.dgsh.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{

    List<Employee> list = new ArrayList<>();

    @Override
    public int addEmployee(Employee emp) {
        list.add(emp);
        return 1;

    }

    @Override
    public List<Employee> getAllEmployees() {
        return list;
    }

    @Override
    public Employee getEmployeeById(int id) {
        for(Employee emp: list){
            if(emp.getEmpId()==id){
                return emp;
            }

        }
        return null;
    }

    @Override
    public int deleteEmployee(int id) {
        Employee empTodelete = null;
        for (Employee emp:list){
            if(emp.getEmpId() == id){
                empTodelete = emp;
            }
        }
        if(empTodelete!=null){
            list.remove(empTodelete);
            return 1;
        }
        else {
            return 0;
        }
    }
}
