package Aula02.PI01Exerc02TT;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Circulo circulo1  = new Circulo(10);
        Triangulo triangulo1 = new Triangulo(5, 7);
        Quadrado quadrado1 = new Quadrado(6) ;

        List<FiguraGeometrica> meuArray = new ArrayList<FiguraGeometrica>();

        meuArray.add(circulo1);
        meuArray.add(triangulo1);
        meuArray.add(quadrado1);

        double areaM = Utilidade.areaMedia(meuArray);

        System.out.println(areaM);

        // System.out.println(circulo1.toString());

    }



}
