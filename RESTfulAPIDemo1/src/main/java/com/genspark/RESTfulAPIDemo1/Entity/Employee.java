package com.genspark.RESTfulAPIDemo1.Entity;

import javax.persistence.*;

@Entity
@Table(name="tbl_employees")
public class Employee
{
    @Id
    @Column(name="Employee_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int empId;
    @Column(name="First_Name")
    private String name;
    @Column(name="Salary")
    private String salary;
    @Column(name="Job_Title")
    private String position;

    public Employee() {

    }

    public Employee(String name, String salary, String position) {
        this.name = name;
        this.salary = salary;
        this.position = position;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
