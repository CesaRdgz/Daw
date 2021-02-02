package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Hoja2Ej10 {

    public static void main(String[] args) {
        //9. Crear un programa que lea por teclado una tabla de 10 números enteros//
        //y la desplace una posición hacia abajo (el último pasa a ser el primero).//
        int[] desplazar = new int[10];
        for (int i = 0; i < desplazar.length; i++) {
            desplazar[i] = i;
        }
        int[] copia = desplazar.clone();
        desplazar[0] = copia[copia.length - 1];
        for (int i = 1; i < desplazar.length; i++) {
            desplazar[i] = copia[i-1];
            }
        System.out.println(Arrays.toString(desplazar));
    }
}
