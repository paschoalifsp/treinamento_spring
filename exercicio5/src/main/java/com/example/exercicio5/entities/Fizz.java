package com.example.exercicio5.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "fizz")
@Data
public class Fizz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer numero;

}