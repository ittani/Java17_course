package org.example.PracticeQuestions.CarpetCost;

import java.util.Scanner;

public class main {

    public static void main(String args[])
    {
        Scanner val = new Scanner(System.in);
        Floor floor = new Floor(90.7, 44.5);
        Carpet carpet = new Carpet(900);
        Calculator calculator = new Calculator(floor,carpet);

        System.out.println("The carpet cost is + R" + calculator.getTotalCost());
    }
}
