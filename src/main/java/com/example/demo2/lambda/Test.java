package com.example.demo2.lambda;

public  class Test {
     public  void test(int[] array, IOperate iTest){
         iTest.test(array);
     };

     public void add(int a,int b,IAdd operate){
         System.out.println(operate.add(a, b));
     }
}
