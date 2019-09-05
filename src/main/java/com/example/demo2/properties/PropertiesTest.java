package com.example.demo2.properties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        Properties properties=new Properties();
        properties.put("d","1");
        properties.put("c","2");
        properties.store(new FileOutputStream("a.ini"),"注释");

    }
}
