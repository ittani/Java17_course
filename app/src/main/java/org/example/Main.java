/*
 * Basic java lessons
 */
package org.example;


import java.util.Scanner;

public class Main {


    public static void main(String args[])
    {
        Scanner all = new Scanner(System.in);
      System.out.println("Hi, welcom to the java Engineering world! :");

      statement();

        System.out.println("\n who's your favourite person at home?");
        String name = all.next();
        getName(name);
    }


    public static void statement()
    {
        Scanner val = new Scanner(System.in);

        int x;

        System.out.println("Please enter any value between 1,2 and 3.");
        x = val.nextInt();

        if (x == 1) {
            System.out.println("The values entered is: " + x);
        } else if (x == 2) {

            System.out.println("The values entered is: " + x);
        } else if (x == 3) {

            System.out.println("The values entered is: " + x);
        } else {
            System.out.println("you have entered an incorrect value!");
        }
    }

    public static void getName(String name)
    {
        switch(name)
        {
            case "ittani":
                System.out.println("Best software engineer");

            case "moddah":
                System.out.println("Best mechanical engineer");

            case "bafo":
                System.out.println("Best civil engineer");

            case "thompho":
                System.out.println("Best electrical engineer");

            default:
                System.out.println("You have no clue :) .......");
        }
    }
}
