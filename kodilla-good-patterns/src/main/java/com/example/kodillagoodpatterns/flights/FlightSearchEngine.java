package com.example.kodillagoodpatterns.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightSearchEngine {

    private final Set<Flight> flightsSet;

    public FlightSearchEngine(Set<Flight> flightsSet) {
        this.flightsSet = flightsSet;
    }

    public void searchFlightsByDepartureAirport(String departureAirport) {
        flightsSet.stream()
                .filter(f -> f.getDepartureAirport().equals(departureAirport))
                .forEach(System.out::println);
    }

    public void searchFlightsByArrivalAirport(String arrivalAirport) {
        flightsSet.stream()
                .filter(f -> f.getArrivalAirport().equals(arrivalAirport))
                .forEach(System.out::println);
    }

    public void searchFlightsByTransferCity(String departureAirport, String transferAirport, String arrivalAirport) {
        List<Flight> firstSegment = flightsSet.stream()
                .filter(f -> f.getDepartureAirport().equals(departureAirport) && f.getArrivalAirport().equals(transferAirport))
                .toList();
        List<Flight> secondSegment = flightsSet.stream()
                .filter(f -> f.getDepartureAirport().equals(transferAirport) && f.getArrivalAirport().equals(arrivalAirport))
                .toList();
        List<Flight> result = new ArrayList<>();
        result.addAll(firstSegment);
        result.addAll(secondSegment);
        result.forEach(System.out::println);
    }
}
