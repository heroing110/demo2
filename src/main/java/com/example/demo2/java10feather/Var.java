package com.example.demo2.java10feather;

import java.util.List;

public class Var {
    public static void main(String[] args) {
        var list = List.of("1","2","3");
        list.forEach(System.out::println);
    }
}
