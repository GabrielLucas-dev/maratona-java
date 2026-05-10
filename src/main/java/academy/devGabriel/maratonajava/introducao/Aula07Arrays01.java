package academy.devGabriel.maratonajava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        String[] nomes = new String[3];  //arrays são conciderados objetos em memória

        nomes[0] = "Fillipo";
        nomes[1] = "Fernando";
        nomes[2] = "Sales";

        for (int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
    }
}
