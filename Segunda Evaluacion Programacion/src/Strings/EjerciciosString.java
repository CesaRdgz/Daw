package Strings;

import java.util.Scanner;

public class EjerciciosString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //ej2//
        String str = "Escribe algo";
        String subcadena = "es";
        str = str.toLowerCase();
        System.out.println( str.startsWith(subcadena));


        //ej3//
        String cadena = "bla bla bla bla";
        char c = 'b';
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == c){
                contador++;
            } else {
                contador = contador;

            }
        }
        System.out.println(contador);


        //ej4///
        System.out.println("Introduce la cadena que quieras ");
        String cadena1 = sc.nextLine();
        char c1 = ' ';
        int contador1 = 0;
        for (int i = 0; i < cadena1.length(); i++) {
            if (cadena1.charAt(i) == ' '){
                contador1++;
            } else {
                contador1 = contador1;

            }
        }
        contador1 ++ ;
        System.out.println(contador1);


        //ej5//
        System.out.println("Introduce tu nombre y tus apellidos");
        String nombreyapellidos = sc.nextLine();

        for (int i = 0; i < nombreyapellidos.length(); i++) {
            if (i == 0){
                System.out.print(nombreyapellidos.toUpperCase().charAt(0));
            } else if (nombreyapellidos.charAt(i) == ' '){
                System.out.println(nombreyapellidos.toUpperCase().charAt(i + 1));
            } else {
                continue;
            }
        }


        //ej6//
        System.out.println("Introduce una cadena");
        String normal = sc.nextLine();
        String reverso = "";
        for (int i = normal.length() - 1;  i >= 0; i--) {
            reverso = reverso + normal.charAt(i);
        }
        System.out.println(reverso);


        //ej7//
        System.out.println("introduce una cadena");
        String libro = sc.nextLine();
        System.out.println("introduce el caracter a buscar");
        char buscar = sc.nextLine().charAt(0);
        System.out.println("introduce el caracter por el que lo quieres cambiar");
        char reemplazar = sc.nextLine().charAt(0);
        System.out.println(libro.replace(buscar, reemplazar));


        //ej8//
        System.out.println("Introduce la cadena");
        String maymin = sc.nextLine();
        String upcase = maymin.toUpperCase();
        String lowcase = maymin.toLowerCase();
        for (int i = 0; i < maymin.length(); i++) {
            if (maymin.charAt(i) == upcase.charAt(i)){
                System.out.print(lowcase.charAt(i));
            }else if (maymin.charAt(i) == lowcase.charAt(i)){
                System.out.print(upcase.charAt(i));
            }else{
                continue;
            }
        }


        //ej9//
        System.out.println("Introduce una cadena");
        String str1 = sc.nextLine();
        System.out.println("Introduce la subcadena a buscar");
        String subcadena1 = sc.nextLine();
        str = str.toLowerCase();
        System.out.println(str.contains(subcadena));


        //ej10//
        System.out.println("Introduce una cadena");
        String normal1 = sc.nextLine();
        String palindromo = "";
        for (int i = normal1.length() - 1;  i >= 0; i--) {
            palindromo = palindromo + normal1.charAt(i);
        }
        if (normal1 == palindromo){
            System.out.println("si es");
        }else {
            System.out.println("no es");
        }
    }
}