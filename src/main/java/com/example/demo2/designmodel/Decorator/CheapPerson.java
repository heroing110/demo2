package com.example.demo2.designmodel.Decorator;

public class CheapPerson extends PersonFood{
    public CheapPerson(Person person) {
        super(person);
    }

    @Override
    public void eat() {
        super.eat();
        eatNoodle();
    }

    public void eatNoodle(){
        System.out.println("吃面条");
    }
}
