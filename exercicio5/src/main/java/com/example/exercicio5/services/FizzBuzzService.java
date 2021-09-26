package com.example.exercicio5.services;

import com.example.exercicio5.entities.FizzBuzz;
import com.example.exercicio5.repositories.FizzBuzzRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FizzBuzzService {
    @Autowired
    private FizzBuzzRepository fizzBuzzRepository;
    public FizzBuzz create(FizzBuzz fizzBuzz){
        return this.fizzBuzzRepository.save(fizzBuzz);
    }


}