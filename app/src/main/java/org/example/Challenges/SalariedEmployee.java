package org.example.Challenges;

public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(long employeeId, String hireDate, String name, String birthDate, String endDate, double annualSalary, boolean isRetired) {
        super(employeeId, hireDate, name, birthDate, endDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public boolean isRetired() {
        return isRetired;
    }

    public void setRetired(boolean retired) {
        isRetired = retired;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                '}';
    }

    public void retire()
    {
        if(isRetired() == false)
        {
            System.out.println("The employee has not yet retired!");
        }
        else
        {
            System.out.println("The employee has retired!");
        }


    }
}
