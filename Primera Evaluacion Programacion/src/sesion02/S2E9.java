package sesion02;

import java.util.Scanner;

public class S2E9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el primer numero");
        int n1 = sc.nextInt();
        System.out.println("Dime el segundo numero");
        int n2 = sc.nextInt();
        System.out.println("Dime el tercero numero");
        int n3 = sc.nextInt();
        System.out.println("Dime el cuarto numero");
        int n4 = sc.nextInt();
        int resultadoSuma = (n1 + n2);
        int resultadoMultiplicacion = (n3 * n4);
        System.out.println("El resultado de la suma de " + n1 + " + " + n2 +" es: " + resultadoSuma);
        System.out.println("El resultado de la multiplicacion de " + n3 + " y  " + n4 + " es: " + resultadoMultiplicacion);

    }


}
