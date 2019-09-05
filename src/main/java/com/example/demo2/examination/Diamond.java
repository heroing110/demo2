package com.example.demo2.examination;

public class Diamond {
    public static void main(String[] args) {
        //1.上半部分，4行
        for (int i = 1; i <=4 ; i++) {
            //空白，3,2,1
            for (int j = 0; j < 4-i; j++) {
                System.out.print(" ");
            }
            //*,1,3,5,7
            for (int j = 0; j < 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //2.下半部分,3行
        for (int i = 1; i <=3 ; i++) {
            //空白，1,2,3，
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            //*,5,3,1
            for (int j = 1; j <= 2*(3-i+1)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
