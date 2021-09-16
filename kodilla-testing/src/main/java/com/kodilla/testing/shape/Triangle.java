package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {

    public static final String name = "Triangle";
    public double lengthA;
    public double lengthH;

    public Triangle(double lengthA, double lengthH) {
        this.lengthA = lengthA;
        this.lengthH = lengthH;
    }

    public String getShapeName() {
        return name;
}

    public double getField() {
        return lengthA * lengthH / 2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.lengthA, lengthA) == 0 && Double.compare(triangle.lengthH, lengthH) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lengthA, lengthH);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "lengthA=" + lengthA +
                ", lengthH=" + lengthH +
                '}';
    }
}
