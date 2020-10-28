package com.qf.spring.config;

import com.qf.spring.bean.Address;
import com.qf.spring.bean.User;
import com.sun.xml.internal.ws.developer.MemberSubmissionEndpointReference;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class DruidConfig {
    @Bean
    public User user(Address address){
        User user = new User();
        user.setUsername("sda");
        user.setAddress(address);
        return user;

    }
    @Bean
    public Address address() {
        return new Address();
    }

}
