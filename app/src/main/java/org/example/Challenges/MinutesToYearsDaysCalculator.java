package org.example.Challenges;

public class MinutesToYearsDaysCalculator {

    public static void main(String[] args)
    {
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes)
    {
        if(minutes <= 0)
        {
            System.out.println("Invalid Value");
        }
        else if ( minutes > 0)
        {
            long hour = minutes / 60;
            long Day = hour / 24;
            long year = Day / 365;

            System.out.println("Minutes:" + minutes +
                    "\nDay:" + Day +
                    "\nYear:" + year);
        }
    }
}
