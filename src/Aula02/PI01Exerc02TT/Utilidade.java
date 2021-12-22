package Aula02.PI01Exerc02TT;

import java.util.List;

public class Utilidade {

    public static double areaMedia (List<FiguraGeometrica> arr) {
        double area_total = 0;
        int contador = 0;

        for (FiguraGeometrica el : arr) {
            double area = el.area();
            area_total += area;
            contador++;
        }
        // contador = arr.size();
        return area_total / contador;
    }
}
