package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {
    int speed = 0;

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 40;

    }

    @Override
    public void decreaseSpeed() {
        speed -= 20;
    }
}
