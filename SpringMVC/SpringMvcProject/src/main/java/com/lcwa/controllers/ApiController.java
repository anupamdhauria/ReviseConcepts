package com.lcwa.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {
    @RequestMapping("/hello")
    public String getHello(){
        return "Hello,How are You?";
    }

    @RequestMapping("/users")
    public List<String> getUsers(){
        return Arrays.asList("Anupam","Sanjeet","Amit","Nihal");
    }

}
