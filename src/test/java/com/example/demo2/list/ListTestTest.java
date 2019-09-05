package com.example.demo2.list;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ListTestTest {

    @Test
    public void test1(){
        List list = new ArrayList<>();
        list.add("a");
        list.add(1);
        list.add(new Object());
        list.forEach(System.out::println);

    }
}