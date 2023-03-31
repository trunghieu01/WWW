package iuh.edu.vn.javaBased.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class User {
    private String username;
    private String password;
    private Group group;

    @Autowired
    public User() {
    }

    public User(String username, String password, Group group) {
        this.username = username;
        this.password = password;
        this.group = group;
    }

    public User(Group group) {
        this.group = group;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Group getGroup() {
        return group;
    }

    //    @Autowired
    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", group=" + group +
                '}';
    }
}
