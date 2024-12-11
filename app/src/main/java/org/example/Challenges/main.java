package org.example.Challenges;

import java.util.Scanner;

public class main {
    public static void main(String agrs[])
    {
        SalariedEmployee salariedEmployee = new SalariedEmployee(543534l,"2024-11-25","Thompho","1956-12-06","2035-11-25",23412344.89,false);
        HourlyEmployee hourlyEmployee = new HourlyEmployee(6545321l,"2016-10-12","Thulani","1993-11-23","2046-11-12",700.67);
        System.out.println("The employee details: \n");
        System.out.println("Annual Employee ");
        System.out.println( "Employee id:" + salariedEmployee.getEmployeeId() + "\nName: " +
                salariedEmployee.getName() + "\nHireDate: " + salariedEmployee.getHireDate() + "\nAnnual pay  R" + salariedEmployee.getAnnualSalary() +
         "\nBirth-Date: " + salariedEmployee.getBirthDate());

        System.out.println("\nHourly Employee ");
        System.out.println( "Employee id:" + hourlyEmployee.getEmployeeId() + "\nName: " +
                hourlyEmployee.getName() + "\nHireDate: " + hourlyEmployee.getHireDate() + "\nPay Rate Per Hour R" + hourlyEmployee.getHourlypayRate() +
                "\nBirth-Date: " + hourlyEmployee.getBirthDate());

        /*
        * Here lies the information about the system manager
        * name
        * pay rate per hour
        * Hire date
        * employeeId
        * Birth Date*/
        print();
    }

    public static void print()
    {
        Scanner scanner = new Scanner(System.in);
        HourlyEmployee hourlyEmployee = new HourlyEmployee();

        System.out.println("\nHourly Employee No2");
        System.out.println( "\nEmployee id:" + hourlyEmployee.getEmployeeId() + "\nName: " +
                hourlyEmployee.getName() + "\nHireDate: " + hourlyEmployee.getHireDate() + "\nPay Rate Per Hour R" + hourlyEmployee.getHourlypayRate() +
                "\nBirth-Date: " + hourlyEmployee.getBirthDate());

    }

}
