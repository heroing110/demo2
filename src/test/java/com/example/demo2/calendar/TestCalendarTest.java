package com.example.demo2.calendar;

import org.junit.Test;

import java.time.Clock;
import java.time.Instant;


public class TestCalendarTest {

    @Test
    public void testClock(){
        Clock clock =   Clock.systemUTC();
        System.out.println(clock.instant());
    }

    @Test
    public void testInstant(){
        Instant instant = Instant.now();
        System.out.println(instant);
    }
}