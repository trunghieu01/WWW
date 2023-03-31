package org.example1;

import org.springframework.stereotype.Component;

@Component(value = "style1")
public class Pijama implements Style{
    @Override
    public void wear() {
        System.out.println("Đang mặc đồ ngủ");
    }
}
