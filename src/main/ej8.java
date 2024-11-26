/*
Crea un programa que pida 10 números
enteros por teclado, los almacene
en un array y luego muestre por separado
la suma de todos los valores positivos y negativos.
 */

public class ej8 {
    public static int positivos(int[] numeros){
        int positivos = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                positivos += numeros[i];
            }

        }
        return positivos;
    }

    public static int negativos(int[] numeros){
        int negativos = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0) {
                negativos += numeros[i];
            }
        }
        return negativos;
    }


    public static void main(String[] args) {
        int[] numeros = {10, -10, -10, 10};

        System.out.println("Positivos: " + positivos(numeros) + " Negativos: " + negativos(numeros));

    }
}