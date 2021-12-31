package com.kodilla.kodillagoodpatterns.challanges.amazon;

public class InformationService {
    public void inform(UserDto user) {
        String mailMessage = "Your order is proccesing";
        System.out.println("Sending mail to user e-mail:" + " " + user.getMailAddress() + "with content" + " " + mailMessage);
    }
}
