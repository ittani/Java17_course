package org.example.Array;


import java.util.Scanner;
import java.util.stream.IntStream;

public class MinimumElement {

    public static void main(String[] args)
    {
        findMin(readElements(readInteger()));
    }

    public static int readInteger()
    {
        System.out.println("How many do you elements do you want to enter?\n");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        return x;
    }

    public static int[] readElements(int input)
    {
        Scanner scanner = new Scanner(System.in);
        int[] inputUser = new int[input];

        System.out.println("Please enter your elements: \n");
     for(int y=0; y< inputUser.length;y++)
     {
         inputUser[y] = scanner.nextInt();
     }
        return inputUser;
    }

    public static int findMin(int[] mini)
    {

       int minimum = IntStream.of(mini).min().getAsInt();
        System.out.println("The minimum value is \n" + minimum);
       return  minimum;
    }
}
