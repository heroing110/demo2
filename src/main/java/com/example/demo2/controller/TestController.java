package com.example.demo2.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private Logger logger = LogManager.getLogger(TestController.class.getName());

    @RequestMapping("/hello")
    public String hello(){
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
        return "hello";
    }
}
