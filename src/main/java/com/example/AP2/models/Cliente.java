package com.example.AP2.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Cliente {

    private int id;
    private String nome;
    private int idade;
    private String profissao;
}
