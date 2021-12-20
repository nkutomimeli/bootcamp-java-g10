package pi1.java;

import java.util.Scanner;

public class Exercicio5 {

    public void executar(){
        // pego valores do usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a quantidade de numeros que quer receber");
        int n = scanner.nextInt();
        System.out.println("Insira a quantidade minima de digitos iguais");
        int m = scanner.nextInt();
        System.out.println("Insira o digito que devera ser igual e estar no final de cada numero");
        int d = scanner.nextInt();

        int valoresEncontrados = 0;
        int contador = 0;

        // enquanto valoresEncontrados for menor que o usuario pediu, execute:
        while(valoresEncontrados < n) {
            contador++;

            // se o numero for valido, printo o numero
            // e itero valoresEncontrados
            if (numeroValido(contador, d, m)) {
                System.out.println(contador);
                valoresEncontrados++;
            }
        }

    }


    //  ----- METODOS AUXILIARES ----- //


    private boolean numeroValido(int numero, int digito, int limiteMinimo){
        // se o ultimo digito do numero for diferente do digito pedido pelo usuario
        // o numero eh invalido
        if (!ultimoDigitoIgual(numero, digito)) return false;

        // se o numero de ocorrencias for mair ou igual do que o usuario pediu,
        // o numero eh valido
        if (numeroOcorrencias(numero,digito) >= limiteMinimo ){
            return true;
        };

        // caso nao passe nas validacoes acima,
        // numero eh invalido
        return false;
    }

    private boolean ultimoDigitoIgual(int numero, int digito){
        return numero % 10 == digito;
    }

    private int numeroOcorrencias(int numero, int digito){
        int ocorrencias = 0;
        while(numero > 0 ){
            // resto da divisao por 10 eh igual o digito ?
            // gambiarra para pegar sempre o ultimo numero e fazer a comparacao
            if (numero % 10 == digito){
                ocorrencias++;
            }

            // numero recebe a divisao dele proprio por 10
            // para poder sair do while
            // 13 / 10 -> 1 (sobram 3)
            // 3 / 10 -> 0 (sobram 3)
            numero = numero / 10;
        }
        return ocorrencias;
    }

}

