package com.company;

import java.util.Scanner;

public class Menu {
    // função que inicializa o programa
    public void iniciar(){
        this.printarMenu();

        Scanner entrada = new Scanner(System.in);
        int usuarioEscolhaMenu = entrada.nextInt();

        OpcoesMenu opcoesMenu = new OpcoesMenu();

        switch (usuarioEscolhaMenu){
            case 1: {
                Exercicio1 ex1 = new Exercicio1();
                ex1.executar();
                this.iniciar();
            }
            case 2: {
                Exercicio2 ex2 = new Exercicio2();
                ex2.executar();
                this.iniciar();
            }
            case 3: {
                Exercicio3 ex3 = new Exercicio3();
                ex3.executar();
                this.iniciar();
            }
        }
    }

    // função que printa no console as opcoes do menu
    private void printarMenu(){
        System.out.println("#  #  MENU  #  #");
        System.out.println("1 - Executa exercício 1");
        System.out.println("2 - Executa exercício 2");
        System.out.println("3 - Executa exercício 3");
        System.out.println("0 - Para sair");
    }
}
