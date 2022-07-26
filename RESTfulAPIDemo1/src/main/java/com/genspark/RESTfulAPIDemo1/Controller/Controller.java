package com.genspark.RESTfulAPIDemo1.Controller;

import com.genspark.RESTfulAPIDemo1.Entity.Employee;
import com.genspark.RESTfulAPIDemo1.Service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private EmpService empService;

    @GetMapping("/")
    public String home(){
        return "<HTML><H1>Welcome to Jake's Demo Company!</H1></HTML>";
    }

    @GetMapping("/employees")
    public List<Employee> getEmps(){
        return this.empService.getAllEmps();
    }
    @GetMapping("/employees/{empId}")
    public Employee getEmp(@PathVariable String empId){
        return this.empService.getEmpById(Integer.parseInt(empId));
    }
    @PostMapping("/employees")
    public Employee addEmp(@RequestBody Employee emp){
        return this.empService.addEmp(emp);
    }
    @PutMapping("/employees")
    public Employee updateEmp(@RequestBody Employee employee){
        return this.empService.updateEmp(employee);
    }
    @DeleteMapping("/employees/{empId}")
    public String deleteEmployee(@PathVariable String empId){
        return this.empService.deleteEmp(Integer.parseInt(empId));
    }


}
