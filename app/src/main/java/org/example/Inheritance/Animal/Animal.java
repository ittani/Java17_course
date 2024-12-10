package org.example.Inheritance.Animal;

public class Animal {
    private String type;
    private String speed;
    private String country;

    public Animal(String type, String speed, String country) {
        this.type = type;
        this.speed = speed;
        this.country = country;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", speed=" + speed +
                ", country='" + country + '\'' +
                '}';
    }

    public void move(String speed)
    {
        System.out.println(speed);
    }
}
