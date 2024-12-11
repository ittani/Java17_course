package org.example.Challenges;

public class Employee extends Worker{
    private long employeeId;
    private String hireDate;

    public Employee(long employeeId, String hireDate,String name, String birthDate, String endDate) {
        super(name,birthDate,endDate);
        this.employeeId = employeeId;
        this.hireDate = hireDate;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }
}
