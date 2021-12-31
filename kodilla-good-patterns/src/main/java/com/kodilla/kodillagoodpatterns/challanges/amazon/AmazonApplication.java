package com.kodilla.kodillagoodpatterns.challanges.amazon;

import java.util.HashMap;
import java.util.Map;

public class AmazonApplication {

    public static void main(String[] args) {

        InformationService informationService = new InformationService();
        OrderService orderService = new OrderService();
        OrderRepository orderRepository = new OrderRepository();

        OrderProcessor orderProcessor = new OrderProcessor(informationService, orderService, orderRepository);
        UserDto userDto = new UserDto("John", "zxc@wp.pl", "Johnie 14c/5");
        Map<String, Integer> products = new HashMap<>();
        products.put("Game", 23);
        OrderRequest orderRequest = new OrderRequest(userDto, products);
        OrderDto result  = orderProcessor.process(orderRequest);

        System.out.println(result);

    }
}
