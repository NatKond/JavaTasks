package org.tel.ran.Tasks._17_12_2024;

import java.util.Random;

public class Generator {
    public static Square generateSquare (){
        Random rdn = new Random();
        return new Square(rdn.nextInt(1,100));
    }
    public static Circle generateCircle (){
        Random rdn = new Random();
        return new Circle(rdn.nextInt(1,100));
    }

    public static Triangle generateTriangle(){
        Random rdn = new Random();
        return new Triangle(rdn.nextInt(1,100),rdn.nextInt(1,100));
    }
}
