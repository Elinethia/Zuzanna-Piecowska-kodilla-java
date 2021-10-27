package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        Forum forum = new Forum();
        Map<Integer, ForumUser> userMap = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> Period.between(forumUser.getBirthdayDate(), LocalDate.now()).getYears() >= 20)
                .filter(forumUser -> forumUser.getPostQuantity() >= 1)
                .collect(Collectors.toMap(ForumUser::getIdentityNumber, forumUser -> forumUser));

        System.out.println("# elements:" + " " + userMap.entrySet().size());
        userMap.entrySet().stream()
                .map(entry -> entry.getValue() + ":" + entry.getValue())
                .forEach(System.out::println);

        }

    }

