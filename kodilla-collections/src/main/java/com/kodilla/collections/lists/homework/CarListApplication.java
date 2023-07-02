package com.kodilla.collections.lists.homework;
import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.BMW;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Ford;

import java.util.ArrayList;

public class CarListApplication {
    public static void main(String[] args) {
        ArrayList<Car> carCollection = new ArrayList<>();
        carCollection.add(new BMW());
        carCollection.add(new Ford());
        carCollection.add(new Opel());
        Car BMW = new BMW();
        carCollection.add(BMW);

        System.out.println("size: " + carCollection.size());
        for(Car car : carCollection){
            CarUtils.describeCar(car);
        }

        //Usuwanie za pomoca indeksu
        carCollection.remove(1);
        System.out.println("--------Removed by index--------" );
        System.out.println("size: " + carCollection.size());
        for(Car car : carCollection){
            CarUtils.describeCar(car);
        }

        //Usuwanie za pomoca obiektu
        carCollection.remove(BMW);
        System.out.println("--------Removed by object--------");
        System.out.println("size: " + carCollection.size());
        for(Car car : carCollection){
            CarUtils.describeCar(car);
        }
    }
}
