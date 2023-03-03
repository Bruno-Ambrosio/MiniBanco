/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bruno.minibanco;

/**
 *
 * @author Bruno
 */
public class Cliente {
    
    private String nome;
    private String CPF;
    private int score;

    public Cliente(String nome, String CPF, int score) {
        this.nome = nome;
        this.CPF = CPF;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", CPF=" + CPF + ", score=" + score + '}';
    }

   
    

}
