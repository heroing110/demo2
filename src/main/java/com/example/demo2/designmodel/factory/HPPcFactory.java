package com.example.demo2.designmodel.factory;

public class HPPcFactory implements IPcFactory{

    @Override
    public IMouse createMouse() {
        return new HPMouse();
    }
}
