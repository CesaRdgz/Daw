import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num >= 100 && num <= 999){
            int centenas = num / 100;
            int decenas = (num % 100) / 10;
            int unidades = (num % 100) % 10;

            System.out.print(unidades);
            System.out.print(decenas);
            System.out.print(centenas);
        }else{
            System.out.println("No vale");
        }
    }
}
