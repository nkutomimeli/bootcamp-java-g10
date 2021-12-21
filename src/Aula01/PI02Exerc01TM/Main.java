package Aula01.PI02Exerc01TM;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void exercicio1() {
        Integer[] array = {51,10,85,1324,01,13,62,30,12,127};
        // Crescente
        Arrays.sort(array);
        System.out.println("Ordem crescente:");
        for(int a: array){
            System.out.println(a);
        }
        // Descrescente
        System.out.println("\n\nOrdem decrescente:");
        Arrays.sort(array, Collections.reverseOrder());
        for(int a: array){
            System.out.println(a);
        }
    }

    public static void exercicio2() {
        float empresaValor1 = 1.13f;
        float empresaValor2 = 18.4f;
        float cresc1 = 1.48f;
        float cresc2 = 0.32f;
        int count = 1;
        System.out.printf("\nEmpresa X - 01/01/202%d - Valor da empresa: %f", count, empresaValor1);
        System.out.printf("\nEmpresa Y - 01/01/202%d - Valor da empresa: %f", count, empresaValor2);
        while(empresaValor2>empresaValor1){
            empresaValor1 = empresaValor1 + (cresc1 * empresaValor1);
            empresaValor2 = empresaValor2 + (cresc2 * empresaValor2);
            count++;
            System.out.printf("\nEmpresa X - 01/01/202%d - Valor da empresa: %f", count, empresaValor1);
            System.out.printf("\nEmpresa Y - 01/01/202%d - Valor da empresa: %f", count, empresaValor2);
        }
        System.out.println();
    }

    public static void exercicio3() {
        String produto[][] = {{"Arroz", "10.99", "2"}, {"Feijão", "14.49", "1"}, {"Tomate", "9.99", "5"}};
        int count = 1;
        Float quantidade = 0f;
        Float preco = 0f;
        Float total = 0f;

        for (String[] p : produto) {
            System.out.printf("Produto %d\n", count);
            for (String i : p) {
                try {
                    Float aux = Float.parseFloat(i);
                    if(aux%1 == 0){
                        quantidade = aux;
                        System.out.println("Quantidade: " + i);
                    } else {
                        preco += aux;
                        System.out.println("R$" + i);
                    }
                } catch (NumberFormatException e) {
                    System.out.println(i);
                }
            }
            total += quantidade * preco;
            quantidade = 0f;
            preco = 0f;
            count++;
        }
        System.out.println("Valor total: " + total);
    }

    public static void main(String[] args) {
        //exercicio1();
        //exercicio2();
        exercicio3();
    }
}
