package com.kodilla.abstracts.homework;

public class Programist extends Job{
    public Programist() {
        super(10000, "develope software");
    }
    @Override
    public String getResponsibility() {
        return responsibility;
    }
    @Override
    public int getSalary() {
        return salary;
    }
}
