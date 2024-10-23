package com.example.AP2.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Cliente {
    public static int ultimoId = 1;
    private int id;
    private String nome;
    private int idade;
    private String profissao;

    public void setarCliente(String nome, int idade, String profissao) {
        this.id = ultimoId++; // só por enquanto
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
    }
}
