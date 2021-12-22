package Aula02.PI01Exerc01TM;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GerenciamentoEscola {

    public static void main(String[] args) {

        //criando ArrayList
        List<Estudante> alunos = new ArrayList<Estudante>();

        //inserindo na lista de alunos
        alunos.add(new Estudante("Vanessa","22011988", "3045", 2));
        alunos.add(new Estudante("Iohara","23122000", "3054", 2));
        alunos.add(new Estudante("Jose","08111974", "3098", 3));
        alunos.add(new Estudante("Lucian","22011980", "3056", 4));

        System.out.println("\nEstudantes Cadastrados\n");

        //usando o stream (ajuda a diminuir a quantidade de linhas combinando expressoes lambda) e imprime a lista de
        // alunos, chamando o método exibirEstudante na classe Estudante
        alunos.stream().forEach(a -> {
            System.out.println(a.exibirEstudante());
        });

        //criando ArrayList
        List<Disciplina> disciplinas = new ArrayList<Disciplina>();

        //inserindo na lista de disciplinas
        disciplinas.add(new Disciplina("Portugues", 80));
        disciplinas.add(new Disciplina("Matematica", 80));

        System.out.println("\nDisciplinas Cadastradas\n");

        //usando o stream (ajuda a diminuir a quantidade de linhas combinando expressoes lambda) e imprime a lista de
        //disciplinas, chamando o método exibirDisciplina na classe Disciplina
        disciplinas.stream().forEach(a -> {
            System.out.println(a.exibirDisciplina());
        });

        //
        List<Estudante> alunosSerie2 = alunos.stream().filter(a -> a.getSerie()==2).collect(Collectors.toList());;
        Turma turma1 = new Turma(2, "A", alunosSerie2, disciplinas);

        turma1.exibirEstudantes();
        turma1.exibirDisciplinas();
    }
}
