package com.example.kodillagoodpatterns.flights;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class FlightRegister {
  private Set<Flight> flightsSet = new HashSet<>();

    public Set<Flight> getFlightsSet() {
        return flightsSet;
    }
}
