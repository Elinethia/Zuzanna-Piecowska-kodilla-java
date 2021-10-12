package com.kodilla.testing.weather.mock;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class WeatherForecastTestSuite {

    @Mock
    private Temperatures temperaturesMock;

    @BeforeEach
    void setUp() {

        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Warszawa", 26.7);
        temperaturesMap.put("Wrocław", 23.8);
        temperaturesMap.put("Radom", 28.3);
        temperaturesMap.put("Gdańsk", 30.2);
        temperaturesMap.put("Zamość", 27.6);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
    }
    @Test
    void testCalculateForecastWithMock() {

        //Given

        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Warszawa", 26.7);
        temperaturesMap.put("Wrocław", 23.8);
        temperaturesMap.put("Radom", 28.3);
        temperaturesMap.put("Gdańsk", 30.2);
        temperaturesMap.put("Zamość", 27.6);


        WeatherForecast forecast = new WeatherForecast(temperaturesMock);

        //When

        int quantityOfSensors = forecast.calculateForecast().size();

        //Then

        Assertions.assertEquals(5, quantityOfSensors);
        System.out.println(temperaturesMap);
    }


    @Test
    void testAverageCalculateWithMock() {

        //Given

        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Warszawa", 26.7);
        temperaturesMap.put("Wrocław", 23.8);
        temperaturesMap.put("Radom", 28.3);
        temperaturesMap.put("Gdańsk", 30.2);
        temperaturesMap.put("Zamość", 27.6);


        WeatherForecast forecast = new WeatherForecast(temperaturesMock);

        //When

       double averageForecast = forecast.calculateAverage();

        //Then

        Assertions.assertEquals(27.32, averageForecast, 0.001);

    }


    @Test
    void testMedianCalculateWithMock() {

        //Given

        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Warszawa", 26.7);
        temperaturesMap.put("Wrocław", 23.8);
        temperaturesMap.put("Radom", 28.3);
        temperaturesMap.put("Gdańsk", 30.2);
        temperaturesMap.put("Zamość", 27.6);


        WeatherForecast forecast = new WeatherForecast(temperaturesMock);

        //When

        double median = forecast.calculateMedian();

        //Then

        Assertions.assertEquals(27.6, median);

    }

}
