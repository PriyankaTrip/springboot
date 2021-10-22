package com.springexample.springdemo.model;

public class Employee {

    private String Name;
    private String ID;
    private float Salary;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public float getSalary() {
        return Salary;
    }

    public void setSalary(float salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Name='" + Name + '\'' +
                ", ID='" + ID + '\'' +
                ", Salary=" + Salary +
                '}';
    }

}
