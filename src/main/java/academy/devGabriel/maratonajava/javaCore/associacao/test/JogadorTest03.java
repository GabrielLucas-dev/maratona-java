package academy.devGabriel.maratonajava.javaCore.associacao.test;

import academy.devGabriel.maratonajava.javaCore.associacao.dominio.Jogador;
import academy.devGabriel.maratonajava.javaCore.associacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Cafú");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador, jogador2};

        jogador.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");
        jogador.imprime();
        System.out.println("--- Time ---");
        time.imprime();
    }
}
