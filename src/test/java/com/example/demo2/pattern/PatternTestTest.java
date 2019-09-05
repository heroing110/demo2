package com.example.demo2.pattern;


import org.junit.Test;

import java.util.Date;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTestTest {

    @Test
    public void test1(){
        String a = "我想求购一本java书籍，我的电话是15652342864，希望看到给我下号13039081234留言，或者是14212345678";
        Matcher matcher = Pattern.compile("((13\\d)|(15\\d))\\d{8}").matcher(a);
        while (matcher.find()){
            System.out.println(matcher.group());
        }

        TreeSet set = new TreeSet();
        set.add(new String("sdfsdf"));
        set.add(new Date());



    }
}