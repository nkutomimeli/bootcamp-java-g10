package Aula02.PI01Exerc01TM;

public class Estudante {

    private String nomeEstudante;
    private String dataNascimento;
    private String numeroMatricula;
    private int serie;

    //criando construtor
    public Estudante(String nomeEstudante, String dataNascimento, String numeroMatricula, int serie) {
        this.nomeEstudante = nomeEstudante;
        this.dataNascimento = dataNascimento;
        this.numeroMatricula = numeroMatricula;
        this.serie = serie;
    }

    //método para exibir a lista de Estudantes
    public String exibirEstudante() {
        return "Nome: " + this.nomeEstudante + " - " + this.serie + " serie";
    }

    public String getNomeEstudante() {
        return nomeEstudante;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public int getSerie() {
        return serie;
    }

}
