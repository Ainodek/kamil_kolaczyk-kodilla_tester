package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {
    private int heightOfFigure;
    public Rectangle(int heightOfFigure,int baseOfFigure) {
        super(baseOfFigure);
        this.heightOfFigure = heightOfFigure;
    }
    public int getHeightOfFigure(){
        return heightOfFigure;
    }
    @Override
    public double area() {
        return getBaseOfFigure() * getHeightOfFigure();
    }

    @Override
    public double circuit() {
        return (2*getBaseOfFigure()) + (2*getHeightOfFigure());
    }
}
