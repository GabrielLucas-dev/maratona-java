package academy.devGabriel.maratonajava.javaCore.sobrescrita.dominio;

public class Anime {
    private String nome;

    @Override
    public String toString() {
        return "Anime: " + nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
