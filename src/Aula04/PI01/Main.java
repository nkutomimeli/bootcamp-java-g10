package Aula04.PI01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Vestuario camisa = new Vestuario();
        Vestuario bolsa = new Vestuario();

        camisa.setMarca("Puma");
        camisa.setModelo("Outspring");
        bolsa.setMarca("Lorenzzo");
        bolsa.setModelo("Hawai");

        List<Vestuario> roupas = new ArrayList<Vestuario>();
        roupas.add(camisa);
        roupas.add(bolsa);

        GuardaRoupa guardaRoupa1 = new GuardaRoupa();
        GuardaRoupa guardaRoupa2 = new GuardaRoupa();

        guardaRoupa1.guardarVestuarios(roupas);
        guardaRoupa2.guardarVestuarios(roupas);

        guardaRoupa1.mostrarVestuarios();
        guardaRoupa2.mostrarVestuarios();

        guardaRoupa1.devolverVestuarios(1);

    }
}
