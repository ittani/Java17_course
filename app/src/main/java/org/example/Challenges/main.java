package org.example.Challenges;

public class main {
    public static void main(String agrs[])
    {
        SalariedEmployee salariedEmployee = new SalariedEmployee(543534l,"2024-11-25","Thompho","1956-12-06","2035-11-25",2200.78,false);
        HourlyEmployee hourlyEmployee = new HourlyEmployee(6545321l,"2016-10-12","Thulani","1993-11-23","2046-11-12",700.67);
        System.out.println("The employee details: \n");
        System.out.println( "Employee id:" + salariedEmployee.getEmployeeId() + "\nName: " +
                salariedEmployee.getName() + "\nHireDate: " + salariedEmployee.getHireDate() + "\nPay Rate Per Hour R" + salariedEmployee.getAnnualSalary() +
         "\nBirth-Date: " + salariedEmployee.getBirthDate());
    }
}
