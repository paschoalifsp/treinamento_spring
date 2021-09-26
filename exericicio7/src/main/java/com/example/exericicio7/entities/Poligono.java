package com.example.exericicio7.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "poligono")
@Data
public class Poligono {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
}