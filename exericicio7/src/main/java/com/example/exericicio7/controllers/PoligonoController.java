package com.example.exericicio7.controllers;

import com.example.exericicio7.entities.Poligono;
import com.example.exericicio7.services.PoligonoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/poligonos")
@CrossOrigin(origins = "*")
public class PoligonoController {
    @Autowired
    private PoligonoService poligonoService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Poligono create(@RequestBody Poligono poligono) {
        return this.poligonoService.create(poligono);
    }
}