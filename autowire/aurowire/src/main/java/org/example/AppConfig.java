package org.example;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.example")
public class AppConfig {

    @Bean
    @Primary
    public Class c(){
        return new RickClass("in the sky");
    }

    @Bean
    public Class c1(){
        return new PoorClass("on the ground");
    }

    @Bean
    public Student s(){
        return new Student("Hiếu", 20);
    }
}
