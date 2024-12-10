package org.example.Inheritance.Calculation;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Which operation do you want to perform? (a: Addition, s: Subtraction):");
        String operation = scanner.next().toLowerCase();

        int x, y;
        System.out.println("Enter your first value:");
        x = scanner.nextInt();
        System.out.println("Enter your second value:");
        y = scanner.nextInt();

        switch (operation) {
            case "a":
                System.out.println("Result: " + calculator.add(x, y));
                break;
            case "s":
                System.out.println("Result: " + calculator.sub(x, y));
                break;
            default:
                System.out.println("Invalid operation. Please enter 'a' for addition or 's' for subtraction.");
        }

        scanner.close();
    }
}

class Calculator {
    public int add(int x, int y) {
        return x + y;
    }

    public int sub(int x, int y) {
        return x - y;
    }
}
