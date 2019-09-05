package com.example.demo2.TestRerfence;

import java.io.Serializable;

public class Options implements Serializable {

    private static final long serialVersionUID = 5999375638017972457L;

    public User update(User user){
        user.setName("哈哈哈");
        return user;
    }

    public static void main(String[] args) {
        User user = new User();
    }
}
