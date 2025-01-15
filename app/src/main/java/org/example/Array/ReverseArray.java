package org.example.Array;

import java.util.Scanner;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many elements do you want to add?");
        int input = scanner.nextInt();

        if (input <= 0) {
            System.out.println("The number of elements must be greater than zero.");
            return;
        }

        int[] reverse = new int[input];

        for (int i = 0; i < reverse.length; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            reverse[i] = scanner.nextInt();
        }

        scanner.close();

        System.out.println("The reverse array list will be:");
        for (int i = reverse.length - 1; i >= 0; --i) {
            System.out.println(reverse[i]);
        }
    }
}
