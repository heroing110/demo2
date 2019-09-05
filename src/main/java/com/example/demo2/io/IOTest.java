package com.example.demo2.io;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class IOTest {
    public static void main(String[] args) throws IOException {
        File file = new File(".");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getAbsoluteFile().getParent());
        System.out.println(file.getPath());
        File aaa = File.createTempFile("aaa", null);
        System.out.println(aaa.getAbsolutePath());
        File tempFile = File.createTempFile("aaa", null, file);
        System.out.println(tempFile.getAbsolutePath());
        tempFile.deleteOnExit();
        File newFile = new File(System.currentTimeMillis()+"");
        System.out.println(newFile.exists());
        boolean newFile1 = newFile.createNewFile();
        System.out.println(newFile1);
        String[] list = file.list();
        System.out.println(Arrays.toString(list));
        File[] files = File.listRoots();
        System.out.println(Arrays.toString(files));
        String[] list1 = file.list(((dir, name) -> name.endsWith(".tmp") || new File(name).isDirectory()));
        System.out.println(Arrays.toString(list1));
    }
}
