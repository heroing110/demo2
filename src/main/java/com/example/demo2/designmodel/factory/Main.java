package com.example.demo2.designmodel.factory;

public class Main {
    public static void main(String[] args) {

        IPcFactory hpFactory = new HPPcFactory();
        IMouse hpMouse = hpFactory.createMouse();
        hpMouse.click();

        IPcFactory dellFactory = new DellPcFactory();
        IMouse dellMouse = dellFactory.createMouse();
        dellMouse.click();
    }
}
