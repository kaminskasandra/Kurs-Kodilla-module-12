package com.example.kodillagoodpatterns.flights;

public class FlightDirections {

    public static FlightRegister find() {
        Flight flight1 = new Flight("Wroclaw", "Warszawa");
        Flight flight2 = new Flight("Wroclaw", "Krakow");
        Flight flight3 = new Flight("Wroclaw", "Gdansk");
        Flight flight4 = new Flight("Warszawa", "Lublin");
        Flight flight5 = new Flight("Gdansk", "Lublin");
        Flight flight6 = new Flight("Poznan", "Gdansk");
        Flight flight7 = new Flight("Katowice", "Warszawa");
        Flight flight8 = new Flight("Katowice", "Poznań");
        Flight flight9 = new Flight("Gdansk", "Katowice");
        Flight flight10 = new Flight("Warszawa", "Poznan");

        FlightRegister flightRegister = new FlightRegister();
        flightRegister.getFlightsSet().add(flight1);
        flightRegister.getFlightsSet().add(flight2);
        flightRegister.getFlightsSet().add(flight3);
        flightRegister.getFlightsSet().add(flight4);
        flightRegister.getFlightsSet().add(flight5);
        flightRegister.getFlightsSet().add(flight6);
        flightRegister.getFlightsSet().add(flight7);
        flightRegister.getFlightsSet().add(flight8);
        flightRegister.getFlightsSet().add(flight9);
        flightRegister.getFlightsSet().add(flight10);

        return flightRegister;

    }
}
