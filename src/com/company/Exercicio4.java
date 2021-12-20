package com.company;

import java.util.Scanner;

public class Exercicio4 {

    public void executar () {
        Scanner entrada = new Scanner(System.in);
        int n, k = 0, c = 2;

        System.out.print("Informe um número: ");
        n = entrada.nextInt();

        for (int j = 1; j <= n; j++) { //4
            if(n % j == 0){
                k++;
            }
            if(j == c && k == 2){
                System.out.println(j);
            }
        }


    }

    public boolean primo(int n){
        int c = 2, i = 0;
        boolean estado = false;
        while (c <= n) {
            if (n % c == 0 && c < n) {
                c++;
                i++;
            }
            if (c == n && i == 0) {
                System.out.println("É Primo");
                estado = true;
                break;
            }
            if (n % c != 0 && c < n) {
                c++;
            } else {
                System.out.println("Não é primo");
                estado = false;
                break;
            }
        }
        return estado;
    }
}


