package com.example.pipeline.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wgPark on 2023-07-20.
 */
@RequestMapping("/")
@RestController
public class Controller {

    @GetMapping("/")
    public String view(){
        return "test";
    }
}
