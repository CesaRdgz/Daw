package Arrays;

import java.util.Arrays;

public class S08E1 {
    public static void main(String[] args) {
        /*Realizar un programa que inicialice una lista con 10 valores aleatorios (del 1 al 10) y
        posteriormente muestre en pantalla cada elemento de la lista junto con su cuadrado y su
        cubo.*/

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
        array[i] = (int) (Math.random() * 10 + 1);

        }
        System.out.println(Arrays.toString(array));

        System.out.println("Elemento    Caudrado    Cubo");
        System.out.println("=============================");
        for (int i = 0; i < array.length; i++) {
            System.out.println("    " + array[i] + "\t " + "    " + array[i] * array[i] + "\t\t" + "     " + array[i] * array[i] * array[i] + "\t\t\t");
        }

    }
}
