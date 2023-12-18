package com.example.kodillagoodpatterns.flights;

public class Application {
    public static void main(String[] args) {

        FlightRegister flightRegister = FlightDirections.find();

        FlightSearchEngine flightSearchEngine = new FlightSearchEngine(flightRegister.getFlightsSet());
        flightSearchEngine.searchFlightsByArrivalAirport("Warszawa");
        flightSearchEngine.searchFlightsByDepartureAirport("Wroclaw");
        flightSearchEngine.searchFlightsByTransferCity("Gdansk", "Katowice", "Warszawa");
    }
}
