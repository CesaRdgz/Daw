package practica02;

import java.util.Scanner;

public class practica2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Pido el primer numero
        System.out.println("Introduce el primer numero");
        int num1 = sc.nextInt();
            //condicion
            if (num1 >= 0) {
            //si sale bien
            System.out.println("Introduce el Segundo numero");
            } else {
            //si sale mal
            System.out.println("No es un numero positivo");
            System.exit(0);
            }

        //pido el segundo numero
        int num2 = sc.nextInt();
            //condicion
            if (num2 >= 0) {
                //si sale bien
                System.out.println("Introduce la operacion (+, -, /, *)");
            } else {
                // si sale mal
                System.out.println("No es un numero positivo");
                System.exit(0);
            }

            // operacion
            char operacion = sc.next().charAt(0);
            switch (operacion) {
                case '+'://suma
                    System.out.println("La suma de " + num1 + " y de " + num2 + " es igual a " + (num1 + num2));
                    break;
                case '-'://resta
                    System.out.println("La resta de " + num1 + " y de " + num2 + " es igual a " + (num1 - num2));
                    break;
                case '/'://division
                    System.out.println("La division de " + num1 + " y de " + num2 + " es igual a " + (num1 / num2));
                    break;
                case '*'://multiplicacion
                    System.out.println("La multiplicacion de " + num1 + " y de " + num2 + " es igual a " + (num1 * num2));
                    break;
                default:
                    System.out.println("Operacion incorrecta");
                    System.exit(0);
            }
        }
    }


