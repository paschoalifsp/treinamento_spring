package com.example.exercicio5.controllers;

import com.example.exercicio5.services.BuzzService;
import com.example.exercicio5.services.FizzBuzzService;
import com.example.exercicio5.services.FizzService;
import com.example.exercicio5.services.SomaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/soma")
@CrossOrigin(origins = "*")
public class SomaController {
    @Autowired
    private SomaService somaService;

    @GetMapping
    public int resultado (@RequestParam(value="resultado") String tipo ){
        resultado = this.somaService.soma(tipo).forEach(n -> n.);



        return "parametro passado: " + text;

    }

}
