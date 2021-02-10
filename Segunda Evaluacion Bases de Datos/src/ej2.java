public class ej2 {
    /* La clase Arrays incluye muchos métodos útiles para procesar arrays. Uno de ellos es el
método binarySearch, que permite encontrar rápidamente el índice de un elemento en un
array que ya está ordenado. Para utilizarlo solamente hay que pasarle los parámetros
adecuados en el orden correcto.
Crea un programa que invoque el método de la clase Arrays sin utilizar la instrucción import*/
    public static void main(String[] args) {
        // Tenemos este array ordenado:
        int[] array = {1, 12, 123, 1234, 12345, 123456, 1234567, 12345678, 123456789, 1234567890};
        // Pide un número por teclado; no utilices la instrucción import para crear el objeto Scanner
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Introduce el numero a buscar");
        int buscar = sc.nextInt();
        System.out.println(buscar);
        binarySearch(array, buscar);
        // Imprime el resultado tal cual
        // de el método binarySearch para buscar el número en el array
    }
        public static int binarySearch (int[] a, int key){
            System.out.println(java.util.Arrays.binarySearch(int[] a, int key));
        }


        // Ahora, a continuación, si está en el array, debe escribir: el número X se encuentra en el array; si no, debe indicar lo contrario
    }


