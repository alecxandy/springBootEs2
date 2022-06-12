package com.example.demo.domain;


import java.io.Serializable;

public class Anime implements Serializable {
    private String nome;

    public Anime() {
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
