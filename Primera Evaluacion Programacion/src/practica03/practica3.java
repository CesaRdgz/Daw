package practica03;

import java.util.Scanner;

public class practica3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige una opcion:");
        System.out.println("1. If");
        System.out.println("2. Switch");
        int menu1 = sc.nextInt();
        if (menu1 == 1) {
            System.out.println("Elige un ejercicio: ");
            System.out.println("1. Par o Impar");
            System.out.println("2. Sueldo Anual");
            System.out.println("5. Triangulos");
            System.out.println("6. Marmotas");
            System.out.println("7. Notas");
            int menuIf = sc.nextInt();
            switch (menuIf) {
                case 1:
                    System.out.println("Dime un numero");
                    int num1 = sc.nextInt();
                    if (num1 % 2 == 0){
                        System.out.println("Es par");
                    }else{
                        System.out.println("Es impar");
                    }
                    System.exit(0);
                    break;
                case 2:
                    System.out.println("Dime tu sueldo");
                    int sueldo = sc.nextInt();
                    if (sueldo <= 9000){
                        System.out.println("No debe pagar impuestos");
                    }else{
                        System.out.println("Debe pagar impuestos");
                    }
                    System.exit(0);
                    break;
                case 5:
                    System.out.println("Introduce el primer lado del triangulo");
                    int a = sc.nextInt();
                    System.out.println("Introduce el segundo lado del triangulo");
                    int b = sc.nextInt();
                    System.out.println("Introduce el tercer lado del triangulo");
                    int c = sc.nextInt();
                    if (a + b > c){
                        System.out.println("Triangulo");
                    } else if (a + c > b){
                        System.out.println("Triangulo");
                    } else if (b + c > a){
                        System.out.println("Triangulo");
                    } else {
                        System.out.println("No triangulo");
                        System.exit(0);
                    }
                    System.exit(0);
                    break;
                case 6:
                    System.out.println("Introduce en numero de tazas de mantequilla de cacahuete");
                    int numeroMantequilla = sc.nextInt();
                    System.out.println("¿Es fin de semana? True/False");
                    boolean diaSemana = sc.nextBoolean();
                    if (numeroMantequilla >= 10 && numeroMantequilla <= 20 && diaSemana == false){
                        System.out.println("¡Sera un exito!");
                    } else if (numeroMantequilla >= 15 && numeroMantequilla <= 25 && diaSemana == true) {
                        System.out.println("¡Sera un exito!");
                    } else {
                        System.out.println("Sera un fracaso");
                    }
                    System.exit(0);
                    break;
                case 7:
                    System.out.println("¿Cual ha sido tu nota?");
                    int nota = sc.nextInt();
                    if (nota >= 0 && nota <= 3) {
                        System.out.println("MD");
                    }else if (nota >= 4 && nota < 5){
                        System.out.println("SUF");
                    }else if (nota >= 5 && nota <= 6){
                        System.out.println("BI");
                    }else if (nota >= 7 && nota < 8){
                        System.out.println("NOT");
                    }else if (nota >= 9 && nota <= 10){
                        System.out.println("SOB");
                    }
                    System.exit(0);
                    break;
                default:
                    System.out.println("No corresponde a ningun ejercicio");
                break;
            }
        }else if (menu1 == 2) {
            System.out.println("Elige un ejercicio: ");
            System.out.println("2. Lenguaje de programacion");
            System.out.println("3. Numero");
            System.out.println("4. Casa de Harry Potter");
            System.out.println("5. Direccion");
            int menuSwitch = sc.nextInt();
            switch (menuSwitch) {
                case 2:
                    System.out.println("¿Que leguaje de programacion has estudiado?");
                    System.out.println("1.Java");
                    System.out.println("2.Kotlin");
                    System.out.println("3.Scala");
                    System.out.println("4.Python");
                    System.out.println("Introduce el numero que corresponda al lenguaje que has estudiado");
                    int num = sc.nextInt();
                    switch (num) {
                        case 1:
                            System.out.println("Bien");
                            break;
                        case 2:
                            System.out.println("Mal");
                            break;
                        case 3:
                            System.out.println("Mal");
                            break;
                        case 4:
                            System.out.println("Mal");
                            break;
                        default:
                            System.out.println("Numero desconocido");
                            break;
                    }
                    System.exit(0);
                    break;
                case 3:
                    System.out.println("Introduce un numero del 1 al 9 por escrito: ");
                    String nombreNumero = sc.next();
                    switch (nombreNumero) {
                        case "uno":
                            System.out.println('1');
                            break;
                        case "dos":
                            System.out.println('2');
                            break;
                        case "tres":
                            System.out.println('3');
                            break;
                        case "cuatro":
                            System.out.println('4');
                            break;
                        case "cinco":
                            System.out.println('5');
                            break;
                        case "seis":
                            System.out.println('6');
                            break;
                        case "siete":
                            System.out.println('7');
                            break;
                        case "ocho":
                            System.out.println('8');
                            break;
                        case "nueve":
                            System.out.println('9');
                            break;
                        default:
                            System.out.println("No corresponde a ningun numero");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("¿En que casa te puso el sombrero seleccionador");
                    System.out.println("1. Griffindor");
                    System.out.println("2. Hufflepuff");
                    System.out.println("3. Ravenclaw");
                    System.out.println("4. Slytherin");
                    System.out.println("Selecciona el numero de tu casa");
                    int casa = sc.nextInt();
                    switch (casa){
                        case 1:
                            System.out.println("Valor");
                            break;
                        case 2:
                            System.out.println("Lealtad");
                            break;
                        case 3:
                            System.out.println("Intelecto");
                            break;
                        case 4:
                            System.out.println("Astucia");
                            break;
                        default:
                            System.out.println("Ese numero no corresponde a ninguna casa");
                            break;
                    }
                    System.exit(0);
                    break;
                case 5:
                    System.out.println("¿Que movimiento quieres hacer?");
                    System.out.println("1. Arriba");
                    System.out.println("2. Abajo");
                    System.out.println("3. Izquierda");
                    System.out.println("4. Derecha");
                    int movimiento = sc.nextInt();
                    switch (movimiento){
                        case 1:
                            System.out.println("Subir");
                            System.exit(0);
                            break;
                        case 2:
                            System.out.println("Bajar");
                            System.exit(0);
                            break;
                        case 3:
                            System.out.println("Mover a la Izquierda");
                            System.exit(0);
                            break;
                        case 4:
                            System.out.println("Mover a la Derecha");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Error");
                            System.exit(0);
                            break;

                    }
                default:
                    System.out.println("No corresponde a ningun ejercicio");
                    break;
            }
        }else{
            System.out.println("No corresponde el numero con ningun ejercicio");
            System.exit(0);
        }
    }
}