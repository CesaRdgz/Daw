package sesion03;

import java.util.Scanner;

public class S3E01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num = sc.nextInt();
        boolean masCeroMenosDiez = num < 10 && num > 0;
        System.out.println(masCeroMenosDiez);
    }
}
