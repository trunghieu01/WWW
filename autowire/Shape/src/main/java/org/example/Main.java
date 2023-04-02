package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("AppConfig.xml");
        SquareTrapezoid st = (SquareTrapezoid) ctx.getBean("s");
        System.out.println("XmlBean:" + st);

        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        SquareTrapezoid squareTrapezoid = context.getBean(SquareTrapezoid.class);
        System.out.println("AnnotationBean" + squareTrapezoid);
    }
}