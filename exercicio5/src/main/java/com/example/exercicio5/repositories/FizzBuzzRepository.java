package com.example.exercicio5.repositories;

import com.example.exercicio5.entities.FizzBuzz;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FizzBuzzRepository extends CrudRepository<FizzBuzz, Long> {

    public List<Integer> getAllNumbers();

}