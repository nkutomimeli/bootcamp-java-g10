package pi5.java;

public class Main {

    public static void main(String[] args) {
        // System.out.println("okay");
        /*
        Senha minhaSenha = new Senha("[0-9]{4}[a-z]{5}");
        try {
            minhaSenha.setValue("1234abcd");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("A senha é "+ minhaSenha.getSenha());
        */
        PasswordForte minhaSenha = new PasswordForte(); //("[0-9]{4}[a-z]{5}");
        try {
            minhaSenha.setValue("1234abcd");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("A senha é "+ minhaSenha.getSenha());
    }
}
