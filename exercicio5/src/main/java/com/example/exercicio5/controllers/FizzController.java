package com.example.exercicio5.controllers;
import com.example.exercicio5.entities.Fizz;
import com.example.exercicio5.services.FizzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fizz")
@CrossOrigin(origins = "*")
public class FizzController {
    @Autowired
    private FizzService fizzService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody List<Fizz> fizzes){
        fizzes.stream().filter(f -> f.getNumero()%3 == 0).forEach(f -> this.fizzService.create(f));
    }
}
