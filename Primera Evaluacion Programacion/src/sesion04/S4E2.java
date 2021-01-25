package sesion04;

import java.util.Scanner;

public class S4E2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu sueldo: ");
        int sueldo = sc.nextInt();
        if (sueldo >= 9000) {
            System.out.println("Debes pagar impuestos");
        } else {
            System.out.println("No debes pagar impuestos");
        }
    }
}
