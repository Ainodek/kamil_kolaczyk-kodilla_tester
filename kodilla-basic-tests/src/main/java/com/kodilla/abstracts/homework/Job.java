package com.kodilla.abstracts.homework;

public abstract class Job {
    int salary;
    String responsibility;

    public Job(int salary, String responsibility){
        this.responsibility = responsibility;
        this.salary = salary;
    }
    public abstract String getResponsibility();
    public abstract int getSalary();

}
