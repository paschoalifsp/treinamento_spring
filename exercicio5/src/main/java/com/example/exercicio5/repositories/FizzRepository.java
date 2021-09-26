package com.example.exercicio5.repositories;

import com.example.exercicio5.entities.Fizz;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FizzRepository extends CrudRepository<Fizz, Long> {
}