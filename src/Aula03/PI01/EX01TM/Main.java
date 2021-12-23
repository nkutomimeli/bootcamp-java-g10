package Aula03.PI01.EX01TM;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Lucian", "999.999.999-99");
        Pessoa p2 = new Pessoa("Ismael", "111.111.111-11");
        Pessoa p3 = new Pessoa("Iohara", "333.333.333-33");
        Pessoa p4 = new Pessoa("Vanessa", "555.555.555-55");
        Pessoa p5 = new Pessoa("Nathan", "888.888.888-88");

        Pessoa[] arrPessoa = new Pessoa[5];

        arrPessoa[0] = p1;
        arrPessoa[1] = p2;
        arrPessoa[2] = p3;
        arrPessoa[3] = p4;
        arrPessoa[4] = p5;

        System.out.println("LISTA ANTES DA ORDENAÇÃO\n");

        for(Pessoa p: arrPessoa ){
            p.printPessoa();
        }

        SortUtil.sort(arrPessoa);

        System.out.println("\n# # # # # # # # # # # # # # # # # # # # #\n");

        System.out.println("LISTA DEPOIS DA ORDENAÇÃO\n");
        for(Pessoa p: arrPessoa ){
            p.printPessoa();
        }
    }
}
