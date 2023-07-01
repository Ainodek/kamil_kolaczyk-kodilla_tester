package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.BMW;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Ford;

import static com.kodilla.collections.arrays.homework.CarUtils.random;

public class CarApplication {
    public static void main(String[] args) {
        Car[] cars = new Car[15];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = makeCar();
        }
        for (Car car : cars) {
            CarUtils.describeCar(car);
        }

    }

    public static Car makeCar() {
        int typeOfCar = random.nextInt(3);
        if (typeOfCar == 0)
            return new BMW();
        else if (typeOfCar == 1)
            return new Ford();
        else {
            return new Opel();
        }
    }
}
