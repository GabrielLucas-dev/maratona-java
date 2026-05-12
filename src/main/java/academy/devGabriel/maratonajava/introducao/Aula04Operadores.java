package academy.devGabriel.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        int num1 = 20;
        double num2 = 10;

        double soma = num2 / num1;
        System.out.println(soma);

        int resto = num1 % 3;
        System.out.println(resto);

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezDiferenteDeVinte = 10 != 20;
        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezIgualQueVinte);
        System.out.println(isDezDiferenteDeVinte);

        boolean testeEquals = "10".equals("11");    // false
        System.out.println("Equals? " + testeEquals);

        // Operadores Lógicos
        // &&, ||, !

        int idade = 25;
        float salario = 10000.0F;
        boolean isDentroDaLei = idade > 30 && salario > 4612;
        System.out.println(isDentroDaLei);

        double valorContaCorrente = 200;
        double valorContaPoupaca = 10000;
        double valorPlaystation5 = 5000;

        boolean isPlaystation5Compravel = valorContaCorrente > valorPlaystation5 || valorContaPoupaca > valorPlaystation5;
        System.out.println("Da pra comprar o PS5? " + isPlaystation5Compravel);

        //Atribuição
        // =, +=, -=, *=, /=, %=

        double bonus = 1000;
        bonus += 250;
        bonus -= 250;
        bonus *= 1.5;
        bonus /= 1.25;
        System.out.println("Bônus: " + bonus);

        int contador = 0;
        contador++;
        contador++;
        System.out.println("Contador: " + contador);
    }
}
