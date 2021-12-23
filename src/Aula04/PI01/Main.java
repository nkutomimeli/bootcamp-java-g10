package Aula04.PI01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Vestuario camisa = new Vestuario();
        Vestuario bolsa = new Vestuario();
        Vestuario blusa = new Vestuario();

        camisa.setMarca("Puma");
        camisa.setModelo("Outspring");
        bolsa.setMarca("Lorenzzo");
        bolsa.setModelo("Hawai");
        blusa.setMarca("Pool");
        blusa.setModelo("Pink21");

        List<Vestuario> roupas = new ArrayList<Vestuario>();
        roupas.add(camisa);
        roupas.add(bolsa);
        roupas.add(blusa);

        GuardaRoupa guardaRoupa1 = new GuardaRoupa();

        guardaRoupa1.guardarVestuarios(roupas);

        guardaRoupa1.mostrarVestuarios();

        List<Vestuario> teste = new ArrayList<Vestuario>();
        teste = guardaRoupa1.devolverVestuarios(1);
        System.out.println(teste.getClass());


    }
}
