package com.kodilla.kodillagoodpatterns.challanges.amazon;

import java.util.Map;
import java.util.Objects;

public class OrderRequest {

    private UserDto user;
    private Map<String, Integer> products;

    public OrderRequest(UserDto user, Map<String, Integer> products) {
        this.user = user;
        this.products = products;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }

    public Map<String, Integer> getProducts() {
        return products;
    }

    public void setProducts(Map<String, Integer> products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderRequest that = (OrderRequest) o;
        return Objects.equals(user, that.user) && Objects.equals(products, that.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, products);
    }
}
