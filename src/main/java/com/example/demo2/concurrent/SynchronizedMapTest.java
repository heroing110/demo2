package com.example.demo2.concurrent;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedMapTest {
    public static void main(String[] args) {
        Map<Object, Object> synchronizedMap = Collections.synchronizedMap(new HashMap<>());
    }
}
