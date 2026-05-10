package academy.devGabriel.maratonajava.javaCore.associacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        System.out.println("Desafio brabão");
        System.out.println("digite sua pergunta hahaha");

        Scanner input = new Scanner(System.in);
        String pergunta = input.nextLine();
        if(pergunta.charAt(0) == ' '){
            System.out.println("SIM");
        } else{
            System.out.println("NÃO");
        }
    }
}
