package com.example.demo2.map;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;


public class LinkedHashMapSampleTest {
    @Test
    public void testMap(){
        Map<String, String> map = new HashMap<>();
        map.put("a","nihao");
        map.put("b","nihuai");
        map.put("c","nizai");
        map.put("a","siri");

        map.forEach((k,v)-> System.out.println("k:"+k+"_v:"+v));
    }
}