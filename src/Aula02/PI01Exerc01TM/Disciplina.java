package Aula02.PI01Exerc01TM;

public class Disciplina {

    private String nomeDisciplina;
    private int cargaHoraria;

    //criando construtor
    public Disciplina(String nomeDisciplina, int cargaHoraria) {
        this.nomeDisciplina = nomeDisciplina;
        this.cargaHoraria = cargaHoraria;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    //método para exibir a lista de disciplina
    public String exibirDisciplina() {
        return "Disciplina: " + nomeDisciplina + " - Carga Horaria: "+ cargaHoraria;
    }
}
