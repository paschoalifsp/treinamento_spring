package com.example.exercicio5.services;

import com.example.exercicio5.entities.Buzz;
import com.example.exercicio5.repositories.BuzzRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuzzService {
    @Autowired
    private BuzzRepository buzzRepository;
    public Buzz create(Buzz buzz){
        return this.buzzRepository.save(buzz);
    }

}
