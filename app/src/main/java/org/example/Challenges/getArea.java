package org.example.Challenges;

public class getArea {

        // write code here

        public static void main(String[] args)
        {
//            area(90);
//            area(-5);
            area(-10,7);
        }
    public static double area(double radius)
    {

        double results;

        if (radius < 0)
        {
            results = -1.0;
        }
        else
        {
            results = radius*radius * 3.14;
        }
        //      System.out.println(results);
        return results;

    }

    public static double area(double x, double y)
    {
        double results;

        if(x < 0 || y < 0)
        {
            results = -1.0;
        }
        else
        {
            results = x * y;
        }

            System.out.println(results);
        return results;
    }

    }

