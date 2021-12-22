package Aula02.PI01Exerc02TT;

public class Quadrado extends FiguraGeometrica {

    private double aresta;

    public Quadrado(double a) {

        this.aresta = a;
    }

    @Override
    public double area() {

        return Math.pow(aresta, 2);
    }
}
