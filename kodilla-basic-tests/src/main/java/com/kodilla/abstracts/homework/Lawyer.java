package com.kodilla.abstracts.homework;

public class Lawyer extends Job {
    public Lawyer() {
        super(15000, "conduct lawsuits");
    }
    @Override
    public int getSalary() {
        return salary;
    }
    @Override
    public String getResponsibility() {
        return responsibility;
    }
}
