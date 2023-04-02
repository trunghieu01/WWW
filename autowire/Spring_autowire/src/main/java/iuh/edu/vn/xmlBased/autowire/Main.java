package iuh.edu.vn.xmlBased.autowire;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx
                = new ClassPathXmlApplicationContext("autowireConfig.xml");
        Department d = ctx.getBean("dept1", Department.class);
//        Department d1 = ctx.getBean("dept2", Department.class);
    
        System.out.println(d + "\n");
    }
}
