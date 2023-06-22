package com.kodilla.inheritance.homework;

public class StartingSystem {
    public static void main(String[] args) {
        OperatingSystem win11 = new OperatingSystem(2021);
        System.out.println("This system is realesed in " + win11.getReleaseYear());
        win11.turnOn();
        win11.turnOff();

        OperatingSystem win10 = new OperatingSystem(2015);
        System.out.println("This system is realesed in " + win10.getReleaseYear());
        win10.turnOn();
        win10.turnOff();

        Win11 eleventh = new Win11(2021);
        eleventh.turnOn();
        eleventh.turnOff();

        Win10 tenth = new Win10(2015);
        tenth.turnOn();
        tenth.turnOff();
    }
}
