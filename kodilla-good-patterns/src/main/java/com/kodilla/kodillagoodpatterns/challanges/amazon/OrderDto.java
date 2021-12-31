package com.kodilla.kodillagoodpatterns.challanges.amazon;

public class OrderDto {

    private UserDto user;
    private boolean isOrdered;

    public OrderDto(UserDto user, boolean isOrdered) {
        this.user = user;
        this.isOrdered = isOrdered;
    }

    public UserDto getUser() {
        return user;
    }

    public boolean isOrdered() {
        return isOrdered;
    }

    @Override
    public String toString() {
        return "OrderDto{" +
                "user=" + user +
                ", isOrdered=" + isOrdered +
                '}';
    }
}
