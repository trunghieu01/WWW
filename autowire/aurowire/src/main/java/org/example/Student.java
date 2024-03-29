package org.example;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Getter
@NoArgsConstructor
@Setter
@Component
public class Student {
    private String name;
    private int age;
    @Autowired
//    @Qualifier(value = "c")
    private Class myClass;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", myClass=" + myClass +
                '}';
    }
}
