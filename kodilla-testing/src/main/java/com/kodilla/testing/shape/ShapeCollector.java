package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ShapeCollector {

    private List<Shape> shapeCollection = new ArrayList<>();

    public void addFigure(Shape shape) {
        shapeCollection.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        return shapeCollection.remove(shape);
    }

    public Shape getFigure(int n) {
        return shapeCollection.get(n);
    }

    public void showFigures() {
        System.out.println(shapeCollection);
    }
}