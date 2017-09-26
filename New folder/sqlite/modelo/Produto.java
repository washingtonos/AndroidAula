package com.example.logonrm.sqlite.modelo;

/**
 * Created by logonrm on 26/09/2017.
 */

public class Produto {

    private int cod;
    private String nome;
    private double valor;
    private String descricao;

    public Produto(int cod, String nome, double valor, String descricao) {
        this.cod = cod;
        this.nome = nome;
        this.valor = valor;
        this.descricao = descricao;
    }

    public Produto(){

    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
