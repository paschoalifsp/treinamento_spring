package com.example.exercicio5.controllers;

import com.example.exercicio5.entities.Buzz;
import com.example.exercicio5.entities.Fizz;
import com.example.exercicio5.services.BuzzService;
import com.example.exercicio5.services.FizzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/buzz")
@CrossOrigin(origins = "*")
public class BuzzController {
    @Autowired
    private BuzzService buzzService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody List<Buzz> buzzes){
        buzzes.stream().filter(b -> b.getNumero()%5==0).forEach(b -> this.buzzService.create(b));
    }
}
