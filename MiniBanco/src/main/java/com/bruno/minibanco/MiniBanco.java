/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.bruno.minibanco;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public class MiniBanco {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Boolean sair = false;
        int operacao = 0;
        double valor = 0;
        int conta;

        Cliente bruno = new Cliente("Bruno", "1234", 800);
        Cliente bernardo = new Cliente("Bernardo", "5678", 400);

        Conta contaA = new Conta(1, 2000.0, bruno);
        Conta contaB = new Conta(2, 2000.0, bernardo);

        while (sair != true) {
            menu();

            System.out.println(contaA);
            System.out.println(contaB);

            operacao = in.nextInt();

            if (operacao == 1) {
                System.out.println("Insira um valor: ");
                valor = in.nextInt();
                System.out.println("Insira a conta para depósito: ");
                System.out.println("1-Bruno, 2-Bernardo");
                conta = in.nextInt();

                if (conta == 1) {
                    contaA.depositar(valor);
                } else if (conta == 2) {
                    contaB.depositar(valor);
                }
            }

            if (operacao == 2) {

                System.out.println("Insira a conta para envio: ");
                System.out.println("1-Bruno, 2-Bernardo");
                conta = in.nextInt();

                System.out.println("Insira um valor: ");
                valor = in.nextInt();

                if (conta == 1) {
                    contaB.pix(contaA, valor);
                } else if (conta == 2) {
                    contaA.pix(contaB, valor);
                }
            }
            
            if (operacao == 3) {

                System.out.println("Insira a conta para saque: ");
                System.out.println("1-Bruno, 2-Bernardo");
                conta = in.nextInt();

                System.out.println("Insira um valor: ");
                valor = in.nextInt();

                if (conta == 1) {
                    contaA.saque(valor);
                } else if (conta == 2) {
                    contaB.saque(valor);
                }
            }
            
            if (operacao == 0) {

                sair = true;
                
            }
            

        }

    }

    static void menu() {
        System.out.println("Operação a realizar: ");
        System.out.println("1-Depósito");
        System.out.println("2-PIX");
        System.out.println("3-Saque");
        System.out.println("0-Sair");
    }

}
