package com.example.exericicio2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping({"/test"})
public class TestController {

    @GetMapping
    public String text(@RequestParam(value="text") String text ){
        return "parametro passado: " + text;

    }

}