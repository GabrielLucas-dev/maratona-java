package academy.devGabriel.maratonajava.javaCore.associacao.test;

import academy.devGabriel.maratonajava.javaCore.associacao.dominio.Jogador;
import academy.devGabriel.maratonajava.javaCore.associacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Matheus Pereira");
        Time time = new Time("Cruzeiro");

        jogador.setTime(time);
        jogador.imprime2();
    }
}
