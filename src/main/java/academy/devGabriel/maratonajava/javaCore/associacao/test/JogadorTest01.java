package academy.devGabriel.maratonajava.javaCore.associacao.test;

import academy.devGabriel.maratonajava.javaCore.associacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Pelé", 3);
        Jogador jogador2 = new Jogador("Romário", 1);
        Jogador jogador3 = new Jogador("Cafú", 2);
        Jogador[] jogadores = new Jogador[]{jogador, jogador2, jogador3};

        for(Jogador jog: jogadores) {
            jog.imprime();
        }
    }
}
