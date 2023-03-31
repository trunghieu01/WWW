package org.example;

import lombok.*;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Getter
@Component(value = "c")
public class RickClass extends Class{

    public RickClass(String name) {
        super(name);
    }

    public void info(){
        System.out.println("Class for rick-kid");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
