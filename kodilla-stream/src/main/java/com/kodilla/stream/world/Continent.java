package com.kodilla.stream.world;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public final class Continent {

    private final List<Country> countryList = new ArrayList<>();
    private final String continent;

    public Continent(String continent) {
        this.continent = continent;
    }

    public String getContinent() {
        return continent;
    }

    public List<Country> getCountryList() {
        return new ArrayList<>(countryList);
    }

    public boolean addCountry(Country country) {
        return countryList.add(country);
    }
}
