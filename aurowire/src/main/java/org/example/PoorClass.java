package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Primary;
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

    @Override
    public String toString() {
        return super.toString();
    }
}
