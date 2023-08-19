package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTest {
    @Test
    public void numberOfArrivals(){
        //before
        List<Flight> actual = FlightFinder.findFlightsFrom("Warsaw");

        assertEquals(2, actual.size());
    }
    @Test
    public void isArrivalFromViennaExist(){
        List<Flight> actual = FlightFinder.findFlightsFrom("Vienna");

        assertEquals(0, actual.size());
    }
    @Test
    public void isArrivalFromMoscowExist(){
        List<Flight> actual = FlightFinder.findFlightsFrom("Moscow");

        assertEquals(2, actual.size());
    }
    @Test
    public void numberOfDepartures(){
        //before
        List<Flight> actual = FlightFinder.findFlightsTo("Warsaw");

        assertEquals(1, actual.size());
    }
    @Test
    public void isDepartureToVeinnaExist(){
        List<Flight> actual = FlightFinder.findFlightsTo("Vienna");

        assertEquals(0, actual.size());
    }
    @Test
    public void isDepartureToWarsawExist(){
        List<Flight> actual = FlightFinder.findFlightsTo("Warsaw");

        assertEquals(1, actual.size());
    }

}