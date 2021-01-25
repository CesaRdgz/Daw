package Metodos;
import java.util.Scanner;

public class Ej19Metodos {
    public static void print(String strArg){
        System.out.println("print(\"" + strArg + "\")");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el argumento string: ");
        String str = sc.nextLine();
        print(str);
    }


}
