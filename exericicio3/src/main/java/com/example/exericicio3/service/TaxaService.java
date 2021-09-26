package com.example.exericicio3.service;


import org.springframework.stereotype.Service;

@Service
public class TaxaService {
    public double taxa(Double custo){
        return custo*0.10;
    }
}
