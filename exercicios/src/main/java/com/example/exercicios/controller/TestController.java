package com.example.exercicios.controller;

import com.example.exercicios.dto.TestDto;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")

public class TestController {

    @PostMapping
    ResponseEntity<TestDto> printTexto(@RequestBody TestDto texto){
        System.out.println(texto.texto());
        return ResponseEntity.ok(texto);
    }

}