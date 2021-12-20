package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Exercicio4 {
    public void executar(){
        System.out.println("Digite um valor para que retorne os numero primos de 1 ate ele:");
        Scanner entrada = new Scanner(System.in);

        int contador = 0;
        int limite = entrada.nextInt();

        List<Integer> listaDePrimos = new ArrayList<>();

        while(contador <= limite){
            contador++;
            if (ehPrimo(contador)){
                listaDePrimos.add(contador);
            }
        }

        System.out.println(listaDePrimos);

    }

    private boolean ehPrimo(int numero){
        int  c = 2, i = 0;
        while (c <= numero) {
            if (numero % c == 0 && c < numero) {
                c++;
                i++;
            }
            if (c == numero && i == 0) {
                return true;
            }
            if (numero % c != 0 && c < numero) {
                c++;
            } else {
                return false;
            }
        }
        return false;
    }

}
