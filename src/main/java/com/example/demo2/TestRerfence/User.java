package com.example.demo2.TestRerfence;

public class User{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    protected void test(){
        System.out.println(123);
        int[] as={};
        as.clone();

    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name:"+this.getName()+";age:"+this.getAge();
    }
}
