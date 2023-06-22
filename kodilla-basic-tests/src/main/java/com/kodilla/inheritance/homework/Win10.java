package com.kodilla.inheritance.homework;

public class Win10 extends OperatingSystem{
    public Win10(int releaseYear) {
        super(releaseYear);
    }

    @Override
    public void turnOn() {
        System.out.println("Windows 10 is turning ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Windows 10 is turning OFF");
    }
}
