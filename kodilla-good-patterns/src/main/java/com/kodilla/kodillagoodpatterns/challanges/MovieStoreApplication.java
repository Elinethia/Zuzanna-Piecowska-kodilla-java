package com.kodilla.kodillagoodpatterns.challanges;

public class MovieStoreApplication {

    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();

        movieStore.getMovies().entrySet().stream()
                .flatMap(m -> m.getValue().stream())
                .map(m -> m + " " + "!")
                .forEach(System.out::println);

    }
}
