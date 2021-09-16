package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {

    public static final String name = "Square";
    double lengthA;

    public Square(double lengthA) {
        this.lengthA = lengthA;
    }

    public String getShapeName() {
        return name;
    }

    public double getField() {

       return Math.pow(lengthA, 2);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.lengthA, lengthA) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lengthA);
    }

    @Override
    public String toString() {
        return "Square{" +
                "lengthA=" + lengthA +
                '}';
    }
}
