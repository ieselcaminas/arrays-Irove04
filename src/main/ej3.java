package arrays.practicar;

public class ej3 {
    public static char dniLetra(int dni){
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        int resta = dni % 23;
        char letra = letras[resta];
        return letra;
    }

    public static void main(String[] args) {
        int dni = 20958383;

        char letra = dniLetra(dni);

        System.out.println(dni + " " +letra);

    }

}
