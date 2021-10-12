package com.kodilla.testing.weather.stub;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class WeatherForecastTestSuite {

    @Test
    void testCalculateForecastWithMock() {

        //Given
        Temperatures temperaturesMock = mock(Temperatures.class);
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Warszawa", 26.7);
        temperaturesMap.put("Wrocław", 23.8);
        temperaturesMap.put("Radom", 28.3);
        temperaturesMap.put("Gdańsk", 30.2);
        temperaturesMap.put("Zamość", 27.6);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);

        WeatherForecast forecast = new WeatherForecast(temperaturesMock);

        //When

        int quantityOfSensors = forecast.calculateForecast().size();

        //Then

        Assertions.assertEquals(6, quantityOfSensors);
    }
}
