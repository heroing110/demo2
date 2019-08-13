package com.example.demo2.string;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        String a="1";
        String s = new String("1");
        s.intern();
        String s2 = "1";
        System.out.println(s == s2);
        Collections.synchronizedList(new ArrayList<>());
    }
}
