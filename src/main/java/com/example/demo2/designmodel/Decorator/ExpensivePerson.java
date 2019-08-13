package com.example.demo2.designmodel.Decorator;

public class ExpensivePerson extends PersonFood{
    public ExpensivePerson(Person person) {
        super(person);
    }

    @Override
    public void eat() {
        super.eat();
        drinkWine();
        eatBeaf();
    }

    public void drinkWine(){
        System.out.println("喝红酒");
    }

    public void eatBeaf(){
        System.out.println("吃牛肉");
    }
}
