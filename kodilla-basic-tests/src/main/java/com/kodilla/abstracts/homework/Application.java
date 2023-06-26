package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,6);
        System.out.println("Area of rectangle: " + rectangle.area());
        System.out.println("Circuit of rectangle: " + rectangle.circuit());
        Square square = new Square(5);
        System.out.println("Area of square: " + square.area());
        System.out.println("Circuit of square: " + square.circuit());
        Circle circle = new Circle(7);
        System.out.println("Area of circle: " + circle.area());
        System.out.println("Circuit of circle: " + circle.circuit());
    }
}
