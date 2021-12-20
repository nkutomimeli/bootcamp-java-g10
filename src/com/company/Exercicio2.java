package com.company;

import java.util.Scanner;

public class Exercicio2 {

    public void executar() {
        // Exercicio 2
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de números que deseja ver: ");
        int n = scanner.nextInt(); // 4

        System.out.print("Digite o múltiplo desejado: ");
        int m = scanner.nextInt(); // 4

        int contador = 0;
        int valorAtual = 0;

        while (contador < n) {
            valorAtual++;
            if (valorAtual % m == 0) {
                contador += 1;
                System.out.println(valorAtual);
            }
        }

        //opcao 2


        // 4, 8, 12, 16

    }
}
