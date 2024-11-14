public class arrayDemo {
    public static void main(String[] args) {

        //variables
        int[] anArray;
        //int
        anArray = new int[10];

        //inicia 1er elemento
        anArray[0] = 100;

        //inicia 2ndo elemento
        anArray[1] = 200;
        //y sigue
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        for (int i = anArray.length -1; i >= 0; i--) {
            System.out.println(anArray[i]);
        }
    }
}
