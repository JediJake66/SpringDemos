package com.genspark.RESTfulAPIDemo1.Service;

import com.genspark.RESTfulAPIDemo1.Entity.Employee;
import com.genspark.RESTfulAPIDemo1.Repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmpServImp implements EmpService {

    @Autowired
    private EmployeeRepo empRepo;

    @Override
    public List<Employee> getAllEmps() {
        return this.empRepo.findAll();
    }

    @Override
    public Employee getEmpById(int empId) {

        Optional <Employee> e = this.empRepo.findById(empId);
        Employee employee = null;
        if(e.isPresent()){
            employee=e.get();
        }else{
            throw new RuntimeException("Employee Not Found for ID: "+empId);
        }
        return employee;
    }

    @Override
    public Employee addEmp(Employee emp) {
        return this.empRepo.save(emp);
    }

    @Override
    public Employee updateEmp(Employee emp) {
        return this.empRepo.save(emp);
    }

    @Override
    public String deleteEmp(int empId) {
        this.empRepo.deleteById(empId);
        return "Employee was successfully fired.";
    }


}
