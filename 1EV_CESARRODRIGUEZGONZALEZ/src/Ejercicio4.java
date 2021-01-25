import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean otravez = true;
        do {
        System.out.println("¿Que operacion desea realizar?");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("Elige el numero asignado a la operacion que desees realizar");
        int operacion = sc.nextInt();
        while (operacion < 1 || operacion > 4){
            System.out.println("¿Que operacion desea realizar?");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("Elige el numero asignado a la operacion que desees realizar");
            operacion = sc.nextInt();
        }
    switch (operacion) {
        case 1:
            System.out.println("Introduce los numeros a sumar");
            int numero1suma = sc.nextInt();
            int numero2suma = sc.nextInt();
            System.out.println(numero1suma + numero2suma);
            break;
        case 2:
            System.out.println("Introduce los numeros a restar");
            int numero1resta = sc.nextInt();
            int numero2resta = sc.nextInt();
            System.out.println(numero1resta - numero2resta);
            break;
        case 3:
            System.out.println("Introduce los numeros a multiplicar");
            int numero1multiplicacion = sc.nextInt();
            int numero2multiplicacion = sc.nextInt();
            System.out.println(numero1multiplicacion * numero2multiplicacion);
            break;
        case 4:
            System.out.println("Introduce los numeros a dividir");
            int numero1division = sc.nextInt();
            int numero2division = sc.nextInt();
            System.out.println(numero1division / numero2division);
            break;
    }
    System.out.println("¿Desea realizar otra operacion?");
    otravez = sc.nextBoolean();
    }while (otravez == true);
        }
    }

