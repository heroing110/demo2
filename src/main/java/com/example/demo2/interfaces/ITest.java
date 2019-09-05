package com.example.demo2.interfaces;

public interface ITest extends ITestA,ITestB{
    @Override
    default int testA() {
        return 0;
    }
}
