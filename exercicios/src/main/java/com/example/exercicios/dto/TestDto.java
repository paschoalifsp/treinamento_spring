package com.example.exercicios.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class TestDto {

    private String name;

    public String texto() {
        return this.name;
    }
}