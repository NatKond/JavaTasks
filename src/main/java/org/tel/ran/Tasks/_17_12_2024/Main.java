package org.tel.ran.Tasks._17_12_2024;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Circle circle = Generator.generateCircle();//new Circle(8);
        System.out.println("circle.getArea() = " + circle.getArea() + ", circle.getRadius() = " + circle.getRadius());

        Square square = Generator.generateSquare();//new Square(5);
        System.out.println("square.getArea() = " + square.getArea() + ", square.getWidth() = " + square.getWidth());

        Triangle triangle = Generator.generateTriangle();//new Triangle(10,5);
        System.out.println("triangle.getArea() = " + triangle.getArea() + ", triangle.getWidth() = " + triangle.getWidth() + ", triangle.getHeight() = " + triangle.getHeight());

        Triangle triangle1 = new Triangle(11,13,9);
        System.out.println("triangle1.getArea() = " + triangle1.getArea());

    }

}
