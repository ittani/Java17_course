package org.example.Inheritance.Employee;

public class Employee {
    private String name;
    private long Id;
    private double salary;

    public Employee(String name, long Id, double salary)
    {
        this.name=name;
        this.salary=salary;
        this.Id=Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
