package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Flight {
    String departure;
    String arrival;

    public Flight() {
    }

    public Flight(String arrival, String departure) {
        this.departure = departure;
        this.arrival = arrival;
    }

    public Flight getDeparture() {
        return new Flight();
    }

    public Flight getArrival() {
        return new Flight();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(departure, flight.departure) && Objects.equals(arrival, flight.arrival);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departure, arrival);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "departure='" + departure + '\'' +
                ", arrival='" + arrival + '\'' +
                '}';
    }
}
