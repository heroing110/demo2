package com.example.demo2.calendar;

import java.util.Calendar;

public class TestCalendar {
    public static void main(String[] args) {
        Calendar calendar =  Calendar.getInstance();
        calendar.set(2003,6,31);
        calendar.add(Calendar.MONTH,0);
        System.out.println(calendar.getTime());
    }
}
