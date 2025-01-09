package org.example.Inheritance.Employee;

public class Position extends Employee{
    private String pos;

    public Position(String name, long Id, double salary, String pos)
    {
        super(name,Id,salary);
        this.pos=pos;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }
}
