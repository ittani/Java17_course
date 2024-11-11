/*
 * Basic java lessons
 */
package org.example;

import java.util.Scanner;

public class PrintHello {

    public static void main(String args[])
    {
        Scanner val = new Scanner(System.in);
      System.out.println("Hi, welcom to the java Engineering world! :)");

      int x;

      System.out.println("Please enter any value between 1,2 and 3.");
      x = val.nextInt();

      if (x == 1)
      {
          System.out.println("The values entered is: " + x);
      } else if (x == 2) {

          System.out.println("The values entered is: " + x);
      }
      else if (x == 3) {

          System.out.println("The values entered is: " + x);
      }
      else
      {
          System.out.println("you have entered an incorrect value!");
      }
    }
}
