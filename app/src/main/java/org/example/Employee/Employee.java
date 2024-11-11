package org.example.Employee;

public class Employee {
    private String name;
    private String empployeeId;
    private int age;
    private long cell;

    public Employee(String name, String empployeeId, int age, long cell) {
        this.name = name;
        this.empployeeId = empployeeId;
        this.age = age;
        this.cell = cell;
    }

    public Employee()
    {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpployeeId() {
        return empployeeId;
    }

    public void setEmpployeeId(String empployeeId) {
        this.empployeeId = empployeeId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getCell() {
        return cell;
    }

    public void setCell(long cell) {
        this.cell = cell;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", empployeeId='" + empployeeId + '\'' +
                ", age=" + age +
                ", cell=" + cell +
                '}';
    }
}
