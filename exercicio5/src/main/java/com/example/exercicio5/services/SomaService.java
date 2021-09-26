package com.example.exercicio5.services;

import com.example.exercicio5.entities.Fizz;
import com.example.exercicio5.repositories.BuzzRepository;
import com.example.exercicio5.repositories.FizzBuzzRepository;
import com.example.exercicio5.repositories.FizzRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@Service
public class SomaService {

    @Autowired
    private FizzRepository fizzRepository;
    @Autowired
    private BuzzRepository buzzRepository;
    @Autowired
    private FizzBuzzRepository fizzBuzzRepository;

    public Iterable<?> soma(String tipo){

        if(tipo.equalsIgnoreCase("fizz")) {
            List<Fizz> fizz = this.fizzRepository.findAll().spliterator().;

            return
        }
        if(tipo.equalsIgnoreCase("buzz")) {

            return this.buzzRepository.findAll();
        }
        if(tipo.equalsIgnoreCase("fizzbuzz")) {

            return this.fizzBuzzRepository.findAll();
        }
        return null;
    }
}
