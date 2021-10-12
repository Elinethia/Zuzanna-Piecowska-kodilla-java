package com.kodilla.testing.weather.mock;


import java.util.*;


public class WeatherForecast {

    private Temperatures temperatures;

    public WeatherForecast(Temperatures temp) {
        temperatures = temp;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {

            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double calculateAverage() {

        double sum = 0.0;

        for (Map.Entry<String, Double> temp : temperatures.getTemperatures().entrySet()) {

            sum += temp.getValue();
        }

        double avg = sum / temperatures.getTemperatures().size();

        return avg;

    }

    public double calculateMedian() {

        List<Double> temperaturesList = new ArrayList<>();

        for (Map.Entry<String, Double> temp : temperatures.getTemperatures().entrySet()) {

            temperaturesList.add(temp.getValue());
        }

        Collections.sort(temperaturesList);

        if (temperaturesList.size() % 2 != 0) {
            return temperaturesList.get(temperaturesList.size() / 2);
        }else{
            double a = temperaturesList.get(temperaturesList.size() / 2);
            double b = temperaturesList.get((temperaturesList.size() / 2)-1);

            return (a + b / 2);
        }
    }

}



