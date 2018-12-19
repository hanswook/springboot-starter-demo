package com.hans.spingbootDemo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/test/hello")
    public Object hello() {
        return "hello spring booot";
    }

}
