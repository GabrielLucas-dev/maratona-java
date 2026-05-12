package academy.devGabriel.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        int idade = 20;
        double salarioD = 2500.0;
        float salarioF = 3500.0F;
        byte num = 127;
        long numGrande = 48239472;
        boolean estaTrabalhando = true;
        char sexo = 'F';
        String nome = "Dev Gabriel";

        System.out.println("Idade: " + idade);
        //System.out.println("Esta trabalhando: " + estaTrabalhando);
        System.out.println("Vai estar trabalhando até junho? " + estaTrabalhando);
        System.out.println("Opa, me chamo " + nome);

        //CASTING é quando voce força o Java a colocar um valor de uma variavel dentro de outra
        int castingNum = (int)10000000000L;     // Casting
    }
}
