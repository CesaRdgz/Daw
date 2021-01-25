package sesion06;

import java.util.Scanner;

public class S6E05 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Dime un numero");
        int num = sc.nextInt();
        for(int j = 1; j <= num; j++){
            for(int i = 1; i <= j;i++){
                System.out.println(i * j + "\t");
            }
        }
    }
}
