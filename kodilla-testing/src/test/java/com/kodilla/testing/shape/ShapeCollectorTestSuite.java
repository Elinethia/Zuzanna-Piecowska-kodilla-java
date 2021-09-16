package com.kodilla.testing.shape;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Nested;
import org.springframework.test.context.NestedTestConfiguration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeCollectorTestSuite {


    @DisplayName("Checking method addFigure")

        @Test
        public void addFigure() {

            //Given

            ShapeCollector collector = new ShapeCollector();
            Shape circle = new Circle(5.0);
            Shape square = new Square(4.0);
            Shape triangle = new Triangle(3.0, 7.0);

            //When

            collector.addFigure(circle);
            collector.addFigure(square);
            collector.addFigure(triangle);

            //Then

            assertEquals(circle, collector.getFigure(0));
            assertEquals(square, collector.getFigure(1));
            assertEquals(triangle, collector.getFigure(2));
        }

        @DisplayName("Checking method removeFigure")
        @Test
        public void removeFigure() {

            //Given
            ShapeCollector collector = new ShapeCollector();

            Shape circle = new Circle(5.0);
            Shape square = new Square(4.0);
            Shape triangle = new Triangle(3.0, 7.0);
            collector.addFigure(circle);
            collector.addFigure(square);
            collector.addFigure(triangle);


            //When

            collector.removeFigure(square);

            //Then

            assertEquals(circle, collector.getFigure(0));
            assertEquals(triangle, collector.getFigure(1));

            System.out.println(collector);

        }

        @DisplayName("Checking method getFigure")
        @Test
        public void getFigure() {

            //Given

            ShapeCollector collector = new ShapeCollector();

            Shape circle = new Circle(4);
            Shape square = new Square(5);
            Shape triangle = new Triangle(6, 9);

            collector.addFigure(circle);
            collector.addFigure(square);
            collector.addFigure(triangle);

            //When

            Shape shape = collector.getFigure(1);

            //Then

            assertEquals(square, shape);
            System.out.println(collector);
        }

        @DisplayName("Checking method showFigures")
        @Test
        public void showFigures() {

            //Given
            ShapeCollector collector = new ShapeCollector();

            Shape circle = new Circle(6);
            Shape square = new Square(5);
            Shape triangle = new Triangle(4, 7);

            collector.addFigure(circle);
            collector.addFigure(square);
            collector.addFigure(triangle);

            //When

            collector.showFigures();
            System.out.println(collector);
        }
    }

