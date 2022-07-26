package com.genspark.RESTfulAPIDemo1.Service;

import com.genspark.RESTfulAPIDemo1.Entity.Employee;

import java.util.List;

public interface EmpService {

    List<Employee> getAllEmps();
    Employee getEmpById(int empId);
    Employee addEmp(Employee emp);
    Employee updateEmp(Employee emp);
    String deleteEmp(int empId);

}
