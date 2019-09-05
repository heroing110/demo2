package com.example.demo2.algorithm;

import java.util.Arrays;
import java.util.List;

public class MaoPao {
    public static void main(String[] args) {
        List<Integer> list = List.of(4, 2, 1, 5, 3, 6, 7, 9, 0, 8);
        //4,2,1,5
        //2,4,1,5
        //2,1,4,5
        Integer[] ints =new Integer[list.size()];
        Integer[] array = list.toArray(ints);
        for (int i = 0; i < array.length; i++) {
            Integer current = array[0];
            for (int j = 1; j < array.length-i; j++) {
                Integer next = array[j];
                if (current>next) {
                    array[j-1] = next;
                    array[j] = current;
                }
                current = array[j];
                System.out.println(Arrays.toString(array));

            }
        }
    }
}
