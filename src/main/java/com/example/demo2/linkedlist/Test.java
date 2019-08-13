package com.example.demo2.linkedlist;

import java.util.List;

/**
 * @author heying
 */
public class Test {
    public static void main(String[] args) {
        String[] strs={"1","2"};
        List<String> list = List.of(strs);
        System.out.println(list);
        strs=null;
        System.out.println(list);
    }
}
