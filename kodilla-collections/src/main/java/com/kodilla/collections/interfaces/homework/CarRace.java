package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        System.out.println("--BMW--");
        Car bmw = new BMW();
        doRace(bmw);
        System.out.println("--Ford--");
        Car ford = new Ford();
        doRace(ford);
        System.out.println("--Opel--");
        Car opel = new Opel();
        doRace(opel);

    }
    public static void doRace(Car car){
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();

        car.decreaseSpeed();
        car.decreaseSpeed();

        System.out.println(car.getSpeed() + " km/h");
    }
}
