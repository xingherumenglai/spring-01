package com.qf.spring;

import com.qf.spring.bean.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        String path = "classpath:spring-context.xml";
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(path);
//        Object user1 = applicationContext.getBean("user");
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user.toString());
    }
}
