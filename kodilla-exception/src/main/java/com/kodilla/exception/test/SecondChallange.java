package com.kodilla.exception.test;

import com.kodilla.exception.test.ExceptionHandling;

public class SecondChallange {

    public String probablyWillThrowException(double x, double y) throws Exception {
        if (x >= 2 || x < 1 || y == 1.5) {
            throw new Exception();
        }
        return "Done";
    }
}

