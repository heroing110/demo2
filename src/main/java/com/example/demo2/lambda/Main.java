package com.example.demo2.lambda;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        int[] array = {1,2,3,4};
        test.test(array,(int[] target)->{
            System.out.println(Arrays.toString(target));
        });

        test.add(1,2,(a,b)->a+b);
    }
}
