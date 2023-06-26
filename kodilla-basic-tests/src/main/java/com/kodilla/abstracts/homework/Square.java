package com.kodilla.abstracts.homework;

public class Square extends Shape {
    public Square(int baseOfFigure) {
        super(baseOfFigure);
    }

    @Override
    public double area() {
        return getBaseOfFigure()*getBaseOfFigure();
    }

    @Override
    public double circuit() {
        return 4*getBaseOfFigure();
    }
}
