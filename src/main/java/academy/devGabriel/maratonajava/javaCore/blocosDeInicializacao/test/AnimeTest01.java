package academy.devGabriel.maratonajava.javaCore.blocosDeInicializacao.test;

import academy.devGabriel.maratonajava.javaCore.blocosDeInicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        for(int episodio: anime.getEpisodios()){
            System.out.print(episodio + " ");
        }
    }
}
