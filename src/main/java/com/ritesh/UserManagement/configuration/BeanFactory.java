package com.ritesh.UserManagement.configuration;

import com.ritesh.UserManagement.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanFactory {

    @Bean
    public List<User> obj(){
        User pre = new User(1, "Ritesh", "ritesh1", "Madhubani", "1236547893");
        List<User> list = new ArrayList<>();
        list.add(pre);
        return list;
    }
}
