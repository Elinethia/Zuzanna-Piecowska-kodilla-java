package com.kodilla.kodillagoodpatterns.challanges.amazon;

public class UserDto {

    private String name;
    private String mailAddress;
    private String homeAddress;

    public UserDto(String name, String mailAddress, String homeAddress) {
        this.name = name;
        this.mailAddress = mailAddress;
        this.homeAddress = homeAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "name='" + name + '\'' +
                ", mailAddress='" + mailAddress + '\'' +
                ", homeAddress='" + homeAddress + '\'' +
                '}';
    }
}
