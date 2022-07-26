package com.genspark.RESTfulAPIDemo1.Entity;

public class Employee
{
    private int empId;
    private String name;
    private String salary;
    private String position;

    public Employee() {

    }

    public Employee(int empId, String name, String salary, String position) {
        this.empId = empId;
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
