package com.kodilla.exception;

import com.kodilla.exception.test.ExceptionHandling;

public class SecondChallange {

    public String probablyWillThrowException(double x, double y) throws Exception {
        if (x >= 2 || x < 1 || y == 1.5) {
            throw new Exception();
        }

        SecondChallange secondChallange = new SecondChallange();

        try {
            String result = secondChallange.probablyWillThrowException(2, 1);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Error occured" + "" + e);
            throw e;
        } finally {
            System.out.println("Throw/throws excercises");
        }

        return "Done";
    }
}

