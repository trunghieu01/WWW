package org.example;

import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape{
    private float d;
    @Override
    public Double getArea() {
        return d*3.14;
    }

    @Override
    public Double getPerimeter() {
        return (d*d/4)*3.14;
    }

    public float getD() {
        return d;
    }

    public void setD(float d) {
        this.d = d;
    }

    public Circle() {
        this(0.0F);
    }

    public Circle(float d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "d=" + d +
                "Chu vi:" + getArea() +
                "Dien tich:" + getPerimeter() +
                '}';
    }
}
