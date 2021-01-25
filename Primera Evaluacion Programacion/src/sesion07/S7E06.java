package sesion07;

public class S7E06 {
    public static void main(String[] args) {
        int num = 1;
        int suma = 0;

        while (suma < 125) {
            suma = num + suma;
            num++;
        }
        System.out.println(num);
    }
}