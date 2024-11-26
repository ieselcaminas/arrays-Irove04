/*
Realiza un programa que
pida diez números e imprima el mayor
 */


public class ej5 {
    public static int maximo(int[] anArray) {
        //variable
        int numMax = 0;

        //condicional
        for (int i = 0; i < anArray.length; i++) {
            if (anArray[i] > numMax) {
                numMax = anArray[i];
            }
        }
        return numMax;
    }

    public static void main(String[] args) {
        int[] anArray = {1, 52, 388, 4, 5, 26, 17, 8, 9, 19};
        System.out.println(maximo(anArray));
        }
    }

