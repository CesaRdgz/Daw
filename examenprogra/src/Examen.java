import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;
import java.util.Scanner;


public class Examen {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nombre = {"Ariana Grande", "Taylor Swift", "Justin Bieber", "Nicki Minaj",
                "Jennifer López", "Miley Cyrus", "Katy Perry", "Justin Timberlake", "Marilyn Manson",
                "Ed Sheeran", "Olivia Rodrigo", "Dave Grohl", "Robe Iniesta" };
        int[] añoInicio = {2011, 2004, 2007, 2003, 1986, 2001, 2001, 1993, 1989, 2005, 2015, 1981, 1988};
        double[] estatura = {1.53, 1.78, 1.75, 1.57, 1.64, 1.65, 1.7, 1.85, 1.85, 1.73, 1.65, 1.83, 1.82};
        char[] sexo = {'M', 'M', 'V', 'M', 'M', 'M', 'M', 'V', 'V', 'V', 'M', 'V', 'V'};


        System.out.println("Introduce del 0 al 12 el numero que corresponde al cantante del que quieras saber sus años en activo");
        int numeroIntroducido = sc.nextInt();

        //ej1//
        int añoCantante = 0;
        String nombreCantante = null;
        for (int i = 0; i < añoInicio.length; i++) {
            if (numeroIntroducido == i) {
                añoCantante = añoInicio[i];
            } else {
                continue;
            }
        }

        for (int i = 0; i < nombre.length; i++) {
            if (numeroIntroducido == i) {
                nombreCantante = nombre[i];
            }
        }
        System.out.println(nombreCantante + " lleva " + calcularAñosActivo(añoCantante) + " en activo");

        //ej2//
        System.out.println("Ahora te mostrare si es hombre o mujer");
        char varonOMujer = ' ';
        for (int i = 0; i <= sexo.length; i++) {
            if (numeroIntroducido == i) {
                varonOMujer = sexo[i];
            }
        }

        System.out.println(nombreCantante + " es " + devolverGenero(varonOMujer));

        //ej3//
        System.out.println("A continuacion dame un numero del 0 al 12 y te dare todos los datos del cantante a cuyo numero te has referido");
        int numero = sc.nextInt();
        imprimirArtista(nombre[numero], añoInicio[numero], estatura[numero], sexo[numero]);

        //ej4//
        System.out.println("Por ultimo te mostrare la media de la altura, el cantante mas bajo y el cantante mas alto");
        calcularEstatura(nombre, estatura, sexo);

    }

    public static int calcularAñosActivo(int a) {
        int añosEnActivo = 2021 - a;
        return añosEnActivo;
    }

    public static String devolverGenero(char b) {

        if (b == 'V') {
            return " hombre";
        } else {
            return " mujer";
        }
    }

    public static void imprimirArtista(String c, int d, double e, char f) {
        System.out.println(c + '(' + f + ", " + e + ')' + " lleva en activo desde " + d);
    }

    public static void calcularEstatura(String[] g, double[] h, char[] i) {
        double acumulador = 0;
        double acumuladorMasBajo = 0;
        int acumuladorj = 0;
        double acumuladorMasAlto = 0;

        for (int j = 0; j < h.length; j++) {
            acumulador = acumulador + h[j];
        }
        double media = acumulador / 13;
        System.out.println("La altura media es de " + media);

        acumuladorMasBajo = h[0];
        for (int j = 0; j < h.length ; j++) {
            if (acumuladorMasBajo > h[j]) {
                acumuladorMasBajo = h[j];
                acumuladorj = j;
            } else {
                continue;
            }
        }

        acumuladorMasAlto = h[0];
        System.out.println("El más bajo es " + g[acumuladorj] + " y mide " + h[acumuladorj]);
        for (int j = 0; j < g.length; j++) {
            if (acumuladorMasAlto < h[j]) {
                acumuladorMasAlto = h[j];
                acumuladorj = j;
            }
        }
        System.out.println("Y el más alto es " + g[acumuladorj] + " y mide " + h[acumuladorj]);
    }
}

