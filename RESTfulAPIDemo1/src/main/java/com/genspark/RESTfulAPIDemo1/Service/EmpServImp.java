package com.genspark.RESTfulAPIDemo1.Service;

import com.genspark.RESTfulAPIDemo1.Entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpServImp implements EmpService {

    List<Employee> empList;

    public EmpServImp() {
        empList = new ArrayList<>();
        empList.add(new Employee(1,"Jake","$100,000","Director Of Operations"));
        empList.add(new Employee(2,"Kevin","$85,000","Project Manager"));
        empList.add(new Employee(3,"John","$55,000","Software Developer"));
        empList.add(new Employee(4,"Jeff","$30,000","Intern"));
    }

    @Override
    public List<Employee> getAllEmps() {
        return empList;
    }

    @Override
    public Employee getEmpById(int empId) {

        Employee e = null;
        for(Employee emp: empList){
            if(emp.getEmpId()==empId){
                e=emp;
                break;
            }
        }
        return e;
    }

    @Override
    public Employee addEmp(Employee emp) {
        empList.add(emp);
        return emp;
    }

    @Override
    public Employee updateEmp(Employee emp) {
        String salary = emp.getSalary();
        String position = emp.getPosition();
        Employee e=null;
        for(Employee employee: empList){
            if(employee.getEmpId()==emp.getEmpId()){
                employee.setSalary(salary);
                employee.setPosition(position);
                e=employee;
                break;
            }
        }
        return e;
    }

    @Override
    public String deleteEmp(int empId) {
        for(Employee emp: empList){
            if(emp.getEmpId()==empId){
                empList.remove(emp);
                break;
            }
        }
        return "Employee was successfully fired.";
    }


}
