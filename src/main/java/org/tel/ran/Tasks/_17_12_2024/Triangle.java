package org.tel.ran.Tasks._17_12_2024;

public class Triangle extends Figure {
    private int side2;
    private int side3;
    private int height;

    public Triangle(int width, int height) {
        super(width);
        this.height = height;
        this.setArea((super.getWidth() * this.height) / 2.0);
    }

    public Triangle(int side1, int side2, int side3) {
        super(side1);
        this.side2 = side2;
        this.side3 = side3;
        int p = (side1 + side2 + side3) / 2;
        this.setArea(Math.sqrt(p * (p - side1) * (p - side2) * (p - side3)));
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public int getSide3() {
        return side3;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
