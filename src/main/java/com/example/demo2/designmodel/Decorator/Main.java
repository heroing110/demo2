package com.example.demo2.designmodel.Decorator;

public class Main {
    public static void main(String[] args) {
        Person person = new NormanPerson();
        Person expensivePerson = new ExpensivePerson(person);
        Person cheapPerson = new CheapPerson(expensivePerson);
        cheapPerson.eat();
    }
}
