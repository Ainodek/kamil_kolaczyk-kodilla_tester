package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class FlightFinder {

    public static List<Flight> findFlightsTo(String departure) {
        List<Flight> departures = new ArrayList<>();
        for(Flight list : FlightRepository.getFlightTable()){
            if(list.getDeparture().toString().equals(departure))
                departures.add(list);
            }
            return departures;
   }

    public static List<Flight> findFlightsFrom(String arrival) {
        List<Flight> arrivals = new ArrayList<>();
        for (Flight list : FlightRepository.getFlightTable()) {
            if (list.getArrival().toString().equals(arrival))
                arrivals.add(list);
        }
        return arrivals;
    }

    public static void main(String[] args) {
        System.out.println(findFlightsFrom("Warsaw"));
        System.out.println(findFlightsTo("Warsaw"));
    }
    public static String getDepartures(Flight flight) {
        return flight.getDeparture();
    }
    public static String getArrivals(Flight flight){
        return flight.getArrival();
    }

}
