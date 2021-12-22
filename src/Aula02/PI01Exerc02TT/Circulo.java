package Aula02.PI01Exerc02TT;

public class Circulo extends FiguraGeometrica {

    private double raio;

    public Circulo (double r) {

        this.raio = r;
    }

    // Ao estender FiguraGeometrica, automaticamente
    // é requisitado implementar o método area()
    // pois esse método é abstrato em FiguraGeometrica
    @Override
    public double area() {
        return Math.PI * Math.pow(raio, 2);
    }
}
