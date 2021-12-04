package com.kodilla.exception.test;

import com.kodilla.exception.SecondChallange;

public class ExceptionHandling {

    public static void main(String[] args)  {

        SecondChallange secondChallange = new SecondChallange();

        try {
          String result = secondChallange.probablyWillThrowException(2, 1);
          System.out.println(result);
        } catch (Exception e) {
            System.out.println("Error occured" + "" + e);
        } finally {
            System.out.println("Throw/throws excercises");
        }

    }
}
