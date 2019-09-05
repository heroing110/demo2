package com.example.demo2.designmodel.factory;

public class DellMouse implements IMouse{

    @Override
    public void click() {
        System.out.println("Dell Mouse click");
    }
}
