package com.kodilla.abstracts.homework;

public class Circle extends Shape{
    private final double PI = 3.14;
    double radious = getBaseOfFigure()/2;
    public Circle(int baseOfFigure) {
        super(baseOfFigure);
    }


    public double area() {
        return PI * radious * radious;
    }

    @Override
    public double circuit() {
        return 2*PI*radious;
    }
}
