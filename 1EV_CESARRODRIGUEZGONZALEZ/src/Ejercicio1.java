
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el numero de personas:");
        int personas = sc.nextInt();
        if (personas <= 0){
            System.out.println("No es posible");
        }else if (personas > 0 && personas < 200 ) {
            System.out.println("El precio es de 95€ por persona, lo que hace un total de: " + (personas * 95) + "€");
        } else if (personas >= 200 && personas <= 300) {
            System.out.println("El precio es de 85€ por persona, lo que hace un total de: " + (personas * 85) + "€");
        } else if (personas > 300) {
            System.out.println("El precio es de 75€ por persona, lo que hace un total de: " + (personas * 75) + "€");
        }
    }
}