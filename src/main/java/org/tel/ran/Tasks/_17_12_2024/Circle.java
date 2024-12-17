package org.tel.ran.Tasks._17_12_2024;

public class Circle extends Figure {
    private int radius;

    public Circle(int width) {
        super(width);
        radius = width/2;
        this.setArea(Math.PI * radius * radius);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
