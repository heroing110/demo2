package com.example.demo2.Callable;

import java.util.concurrent.Callable;

public class Task implements Callable {
    @Override
    public Object call() throws Exception {
        long j=0;
        System.out.println("子任务正在处理...");
        for (int i = 0; i < 10000; i++) {
            j+=i;
        }
        return j;
    }
}
