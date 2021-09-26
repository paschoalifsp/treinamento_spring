package com.example.exercicio5.services;

import com.example.exercicio5.entities.Fizz;
import com.example.exercicio5.repositories.FizzRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FizzService {

    @Autowired
    private FizzRepository fizzRepository;
    public Fizz create(Fizz fizz){
        return this.fizzRepository.save(fizz);
    }
}
