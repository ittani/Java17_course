package org.example.Challenges;

public class HourlyEmployee extends Employee{
    private double hourlypayRate;

    public HourlyEmployee(long employeeId, String hireDate, String name, String birthDate, String endDate, double hourlypayRate) {
        super(employeeId, hireDate, name, birthDate, endDate);
        this.hourlypayRate = hourlypayRate;
    }

    public HourlyEmployee()
    {
        super(27434l,"2010-02-27","moddah","2000-04-26","2040-02-27");
    }
    public double getHourlypayRate() {
        return hourlypayRate;
    }

    public void setHourlypayRate(double hourlypayRate) {
        this.hourlypayRate = hourlypayRate;
    }
}
