package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape {

   public static final String name = "Circle";
   double lengthR;

   public Circle(double lengthR) {
       this.lengthR = lengthR;
   }

    public String getShapeName() {
        return name;

    }

    public double getField()  {
       return Math.PI * Math.pow(lengthR, 2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.lengthR, lengthR) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lengthR);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "lengthR=" + lengthR +
                '}';
    }
}
