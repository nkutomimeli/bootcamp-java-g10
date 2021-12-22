package Aula02.PI01Exerc02TT;

public class Triangulo extends FiguraGeometrica {

    private double altura;
    private double base;

    public Triangulo(double a, double b) {
        this.altura = a;
        this.base = b;
    }

    @Override
    public double area() {

        return (base * altura) / 2;
    }
}
