package com.example.AP2.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Cliente {
    public static int novoId = 1;
    private int id;
    private String nome;
    private int idade;
    private String profissao;

    public Cliente(String nome, int idade, String profissao) {
        this.id = novoId++;
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
    }
}
