package Arrays;



import java.util.Arrays;
import java.util.Scanner;

public class Hoja2Ej10Metodo {

    public static void main(String[] args) {
        int[] a = CrearArray();
        System.out.println(Arrays.toString(CopiarArray(a)));
        int[] b = CopiarArray(a);
        DesplazarArray(a, b);
        ImprimirArray(a);
    }


    public static int[] CrearArray() {
        int[] desplazar = new int[10];
        for (int i = 0; i < desplazar.length; i++) {
            desplazar[i] = i;
        }
        return desplazar;
    }


    public static int[] CopiarArray(int[] array) {
        int[] copia = array.clone();
        return copia;
    }


    public static int[] DesplazarArray(int[] array, int[] copia) {
        array[0] = copia[copia.length - 1];
        for (int i = 1; i < array.length; i++) {
            array[i] = copia[i - 1];
        }
        return array;
        }



            public static void ImprimirArray ( int[] array) {
                System.out.println(Arrays.toString(array));
            }


        }


