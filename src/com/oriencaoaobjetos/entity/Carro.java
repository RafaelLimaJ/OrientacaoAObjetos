package com.oriencaoaobjetos.entity;

public class Carro {
    public String modelo;
    public int quantidade;
    public int preco;

    @Override
    public String toString() {
        return "Modelo:" + modelo + "\nQuantidade:" + quantidade + "\nPreço:" + preco;
    }
}
