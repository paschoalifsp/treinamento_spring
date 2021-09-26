package com.example.exercicio4.controller;

import com.example.exercicio4.service.ArquivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/arquivos")
public class ArquivoController {
    @Autowired
    private ArquivoService arquivoService;

    @PostMapping
    public void upload(@RequestParam MultipartFile arquivo){
        arquivoService.salvarArquivo(arquivo);

    }
}
