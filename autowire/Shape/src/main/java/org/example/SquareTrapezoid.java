package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class SquareTrapezoid {
    @Autowired
    private Triangle triangle;
    @Autowired
    private Rectangle rectangle;

    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }

    public void setRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public SquareTrapezoid() {
    }

    public SquareTrapezoid(Triangle triangle, Rectangle rectangle) {
        this.triangle = triangle;
        this.rectangle = rectangle;
    }

    @Override
    public String toString() {
        return "SquareTrapezoid{" +
                "\ntriangle=" + triangle +
                ", \nrectangle=" + rectangle +
                "\n}";
    }
}
