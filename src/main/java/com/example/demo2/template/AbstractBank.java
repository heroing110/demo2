package com.example.demo2.template;

public abstract class AbstractBank {
    public String getNum(){
        return "n001";
    }

    public String evaluate(){
        return "good";
    }

    public abstract void business();

    public void process(){
        System.out.println(getNum());
        business();
        System.out.println(evaluate());
    }


}
