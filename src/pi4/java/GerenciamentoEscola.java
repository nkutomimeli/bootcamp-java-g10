package pi4.java;

import java.sql.ClientInfoStatus;

public class GerenciamentoEscola {

    public static void main(String[] args) {

        Estudante[] estudantes = new Estudante[3];

        Estudante estud1 = new Estudante();
        estud1.setNomeEstudante("Vanessa");
        estud1.setDataNascimento("22011988");
        estud1.setNumeroMatricula("3045");
        estud1.setSerie(2);

        Estudante estud2 = new Estudante();
        estud2.setNomeEstudante("Iohara");
        estud2.setDataNascimento("23122000");
        estud2.setNumeroMatricula("3054");
        estud2.setSerie(2);

        Estudante estud3 = new Estudante();
        estud3.setNomeEstudante("Jose");
        estud3.setDataNascimento("08111974");
        estud3.setNumeroMatricula("3098");
        estud3.setSerie(3);

        estudantes[0] = estud1;
        estudantes[1] = estud2;
        estudantes[2] = estud3;

        System.out.println("\nEstudantes Cadastrados\n");

        for (int i = 0; i < estudantes.length; i++) {
            System.out.println(estudantes[i].getNomeEstudante() + " " + estudantes[i].getSerie() + " série");
        }

        System.out.println("\nDisciplinas Cadastradas\n");

        Disciplina[] disciplinas = new Disciplina[2];

        Disciplina disc1 = new Disciplina();
        disc1.setNomeDisciplina("Matematica");
        disc1.setCargaHoraria(80);

        Disciplina disc2 = new Disciplina();
        disc2.setNomeDisciplina("Português");
        disc2.setCargaHoraria(80);

        disciplinas[0] = disc1;
        disciplinas[1] = disc2;

        for (int i = 0; i < disciplinas.length; i++) {
            System.out.println(disciplinas[i].getNomeDisciplina() + " " + disciplinas[i].getCargaHoraria() + " horas");
        }



    }
}
