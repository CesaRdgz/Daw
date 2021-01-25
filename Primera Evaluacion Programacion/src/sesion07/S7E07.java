package sesion07;

import java.util.Scanner;

public class S7E07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numAleatorio = (int) (Math.random() * 100 + 1);

        System.out.println("Introduce un numero entre el 1 y el 100");
        int num = sc.nextInt();
        if(num == 0) {
            System.out.println("Te has rendido, el numero era " + numAleatorio);
            System.exit(0);
        }else {
            while (num != numAleatorio) {
                if(num == 0) {
                    System.out.println("Te has rendido, el numero era " + numAleatorio);
                } else if  (num > 100){
                    System.out.println("Ese numero no esta dentro del rango de accion");
                } else if  (num < numAleatorio) {
                    System.out.println("Mayor");
                } else if (num > numAleatorio) {
                    System.out.println("Menor");
                }
                num = sc.nextInt();
            }
            System.out.println("Has acertado, el numero era: " + numAleatorio);
        }

    }
}
