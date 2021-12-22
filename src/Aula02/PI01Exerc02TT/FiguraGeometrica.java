package Aula02.PI01Exerc02TT;

public abstract class FiguraGeometrica {

    public abstract double area ();

    // talvez não devesse substituir o método
    // na classe abstrata e sim nas filhas.
    // Só devem substituir se for muito necesssário.
    @Override
    public String toString() {
        return "okay";
    }
}
