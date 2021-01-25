import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*System.out.println("¿Cuantos euros tienes?");
        int euros = sc.nextInt();
        System.out.println("¿Y Cuantos centimos tienes?");
        int centimos = sc.nextInt();*/
        System.out.println("¿Cuantas monedas de 2 euros tienes?");
        int dos = sc.nextInt();
        System.out.println("¿Cuantas monedas de 1 euro tienes?");
        int uno = sc.nextInt();
        System.out.println("¿Cuantas monedas de 50 centimos tienes?");
        int cincuenta = sc.nextInt();
        System.out.println("¿Cuantas monedas de 20 centimos tienes?");
        int veinte = sc.nextInt();
        System.out.println("¿Cuantas monedas de 10 centimos tienes?");
        int diez = sc.nextInt();


        dos = dos * 2 * 100;
        uno = uno * 100;
        cincuenta = cincuenta * 50;
        veinte = veinte * 20;
        diez = diez * 10;


        int centimostotales = (dos + uno + cincuenta + veinte + diez);
        int euros = centimostotales / 100;
        int centimos = centimostotales % 100;
        System.out.println("En total tienes " + euros + " euros con " + centimos + " centimos");
    }
}