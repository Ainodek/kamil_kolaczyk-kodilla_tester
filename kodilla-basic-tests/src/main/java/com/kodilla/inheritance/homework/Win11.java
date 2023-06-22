package com.kodilla.inheritance.homework;

public class Win11 extends OperatingSystem {
    public Win11(int releaseYear) {
        super(releaseYear);
    }
    @Override
    public void turnOn(){
        System.out.println("Windows 11 is turning ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Windows 11 is turning OFF");
    }
}
