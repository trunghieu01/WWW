package org.example;

import org.springframework.stereotype.Component;

@Component
public class Triangle implements Shape{
    private float a,b,c;

    @Override
    public Double getArea() {
        return (double) a+b+c;
    }

    @Override
    public Double getPerimeter() {
        return Math.sqrt(getArea()*(getArea()-a)*(getArea()-b)*(getArea()-c));
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public float getC() {
        return c;
    }

    public void setA(float a) {
        this.a = a;
    }

    public void setB(float b) {
        this.b = b;
    }

    public void setC(float c) {
        this.c = c;
    }

    public Triangle() {
        this(0.0F, 0.0F, 0.0F);
    }

    public Triangle(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "\na=" + a +
                ", b=" + b +
                ", c=" + c +
                "\nChu vi:" + getArea() +
                "\nDien tich:" + getPerimeter() +
                "\n}";
    }
}
