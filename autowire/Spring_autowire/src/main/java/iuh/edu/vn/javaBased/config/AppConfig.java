package iuh.edu.vn.javaBased.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScans({
        @ComponentScan(basePackages = "iuh.edu.vn.javaBased"),
})
public class AppConfig {
    //    @Bean
//    public User createUser1(){
//        User user =new User("teo","123");
//        return user;
//    }
    @Bean
    public User createUser2() {
        User User = new User("met", "321");
        return User;
    }
}
