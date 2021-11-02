package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {

    private final List<Continent> continentList = new ArrayList<>();

    public boolean addContinent(Continent continent) {

        return continentList.add(continent);
    }

    public BigDecimal getPeopleQuantity() {

        BigDecimal peopleQuantity = continentList.stream()
                .flatMap(continent -> continent.getCountryList().stream())
                .distinct()
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, country) -> sum.add(country));

        return peopleQuantity;
    }
}
