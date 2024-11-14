/*
Escribe una función que recoja una lista de cinco cadenas,
una por línea, y las imprima en un marco rectangular.
Por ejemplo, la lista [“Hola”, “esto”, “es”, “un”, “marco”]
 */

import java.util.Scanner;

public class ej7 {
    public static int calculaMax(String[] cadenas){
        int max = cadenas[0].length();
        for (int i = 0; i < cadenas.length; i++) {
            if (cadenas[i].length() > max) {
                max = cadenas[i].length();
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] cadena = new String[5];
        int max;


        System.out.println("Ingresa 5 cadenas de texto: ");


        for (int i = 0; i < cadena.length; i++) {
            cadena[i] = sc.nextLine();
        }

        max = calculaMax(cadena);
        System.out.println(asteriscos(max));

        //imprimir cada linea
        for (int i = 0; i < cadena.length; i++) {
            System.out.println(" *" + cadena[i] + "*");
        }
    }




        public static String asteriscos(int max){
            String asteriscos = "";
        for (int i = 0; i < max + 4; i++) {
                System.out.println("*");
                asteriscos += "*";
            }
            return asteriscos;

        }
    }


