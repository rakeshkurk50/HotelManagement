package com.example.HotelManagement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloSir {


    @GetMapping("/")
    public String hello(){

        return "I am Ironman";
    }
}
