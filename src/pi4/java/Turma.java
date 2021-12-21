package pi4.java;

import java.util.List;
import java.util.Vector;

public class Turma {

    private int serie;
    private String codSerie;

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public String getCodSerie() {
        return codSerie;
    }

    public void setCodSerie(String codSerie) {
        this.codSerie = codSerie;
    }

    private List<Estudante> turmas = new Vector<>();
    private List<Disciplina> turmasDisc = new Vector<>();

    public List<Estudante> listaDeEstudantes() {
        return this.turmas;
    }

    public List<Disciplina> listaDeDisciplinas() {
        return this.turmasDisc;
    }

}
