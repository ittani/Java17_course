package org.example.StringMethods;

import java.util.Date;

public class Employemnet extends Person {
    private double Salary;
    private String location;

    public Employemnet(double salary, String location, String name, int age) {
        super(name,age);
        this.Salary = salary;
        this.location = location;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Employemnet{" +
                "Salary=" + Salary +
                ", location='" + location + '\'' +
                '}';
    }
}
