package com.example.exercicio5.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "fizzbuzz")
@Data
public class FizzBuzz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer numero;

}