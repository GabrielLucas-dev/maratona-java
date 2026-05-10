package academy.devGabriel.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        int limite = 100;
        for(int i = 0; i <= limite; i++) {
            if(i % 2 == 0){
                System.out.println(i);  //exibe até 50
                if(i >= 50){
                 break;
                }
                System.out.println("i: " + i);  //exibe até 48
            }
        }
    }
}
