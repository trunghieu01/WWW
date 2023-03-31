package org.example1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value = "style")
public class Sexy implements Style{
    @Override
    public void wear() {
        System.out.println("Đang không mặc gì");
    }
}
