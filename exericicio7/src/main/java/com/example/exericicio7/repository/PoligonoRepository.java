package com.example.exericicio7.repository;

import com.example.exericicio7.entities.Poligono;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PoligonoRepository extends CrudRepository<Poligono, Long> {
    Poligono save(Poligono poligono);
}