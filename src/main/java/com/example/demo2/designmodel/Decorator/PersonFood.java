package com.example.demo2.designmodel.Decorator;

public class PersonFood extends Person{

    private Person person;

    public PersonFood(Person person) {
        this.person = person;
    }

    @Override
    public void eat() {
        this.person.eat();
    }
}
