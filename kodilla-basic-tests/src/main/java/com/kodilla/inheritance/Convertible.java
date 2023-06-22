package com.kodilla.inheritance;

public class Convertible extends Car{
    public Convertible(int wheels, int seats){
        super(wheels, seats);
    }
    public void openRoof(){
        System.out.println("Opening roof...");
    }
    public void clodseRoof(){
        System.out.println("Closing roof...");
    }

    @Override
    public void openDoors() {
        System.out.println("Open 2 doors");
    }
}
