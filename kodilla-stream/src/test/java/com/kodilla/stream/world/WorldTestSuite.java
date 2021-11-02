package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test

    public void testGetPeopleQuantity() {

        World world = new World();

        //Given

        Continent continent1 = new Continent("America");
        Continent continent2 = new Continent("Africa");
        Continent continent3 = new Continent("Europe");
        Continent continent4 = new Continent("Asia");

        Country mexico = new Country("Mexico");
        Country canada = new Country("Canada");

        Country morocco = new Country("Morocco");
        Country kongo = new Country("Kongo");

        Country norway = new Country("Norway");
        Country france = new Country("France");

        Country thailand = new Country("Thailand");
        Country birma = new Country("Brima");

        world.addContinent(continent1);
        world.addContinent(continent2);
        world.addContinent(continent3);
        world.addContinent(continent4);

        continent1.addCountry(mexico);
        continent1.addCountry(canada);

        continent2.addCountry(morocco);
        continent2.addCountry(kongo);

        continent3.addCountry(norway);
        continent3.addCountry(france);

        continent4.addCountry(thailand);
        continent4.addCountry(birma);

        //When

        BigDecimal allOfPeople = world.getPeopleQuantity();

        //Then

        BigDecimal expectedResult = new BigDecimal("8000008");
        assertEquals(expectedResult, allOfPeople);
    }
}

