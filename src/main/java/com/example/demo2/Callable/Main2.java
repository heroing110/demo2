package com.example.demo2.Callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main2 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Task task= new Task();
        Future<Long> future = executorService.submit(task);
        executorService.shutdown();
        try {
            System.out.println("主任务进行中");
            Thread.sleep(3000);
            Long num = future.get();
            System.out.println("num"+num);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
