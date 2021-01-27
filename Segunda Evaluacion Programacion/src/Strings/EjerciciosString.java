package Strings;

import java.util.Scanner;

public class EjerciciosString {
    public static void main(String[] args) {
        //ej2//
        Scanner sc = new Scanner(System.in);
        String str = "Escribe algo";
        String subcadena = "es";
        str = str.toLowerCase();
        System.out.println( str.startsWith(subcadena));
        //ej3//
        String cadena = "bla bla bla bla";
        char c = 'b';
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == c)

        suma();
        }
    }
    public static void suma() {
        int a = 1 + 3;
        int  b = 2;
        System.out.println(a + b);
    }
}
