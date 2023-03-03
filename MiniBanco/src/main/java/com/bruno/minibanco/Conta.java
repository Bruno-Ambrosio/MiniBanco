/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bruno.minibanco;

/**
 *
 * @author Bruno
 */
public class Conta {

    private int numero;
    private double saldo;
    private double credito;
    private Cliente cliente;

    public Conta(int numero, double saldo, Cliente cliente) {
        this.numero = numero;
        this.saldo = saldo;
        this.cliente = cliente;
        consultarCredito();
    }

    public void saque(double valor) {

        if (valor > this.saldo) {

            this.saldo = this.saldo - valor;

        } else {

            System.out.println("VAI TOMA NO SEU CU!");
            this.saldo = 0;
        }

    }

    public void depositar(double valor) {

        if (valor >= 0) {

            this.saldo = this.saldo + valor;

        } else {

            System.out.println("VAI TOMA NO SEU CU!");
            this.saldo = 0;

        }

    }

    public void pix(Conta conta, double valor) {
        saque(valor);
        conta.depositar(valor);
    }

    public void consultarCredito() {
        if (this.cliente.getScore() <= 500) {
            this.credito = 800;
        } else if (this.cliente.getScore() >= 501) {
            this.credito = 1600;
        }
    }

    @Override
    public String toString() {
        return "Conta{" + "numero=" + numero + ", saldo=" + saldo + ", credito=" + credito + ", cliente=" + cliente + '}';
    }

}
