package com.company;

import java.util.Scanner;

public class Menu {

    // função que inicializa o programa
    public void iniciar(){

        Scanner entrada = new Scanner(System.in);

        //defino uma entrada padrão para entrar no while
        int usuarioEscolhaMenu = -1;

        // loop para sempre printar menu
        // e pegar resposta do usuario
        while(usuarioEscolhaMenu != 0){

            // utilizacao do metodo privado printarMenu
            this.printarMenu();

            //pego entrada do usuario
            usuarioEscolhaMenu = entrada.nextInt();

            // condicional para cada exercicio
            switch (usuarioEscolhaMenu){
                case 1: {
                    Exercicio1 ex1 = new Exercicio1();
                    ex1.executar();
                    break;
                }
                case 2: {
                    Exercicio2 ex2 = new Exercicio2();
                    ex2.executar();
                    break;
                }
                case 3: {
                    Exercicio3 ex3 = new Exercicio3();
                    ex3.executar();
                    break;
                }
                case 4: {
                    Exercicio4 ex4 = new Exercicio4();
                    ex4.executar();
                    break;
                }
                case 0:{
                    this.printarSaida();
                    break;
                }
            }

        }


    }

    private void printarSaida(){
        System.out.println("Fechando programa...");
    }

    // função que printa no console as opcoes do menu
    private void printarMenu(){
        System.out.println("\n#  #  MENU  #  #");
        System.out.println("1 - Executa exercício 1");
        System.out.println("2 - Executa exercício 2");
        System.out.println("3 - Executa exercício 3");
        System.out.println("4 - Executa exercício 4");
        System.out.println("0 - Para sair\n");
    }
}
