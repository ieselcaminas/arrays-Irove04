/*
Realiza un programa que imprima
el menor de un array de 10 números
 */


public class ej6 {
    public static int minimo() {
        //variable
        int[] anArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int numMin = anArray[0];

        //condicional
        for (int i = 0; i < anArray.length; i++) {
            if (anArray[i] < numMin) {
                numMin = anArray[i];
            }
        }
        return numMin;
    }

    public static void main(String[] args) {
        System.out.println(minimo());
    }
}

