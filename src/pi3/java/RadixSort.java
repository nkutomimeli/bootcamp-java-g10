package pi3.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RadixSort {

    private List<String> L0 = new ArrayList<>();
    private List<String> L1 = new ArrayList<>();
    private List<String> L2 = new ArrayList<>();;
    private List<String> L3 = new ArrayList<>();;
    private List<String> L4 = new ArrayList<>();;
    private List<String> L5 = new ArrayList<>();;
    private List<String> L6 = new ArrayList<>();;
    private List<String> L7 = new ArrayList<>();;
    private List<String> L8 = new ArrayList<>();;
    private List<String> L9 = new ArrayList<>();;

    public void radixSort(int iArr[]) {
        String[] strArr = parseString(iArr);
        int nDigitos = maiorDigito(strArr);
        populaZeros(strArr, nDigitos);
        for (int i=0;i<nDigitos;i++){
            populaListas(strArr, i);
            populaArrComListas(strArr);
            limpaListas();
        }
        printaArr(strArr);
    }

    private String[] parseString(int iArr[]) {
        int tamanhoLista = iArr.length;
        String[] arrStr = new String[tamanhoLista];

        for (int i=0; i<tamanhoLista; i++) {
            arrStr[i] = String.valueOf(iArr[i]);
        }
        return arrStr;
    }

    private int maiorDigito(String strArr[]){
        int numeroDigitos = 0;
        for(String el: strArr){
            if (el.length() > numeroDigitos) numeroDigitos = el.length();
        }
        return numeroDigitos;
    }

    private void populaZeros(String strArr[], int nDigitos){
        for(int c=0; c<strArr.length; c++){
            String zerosAdd = "";
            for (int i=0; i<nDigitos - strArr[c].length();i++){
                zerosAdd +="0";
            }
            strArr[c] = zerosAdd + strArr[c];
        }
    }

    private void populaListas(String[] strArr, int i){
        for(String numero: strArr){
            String ultimoDigito = pegaUltimoDigito(numero, i);
            switch (ultimoDigito){
                case "0":
                    L0.add(numero);
                    break;
                case "1":
                    L1.add(numero);
                    break;
                case "2":
                    L2.add(numero);
                    break;
                case "3":
                    L3.add(numero);
                    break;
                case "4":
                    L4.add(numero);
                    break;
                case "5":
                    L5.add(numero);
                    break;
                case "6":
                    L6.add(numero);
                    break;
                case "7":
                    L7.add(numero);
                    break;
                case "8":
                    L8.add(numero);
                    break;
                case "9":
                    L9.add(numero);
                    break;
            }
        }
    }

    private void populaArrComListas(String[] arrStr){
        int i = 0;
        for(String el: this.L0){
            arrStr[i] = el;
            i++;
        }
        for(String el: this.L1){
            arrStr[i] = el;
            i++;
        }
        for(String el: this.L2){
            arrStr[i] = el;
            i++;
        }
        for(String el: this.L3){
            arrStr[i] = el;
            i++;
        }
        for(String el: this.L4){
            arrStr[i] = el;
            i++;
        }
        for(String el: this.L5){
            arrStr[i] = el;
            i++;
        }
        for(String el: this.L6){
            arrStr[i] = el;
            i++;
        }
        for(String el: this.L7){
            arrStr[i] = el;
            i++;
        }
        for(String el: this.L8){
            arrStr[i] = el;
            i++;
        }
        for(String el: this.L9){
            arrStr[i] = el;
            i++;
        }
    }

    private void limpaListas(){
        L0.clear();
        L1.clear();
        L2.clear();
        L2.clear();
        L3.clear();
        L4.clear();
        L5.clear();
        L6.clear();
        L7.clear();
        L8.clear();
        L9.clear();
    }

    private String pegaUltimoDigito(String numero, int i){
        i = i+1;
        String ultimoNumero =Character.toString(numero.charAt(numero.length()-i));
        return  ultimoNumero;
    }

    private void printaArr(String[] strArr){
        for(int i=0; i< strArr.length; i++){
            System.out.println(strArr[i]);
        }
    }


}
