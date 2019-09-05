package com.example.demo2.consumer;

import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        ConsumerTest consumerTest = new ConsumerTest();
        consumerTest.arithmetic(8, 9, System.out::println, System.out::println);

        Consumer<String> consumer = s -> System.out.println(s.toUpperCase());
        consumer.accept("hello");

        consumerTest.arithmetic1(4, 9, System.out::println, (a) -> a = a + 2,(b) -> b=b + 3);
        consumerTest.arithmetic1(4, 9, System.out::println, (a) -> System.out.println(a * 2),(b) -> System.out.println(b * 3));
    }

    public void arithmetic(int i, int s, Consumer<Integer> consumer, Consumer<Integer> consumer1) {
        consumer1.accept(i * s);
        consumer.accept(i + s);
    }

    public void arithmetic1(int a, int b, Consumer<Integer> consumer, Consumer<Integer> consumer1,Consumer<Integer> consumer2) {
        consumer.andThen(consumer1).andThen(consumer2).accept(a + b);
    }
}
