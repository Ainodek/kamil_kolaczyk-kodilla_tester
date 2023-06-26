package com.kodilla.abstracts.homework;

public abstract class Shape {
    private int baseOfFigure;
    private int area;
    private int circuit;
    public Shape(int baseOfFigure){
        this.baseOfFigure = baseOfFigure;
    }

    public abstract double area();
    public abstract double circuit();


    public int getBaseOfFigure() {
        return baseOfFigure;
    }
}
