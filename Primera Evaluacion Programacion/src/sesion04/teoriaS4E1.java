package sesion04;

import java.util.Scanner;

public class teoriaS4E1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Edad:");
        int edad = sc.nextInt();
        if (edad >= 18) {
            System.out.println("Mayor de edad");
        }
        System.out.println("Ya esta");
    }
}
