package sesion07;

public class S7E05 {
    public static void main(String[] args) {
        int num = 1;
        int contador = 0;
        while(contador < 50){
            if (num % 5 == 0){
                System.out.print(num + "\t");
                contador++;
                if(contador % 10 == 0){
                    System.out.println(" ");
                }
            }
            num++;
        }

    }
}
