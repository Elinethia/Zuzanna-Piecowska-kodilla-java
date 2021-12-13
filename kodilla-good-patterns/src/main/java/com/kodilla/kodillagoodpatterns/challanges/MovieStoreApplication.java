package com.kodilla.kodillagoodpatterns.challanges;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MovieStoreApplication {

    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();

        movieStore.getMovies().entrySet().stream()
                .flatMap(m -> m.getValue().stream())
                .map(m -> m + " " + "!")
                .forEach(System.out::println);

    }
}
