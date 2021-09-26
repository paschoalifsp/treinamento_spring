package com.example.exercicio5.repositories;

import com.example.exercicio5.entities.Buzz;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BuzzRepository extends CrudRepository<Buzz, Long> {
    public List<Integer> getAllNumbers();

}