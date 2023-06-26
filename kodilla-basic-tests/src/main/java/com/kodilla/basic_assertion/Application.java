package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        int subtractResult = calculator.subtract(a, b);
        int powResult = calculator.pow(a);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        boolean testPow = ResultChecker.assertEquals(25, powResult);
        boolean testSubtract = ResultChecker.assertEquals(-3, subtractResult);

        if (testPow) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum NIE działa poprawnie dla liczb " + a + " i " + b);
        }

        if (testPow) {
            System.out.println("Metoda pow działa poprawnie dla liczby " + a);
        } else {
            System.out.println("Metoda pow NIE działa poprawnie dla liczby " + a);
        }

        if (testPow) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda subtract NIE działa poprawnie dla liczb " + a + " i " + b);
        }
    }
}
