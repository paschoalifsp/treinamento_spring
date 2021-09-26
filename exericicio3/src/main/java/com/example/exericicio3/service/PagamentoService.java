package com.example.exericicio3.service;

import org.springframework.stereotype.Service;

@Service
public class PagamentoService {
    private TaxaService taxaService;


    public PagamentoService(TaxaService taxaService) {
        this.taxaService = taxaService;
    }

    public double custofinal(double custo){
        return custo + taxaService.taxa(custo);
    }

}
