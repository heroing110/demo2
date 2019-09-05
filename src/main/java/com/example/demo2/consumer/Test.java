package com.example.demo2.consumer;

public class Test {
    public static void main(String[] args) {
        {

            int a;
            a=1;
            System.out.println(a);
        }
        Student student1 = new Student("Ashok", "Kumar", 9.5);

        student1 = PredicateConsumerDemo.updateStudentFee(student1, student -> student.grade > 8.5,
                student -> student.feeDiscount = 30.0);
        student1.printFee();

        assert false :"断言失败";
        System.out.println("断言成功");


    }


}
