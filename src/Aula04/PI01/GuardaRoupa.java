package Aula04.PI01;

import java.util.*;

public class GuardaRoupa {
    private Map<Integer, List<Vestuario>> guardaroupa = new HashMap<Integer, List<Vestuario>>();
    private static Integer contador = 1;

    public Integer guardarVestuarios(List<Vestuario> listaDeVestuario) {
        Integer contador= this.contador++;
        this.guardaroupa.put(contador,listaDeVestuario);
        return contador;
    }

    public void mostrarVestuarios() {
        this.guardaroupa.entrySet().stream().forEach(r -> {
            int count = 0;
            System.out.println("Guarda-roupa " + r.getKey());
            while(count < r.getValue().size()) {
                System.out.println("Peça de marca " + r.getValue().get(count).getMarca() + " e modelo " + r.getValue().get(count).getModelo());
                count++;
            }
        });
    }

    public List<Vestuario> devolverVestuarios(Integer id) {
        Iterator<Map.Entry<Integer, List<Vestuario>>> iterator = this.guardaroupa.entrySet().iterator();
        List<Vestuario> lista = new ArrayList<Vestuario>();
        while(iterator.hasNext()) {
            Map.Entry<Integer, List<Vestuario>> elemento = iterator.next();
            if(elemento.getKey() == id) {
                for (Vestuario e: elemento.getValue()) {
                    System.out.println("Devolução das peça: " + e.getMarca() + " de modelo " + e.getModelo());
                    lista.add(e);
                }
                iterator.remove();
                return lista;
            }
        }
        return lista;
    }
}
