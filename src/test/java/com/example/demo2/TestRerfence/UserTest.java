package com.example.demo2.TestRerfence;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UserTest {
    User user;
    @Before
    public void setUp() throws Exception {
        user = new User();
        user.setName("小明");
        user.setAge(1);
        System.out.println(user);

        User cloneUser = user;
        Child child = new Child();
        child.test();

    }

    @After
    public void tearDown() throws Exception {
        System.out.println(user);
    }

    @Test
    public void update() {
        Options options=new Options();

        options.update(this.user);
    }
}