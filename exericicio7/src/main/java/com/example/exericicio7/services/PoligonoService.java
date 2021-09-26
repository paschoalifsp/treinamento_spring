package com.example.exericicio7.services;

import com.example.exericicio7.entities.Poligono;
import com.example.exericicio7.repository.PoligonoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PoligonoService {
    @Autowired
    private PoligonoRepository apartamentoRepository;

    public Poligono create(Poligono poligono) {
        return this.apartamentoRepository.save(poligono);
    }
}