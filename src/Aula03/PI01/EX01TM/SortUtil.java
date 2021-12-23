package Aula03.PI01.EX01TM;

public class SortUtil {
    public static <T> void sort (Precedente <T> arr[]){
        int tamanhoArr = arr.length;
        for (int c=0; c< tamanhoArr; c++){
            for (int i=0; i < tamanhoArr -1; i++){
                if(arr[i].precedeA((T) arr[i+1])){
                    Precedente <T> aux = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = aux;
                }
            }
        }
    }
}
