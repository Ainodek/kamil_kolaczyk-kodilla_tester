package com.kodilla.collections.interfaces.homework;

import java.util.Random;

public interface Car {
    Random random = new Random();

    public int getHorsePower();
    public int getYearProduction();
    public int getMaxSpeed();
    public int getSpeed();

    public void increaseSpeed();

    public void decreaseSpeed();

}
