package sesion07;

public class S7E04 {
    public static void main(String[] args) {
        int num = 1;
        int contador = 0;
        while (contador < 20) {
            if (num % 5 == 0) {
                System.out.print(num + " ");

                contador++ ;
            }
            num++;
        }
    }
}