package org.example.Array;

public class TypeCasting {

    public static void main(String[] args)
    {
        double x = 78.56;
        int grade = (int) x;
        String value = Double.toString(x);

        System.out.println("String Cast: "+ value);
        System.out.println("Int Cast: " + grade);
    }
}
