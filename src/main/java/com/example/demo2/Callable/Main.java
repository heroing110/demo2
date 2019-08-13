package com.example.demo2.Callable;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        FutureTask<Long> futureTask = new FutureTask<Long>(new Task());
        executorService.submit(futureTask);
        executorService.shutdown();
        try {
            System.out.println("这里主任务在进行...");
            Thread.sleep(3000);
            long num = futureTask.get();
            System.out.println("num:"+num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
