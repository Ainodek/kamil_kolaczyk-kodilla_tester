package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.BMW;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Ford;

import java.util.Random;

public class CarUtils {
    public static Random random = new Random();
    public static void describeCar(Car car){
        System.out.println(" ");
        System.out.println("---NEW CAR---");
        System.out.println("Model: " + getCarName(car));
        System.out.println("Year of production: " + car.getYearProduction());
        System.out.println("Horse Power: " + car.getHorsePower());
        System.out.println("Max speed: " + car.getMaxSpeed());
    }
    public static String getCarName(Car car){
        if(car instanceof BMW) {
            return "BMW";
        }
        else if(car instanceof Opel) {
            return "Opel";
        }
        else if (car instanceof Ford) {
            return "Ford";
        }
        else{
            return "Something wrong!";
        }
    }
}
