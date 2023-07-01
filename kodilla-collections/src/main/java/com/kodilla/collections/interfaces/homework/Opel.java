package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {
    int speed = 0;
    int maxSeed = random.nextInt(150, 251);
    int yearOfProduction = random.nextInt(1990, 2024);
    int horsePower = random.nextInt(150, 301);
    @Override
    public int getHorsePower() {
        return horsePower;
    }

    @Override
    public int getYearProduction() {
        return yearOfProduction;
    }

    @Override
    public int getMaxSpeed() {
        return maxSeed;
    }

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
