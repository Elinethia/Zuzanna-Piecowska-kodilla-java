package com.kodilla.exception.test;

public class FirstChallange {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    public static void main(String[] args) {
        FirstChallange firstChallange = new FirstChallange();
        double result = 0.0;
        try {
            result = firstChallange.divide(3, 0);
        } catch
            (ArithmeticException e) {
            System.out.println("Exception:" + " " + e);
        } finally {
            System.out.println("Three divided by zero =" + " " + result);
        }
    }
}
