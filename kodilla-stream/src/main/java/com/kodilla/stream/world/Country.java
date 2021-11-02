package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public final class Country {

    private final String country;
    private final BigDecimal peopleQuantity;

    public Country(String country, BigDecimal peopleQuantity) {
        this.country = country;
        this.peopleQuantity = peopleQuantity;
    }

    public Country(final String countryName) {
        this(countryName, new BigDecimal("1000001"));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country1 = (Country) o;
        return Objects.equals(country, country1.country) && Objects.equals(peopleQuantity, country1.peopleQuantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, peopleQuantity);
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;

    }

}
