package sesion02;

import java.util.Scanner;

public class S2E8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Para calcular el perimetro de un cuadrado dime cuanto mide su lado");
        int ladocuadrado = sc.nextInt();
        int perimetrocuadrado = (ladocuadrado * 4);
        System.out.println("El perimetro de un cuadrado es: " + perimetrocuadrado);
    }
}
