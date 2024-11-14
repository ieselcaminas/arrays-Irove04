/*
Realiza un programa que
pida diez números e imprima el mayor
 */


public class ej5 {
    public static int maximo() {
        //variable
        int numMax = 0;
        int[] anArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //condicional
        for (int i = 0; i < anArray.length; i++) {
            if (anArray[i] > numMax) {
                numMax = anArray[i];
            }
        }
        return numMax;
    }

    public static void main(String[] args) {
        System.out.println(maximo());
        }
    }

