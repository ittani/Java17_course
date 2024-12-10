package org.example.Challenges;

public class Worker {

    private String name;
    private String birthDate;
    private String endDate;

    public int getAge(int born, int year)
    {
        return year-born;
    }
}
