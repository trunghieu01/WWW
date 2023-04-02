package org.example;

import org.springframework.stereotype.Component;

@Component
public class Rectangle implements Shape {
    private float a,b;

    @Override
    public Double getArea() {
        return (double) (2*(a+b));
    }

    @Override
    public Double getPerimeter() {
        return (double) (a*b);
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public void setA(float a) {
        this.a = a;
    }

    public void setB(float b) {
        this.b = b;
    }

    public Rectangle() {
        this(0.0F, 0.0F);
    }

    public Rectangle(float a, float b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "\na=" + a +
                ", b=" + b +
                "\nChu vi:" + getArea() +
                "\nDien tich:" + getPerimeter() +
                "\n}";
    }
}
