package com.kodilla.collections.interfaces.homework;

public class BMW implements Car {
    int speed = 0;

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 50;

    }

    @Override
    public void decreaseSpeed() {
        speed -= 30;

    }
}
