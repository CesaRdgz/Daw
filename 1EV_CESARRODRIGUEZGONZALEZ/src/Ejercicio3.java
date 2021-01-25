import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el numero de multiplos de 3 que quieres sumar: ");

        int multiplos = sc.nextInt();
        int acumulador = 0;
        int contador = 0;
        for (int i = 1; i <= multiplos; i++) {
            contador = i * 3;
            if (contador % 2 == 0) {
                acumulador = contador + acumulador;
            }
        }
        System.out.println(acumulador);
    }
}
