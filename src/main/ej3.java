/*
Realiza un programa que lea un DNI sin letra y calcula la misma (usad un array para almacenar las letras)
En este enlace se explica cómo se calcula la letra del DNI.
 */

import java.util.Scanner;

public class ej3 {
    public static char letraDNI(int dni){
        final char [] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B',
                'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    //obtener a cual corresponde
    int resto = dni % 23;
    char letra = letras[resto];
    return letra;
}
public static void main(String[] args){
    int dni;
    char letra;
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un dni: ");
    dni = sc.nextInt();

    letra = letraDNI(dni);

    System.out.println(letra);
    }
}
