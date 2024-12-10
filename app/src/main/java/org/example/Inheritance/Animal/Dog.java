package org.example.Inheritance.Animal;

public class Dog extends Animal {

    private String eyeColor;
    private int age;

    public Dog(String eyeColor, int age, String type, String Speed, String country)
    {
        super("Dog","40m/s","South_Africa");
        this.eyeColor=eyeColor;
        this.age=age;
    }
public Dog()
{
    super("Dog","20m/s","Brazil");
}
    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "eyeColor='" + eyeColor + '\'' +
                ", age=" + age +
                '}' + super.toString();
    }

    public void bark()
    {
        System.out.println("woof!");
    }

    public void run()
    {
        System.out.println("Run!");
    }
}
