package com.example.demo2.string;


import org.junit.Test;

import java.util.List;

public class MainTest {
    @Test
    public void testMove(){
        int i=20;
        System.out.println(i>>>1);
    }

    @Test
    public void testForEach(){
        List<Integer> list = List.of(1, 2);
        list.forEach(x-> System.out.println(x));
    }

    @Test
    public void testStringBuilder(){
        StringBuilder sb = new StringBuilder();
        sb.append("abcde");
        StringBuilder reverse = sb.reverse();
        System.out.println(reverse.toString());
    }

    @Test
    public void testStr(){
        String a = "dddd";
        Object o = a;
        System.out.println(o);
    }

    @Test
    public void testProperties(){
        System.out.println(System.getProperty("file.encoding"));
    }
}