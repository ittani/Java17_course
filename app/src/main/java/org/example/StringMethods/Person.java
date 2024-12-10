package org.example.StringMethods;

import java.util.Date;

public class Person {
    private String name;
    private int age;
    private Date dateBirth;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
       this.dateBirth= new Date();
    }

    public Person()
    {
        this.dateBirth = new Date();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDateBirth() {
        return new Date();
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dateBirth=" + dateBirth +
                '}';
    }
}
