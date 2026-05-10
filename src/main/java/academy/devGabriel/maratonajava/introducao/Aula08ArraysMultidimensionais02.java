package academy.devGabriel.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int [][] arrayInt = new int[3][];

        int[] teste = new int[]{2, 4};

        arrayInt[0] = teste;
        arrayInt[1] = new int[]{1, 2, 3};
        arrayInt[2] = new int[]{1, 0, 4, 0, 33, 9};

        //outra forma de inicilaizar
        int arrayInt2[][] = {{1,2}, {1,2,3}, {1,2,3,4,5,6}};

        for (int[] arrayBase : arrayInt){
            System.out.println("\n-----");
            for(int num : arrayBase) {
                System.out.print(num + " ");
            }
        }
    }
}
