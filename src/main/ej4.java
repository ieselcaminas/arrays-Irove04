package arrays.practicar;

public class ej4 {
    public static double media(int[] numeros){
        double media;
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        media = ((double)suma / (double) numeros.length);
        return media;
    }

    public static void main(String[] args) {
        int[] numeros = {4, 6};

        double media = media(numeros);

        System.out.println(media);
    }

}
