package academy.devGabriel.maratonajava.javaCore.sobrecargaMetodos.test;

import academy.devGabriel.maratonajava.javaCore.sobrecargaMetodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("The Promise Neverland", "TV", 11, "Ação");

        anime.imprime();

    }
}
