package Aula03.PI01.EX01TM;

public class Pessoa implements Precedente<Pessoa>{
    private String nome;
    private String cpf;

    public Pessoa() {
    }

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void printPessoa(){
        System.out.println("NOME: " + this.nome + "  -  CPF: " + this.cpf);
    }

    @Override
    public boolean precedeA(Pessoa pessoa) {
        // ORDENAÇÃO PELO VALOR DO CPF CRESCENTE
        long newCpf = Long.parseLong( pessoa.getCpf().replaceAll("[.-]*", "") );
        long thisCpf = Long.parseLong( this.getCpf().replaceAll("[.-]*", "") );
        if (thisCpf > newCpf){
            return true;
        }
        return false;
    }
}
