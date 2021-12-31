package com.kodilla.kodillagoodpatterns.challanges.amazon;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class OrderService {
    private Map<String, BigDecimal> productPrice = new HashMap<>();

    public OrderService() {
        productPrice.put("Book", new BigDecimal(35));
        productPrice.put("Game", new BigDecimal(106));
        productPrice.put("Ball", new BigDecimal(13));
        productPrice.put("Dress", new BigDecimal(28));
    }

    public boolean order(UserDto user, Map<String, Integer> products) {

        System.out.println(products);
        boolean isAvailableAllProducts = productPrice.keySet().containsAll(products.keySet());
        if(isAvailableAllProducts) {
            BigDecimal sumAmount = products.entrySet()
                    .stream()
                    .map(entry -> productPrice.get(entry.getKey()).multiply(new BigDecimal(entry.getValue()))) // map(key,value)
                    .reduce(BigDecimal.ZERO, BigDecimal::add); // sumowanie
            System.out.println("Łączna wartość zamówienia to: " + sumAmount + " PLN");
            return true;
        } else {
            return false;
        }



    }
}
