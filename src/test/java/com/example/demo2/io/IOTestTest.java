package com.example.demo2.io;


import com.example.demo2.TestRerfence.Options;
import org.junit.Test;

import java.io.*;

public class IOTestTest {

    @Test
    public void test1() throws IOException {

        byte[] bytes = new byte[1024];
        int len;
        try(FileInputStream fileInputStream = new FileInputStream("d:/sit人员.txt")){
            while ((len = fileInputStream.read(bytes))>0){
                String str = new String(bytes,0,len,"GBK");
                System.out.println(str);
            }
        }
    }

    @Test
    public void test2() throws IOException {

        char[] chars = new char[32];
        int len;
        try(FileReader fileReader = new FileReader("d:/sit人员utf8.txt")){
            while ((len = fileReader.read(chars))>0){
                String str = new String(chars,0,len);
                System.out.println(str);
            }
        }
    }

    @Test
    public void test3() throws IOException {

        try (FileOutputStream fileOutputStream = new FileOutputStream("aaa.txt");
             PrintStream printStream = new PrintStream(fileOutputStream)) {
            printStream.println(new Options());
        }
    }
}