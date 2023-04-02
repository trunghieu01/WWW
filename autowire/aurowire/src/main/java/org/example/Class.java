package org.example;

import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Class{
    private String name;

    abstract void info();
    @Override
    public String toString() {
        return "Class{" +
                "name='" + name + '\'' +
                '}';
    }
}
