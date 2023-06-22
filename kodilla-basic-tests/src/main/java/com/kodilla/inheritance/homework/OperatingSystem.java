package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int releaseYear;
    public OperatingSystem(int releaseYear){
        this.releaseYear = releaseYear;
    }
    public void turnOn(){
        System.out.println("System released in " + releaseYear + " is ON");
    }
    public void turnOff(){
        System.out.println("System released in " + releaseYear + " is OFF");
    }
    public int getReleaseYear(){
        return releaseYear;
    }
}
