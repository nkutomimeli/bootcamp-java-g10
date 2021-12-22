package Aula02.PI01Exerc01TM;

import java.util.ArrayList;
import java.util.List;

public class Turma {

    private int serie;
    private String codSerie;
    private List<Estudante> estudantes;
    private List<Disciplina> disciplinas;

    //criando construtor
    public Turma(int serie, String codSerie, List<Estudante> estudantes, List<Disciplina> disciplinas) {
        this.serie = serie;
        this.codSerie = codSerie;
        this.estudantes= estudantes;
        this.disciplinas = disciplinas;
    }

    public int getSerie() {
        return serie;
    }

    public String getCodSerie() {
        return codSerie;
    }

    public void exibirEstudantes() {
        System.out.println("\nLista: " + getSerie() + " ano " + getCodSerie() + "\n");
        this.estudantes.stream().forEach(a -> {
            System.out.println(a.exibirEstudante());
        });
    }

    public void exibirDisciplinas() {
        for (Disciplina d : this.disciplinas ) {
            System.out.println(d.exibirDisciplina());
        }
    }

}
