package Aula02.PI01Exerc01TT;

public abstract class Senha {

    protected String formato;
    private String senha;

    // recebe uma Regex para validar o formato da senha
    public Senha(String regex) {
        this.formato = regex;
    }

    // atribuir uma senha de acordo com o regex
    public void setValue (String pwd) throws Exception {
        // tenta validar a senha com o Regex e retorna uma exceção em
        // caso de incompatibilidade
        if (pwd.matches(formato)) {
            this.senha = pwd;
            System.out.println("A senha é válida");
        } else {
            throw new Exception("A senha não é válida. Tente outra vez.");
            //System.out.println("A senha não é válida. Tente outra vez.");
        }
    }

    public String getSenha() {
        return senha;
    }
}
