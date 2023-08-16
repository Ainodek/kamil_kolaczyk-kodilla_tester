package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

public class FlightRepository {
    public static List<Flight> getFlightTable() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Warsaw", "Tokio"));
        flights.add(new Flight("Moscow", "Kiev"));
        flights.add(new Flight("Warsaw", "Kiev"));
        flights.add(new Flight("Tokio", "Moscow"));
        flights.add(new Flight("Tokio", "Kiev"));
        flights.add(new Flight("Moscow", "Warsaw"));

        return flights;
    }
}




