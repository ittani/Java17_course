package org.example.Challenges;

public class HourlyEmployee extends Employee{
    private double hourlypayRate;

    public HourlyEmployee(long employeeId, String hireDate, String name, String birthDate, String endDate, double hourlypayRate) {
        super(employeeId, hireDate, name, birthDate, endDate);
        this.hourlypayRate = hourlypayRate;
    }

    public double getHourlypayRate() {
        return hourlypayRate;
    }

    public void setHourlypayRate(double hourlypayRate) {
        this.hourlypayRate = hourlypayRate;
    }
}
