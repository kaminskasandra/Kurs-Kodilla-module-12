package com.example.kodillagoodpatterns;

import com.example.kodillagoodpatterns.challenges.MovieStore;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Map;

@SpringBootApplication
public class KodillaGoodPatternsApplication {

    public static void main(String[] args) {
        SpringApplication.run(KodillaGoodPatternsApplication.class, args);
        MovieStore movieStore = new MovieStore();

        movieStore.printTitles(movieStore.getMovies());
    }

}
