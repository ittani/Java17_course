package org.example.PracticeQuestions.Area;

import java.util.Scanner;

public class main {
    public static void main(String args[])
    {
        Wall wall = new Wall();
        Scanner val = new Scanner(System.in);

        System.out.println("Please type the width of the wall below");
        double width =val.nextDouble();
       wall.setWidth(width);
        System.out.println("Please type the height of the wall below");
        double height= val.nextDouble();
        wall.setHeight(height);

        double totalArea = wall.getArea();

        System.out.println("Total Area = " + totalArea +"m^2");

        val.close();
    }
}
