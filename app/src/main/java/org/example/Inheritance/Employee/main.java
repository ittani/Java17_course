package org.example.Inheritance.Employee;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Position position = new Position("Thompho-Muthenga",976552l,453767.67,"Jr.Software-Engineer");

        System.out.println("\nThe information regarding the employee\n");
        System.out.println("Name: " + position.getName() + "\n" + "employee-Id: " + position.getId()
        + "\n" + "Salary R" + position.getSalary() + "\n"
        + "Employee-position: " + position.getPos());

        System.out.println("\n--------------------------------------------------------\n");

        System.out.println("\nPlease enter the date of your birth (dd/MM/yyyy)");
        String birth = scanner.next();

        try {
            int age = getAge(birth);
            System.out.println("\nYou are " + age + " years old");
        } catch (DateTimeParseException e) {
            System.out.println("\nInvalid date format. Please use dd/MM/yyyy.");
        }
    }

    public static int getAge(String birth) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthDate = LocalDate.parse(birth, formatter);
        LocalDate currentDate = LocalDate.now();

        return currentDate.getYear() - birthDate.getYear() -
                (currentDate.getDayOfYear() < birthDate.getDayOfYear() ? 1 : 0);
    }
}
