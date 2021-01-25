package sesion06;

import java.util.Scanner;

public class S6E03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int acumulador = 0;
        System.out.println("introduce un numero");
        int num1 = sc.nextInt();
        System.out.println("introduce un segundo numero");
        int num2 = sc.nextInt();
        for (int i = num1; i <= num2; i++) {
            acumulador = acumulador + i;
            System.out.println(acumulador);
        }
    }
}
