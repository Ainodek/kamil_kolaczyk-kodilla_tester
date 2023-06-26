package com.kodilla.abstracts.homework;
public class Person {
    String firstName;
    int age;
    String job;
    public Person(String firstName, int age, String job) {
        this.job = job;
        this.age = age;
        this.firstName = firstName;
    }

    static Job programist = new Programist();
    static Job accountant = new Accountant();
    static Job lawyer = new Lawyer();
    static Person kamil = new Person("Kamil", 30, programist.getResponsibility());
    static Person anna = new Person("Anna", 35, accountant.getResponsibility());
    static Person mariusz = new Person("Mariusz", 40, lawyer.getResponsibility());

    public String personResp(){
        return firstName + " is reponsibility for " + job;
    }

    public static void main(String[] args) {
        System.out.println(kamil.personResp());
        System.out.println(anna.personResp());
        System.out.println(mariusz.personResp());
    }
}
