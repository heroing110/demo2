package com.example.demo2.test;

public class Impl implements ITest1,ITest2{
    @Override
    public void test() {

    }

    @FunctionalInterface
    interface Test{
        public void test1(String name);
        static void test2(){
            System.out.println("test2");
        }
        default void test3(){
            System.out.println("test3");
        }
    }

    public static void main(String[] args) {
        Test test = name -> System.out.println(name);
        test.test1("小明");
    }
}
