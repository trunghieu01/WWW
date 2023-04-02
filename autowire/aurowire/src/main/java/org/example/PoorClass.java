package org.example;

import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@Component(value = "c1")
public class PoorClass extends Class{

    public PoorClass(String name) {
        super(name);
    }

    public void info(){
        System.out.println("Class for poor-kid");
    }
}
