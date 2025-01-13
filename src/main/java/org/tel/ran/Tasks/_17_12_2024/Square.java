package org.tel.ran.Tasks._17_12_2024;

public class Square extends Shape {

    public Square(int width) {
        super(width);
        this.setArea(super.getWidth()*super.getWidth());
    }
}
