package academy.devGabriel.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros = {1, 3, 5, 7, 9};

        /* for(int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        } */

        // for each - percorre o array sem ver os indices
        for(int num : numeros) {
            System.out.println(num);
        }
    }
}
