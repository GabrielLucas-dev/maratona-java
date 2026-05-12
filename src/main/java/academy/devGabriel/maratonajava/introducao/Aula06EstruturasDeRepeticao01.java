package academy.devGabriel.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        int count = 11;

        while(count <= 10){
            System.out.println(count);
            count++;
        }

        int count2 = 0;
        do{
            System.out.println("Executa pelo menos uma vez, mesmo sendo falso");
        } while(count2 > 10);

        int count3 = 10;
        for(int i = 0; i < count3; i++) {
            System.out.println(i);
        }
    }
}
