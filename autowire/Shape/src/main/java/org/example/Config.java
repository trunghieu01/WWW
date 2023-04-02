package org.example;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScans(
        @ComponentScan("org.example")
)
public class Config {

    @Bean
    @Primary
    public Rectangle r1() {
        return new Rectangle(7F, 8F);
    }

    @Bean
    public Circle c1() {
        return new Circle(10F);
    }

    @Bean
    public Triangle t1() {
        return new Triangle(3.1F, 4.2F, 5.3F);
    }

    @Bean
    public SquareTrapezoid st() {
        return new SquareTrapezoid();
    }
}
