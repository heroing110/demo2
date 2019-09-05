package com.example.demo2.designmodel.factory;

public class DellPcFactory implements IPcFactory{

    @Override
    public IMouse createMouse() {
        return new DellMouse();
    }
}
