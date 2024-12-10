package org.example.StringMethods;

import java.util.Scanner;

public class MainPerson {

    public static void main(String args[])
    {
        print();
    }

    public static void printPerson()
    {
        Person person = new Person("Jack",25);
        System.out.println("\nPersonal information \n1)Name : " + person.getName() + "\n2)Age: " + person.getAge() + " years old");
        System.out.println("Current Time: " + person.getDateBirth());
    }

    public static void printEmployemnet()
    {
      Employemnet employemnet = new Employemnet(11546.78,"Pretoria","Falcorp-Technologies",27);
        System.out.println("\nEmployment Contract");
        System.out.println("Company name: " + employemnet.getName() + "\nCompany's contribution R" + employemnet.getSalary() +
                "\nlocation " + employemnet.getLocation());
      System.out.println(employemnet.toString());
    }

    public static void print()
    {
        Scanner scanner = new Scanner(System.in);
        String name, pass;
        System.out.println("Please enter your login creds");
        name=scanner.next();
        pass=scanner.next();

       if(!name.equals("ittani"))
       {
           System.out.println("\nIncorrect Credentials, please try again or reach out to the support team");
       }
       else
       {
           System.out.println("\nHi " + name + "\nWelcome to the Online System.");
           printPerson();
           printEmployemnet();
       }
    }
}
