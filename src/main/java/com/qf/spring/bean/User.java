package com.qf.spring.bean;

import lombok.*;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class User {
    private String username;
    private String password;
    private Address address;
    private List<Integer> list;
    private Map<String, String> map;
//
//    public User(String username, String password) {
//        this.username = username;
//        this.password = password;
//    }

    // 初始化方法是构造方法执行完成之后自动执行的第一个方法
    public void init() {
        this.username = "hello";
        System.out.println("init");
    }

    public void destroy() {
        this.username = null;
        System.out.println("对象即将被回收!!!");
    }


    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }


    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }
}
