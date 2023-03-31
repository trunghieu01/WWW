package org.example1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =  new AnnotationConfigApplicationContext(Config.class);
        Girl g = context.getBean(Girl.class);
        g.getStyle().wear();
    }
}
