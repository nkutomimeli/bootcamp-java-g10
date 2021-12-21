package Aula01.PI01Exerc01TM;

import java.util.Scanner;

public class Exercicio3 {

    public void executar () {
        Scanner entrada = new Scanner(System.in);
        int n, c = 2, i = 0;

        System.out.print("Informe um número para saber se ele é primo: ");
        n = entrada.nextInt();

        while (c <= n) {
            if (n % c == 0 && c < n) {
                c++;
                i++;
            }
            if (c == n && i == 0) {
                System.out.println("É Primo");
                break;
            }
            if (n % c != 0 && c < n) {
                c++;
            } else {
                System.out.println("Não é primo");
                break;
            }
        }
    }
}
