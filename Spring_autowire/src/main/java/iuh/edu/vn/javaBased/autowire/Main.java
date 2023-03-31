package iuh.edu.vn.javaBased.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowiringAnnoConfig.xml");
        User u = (User) context.getBean("us1");
        System.out.println(u);
    }
}
