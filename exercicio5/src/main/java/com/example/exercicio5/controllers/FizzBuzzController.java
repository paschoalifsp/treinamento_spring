package com.example.exercicio5.controllers;

import com.example.exercicio5.entities.FizzBuzz;
import com.example.exercicio5.services.FizzBuzzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fizzbuzz")
@CrossOrigin(origins = "*")
public class FizzBuzzController {
    @Autowired
    private FizzBuzzService fizzBuzzService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody List<FizzBuzz> fizzBuzzers) {
        fizzBuzzers.stream().filter(fb -> fb.getNumero()%15 == 0).forEach(fb -> this.fizzBuzzService.create(fb));
    }
}

