package com.kodilla.abstracts.homework;

public class Accountant extends Job {
    public Accountant() {
        super(5000, "analyse financial");
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
