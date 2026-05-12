package academy.devGabriel.maratonajava.javaCore.sobrecargaMetodos.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    public void imprime() {
        System.out.println(nome + "\n" + tipo + "\n" + episodios + "\n" + genero);
    }

    // Construtor vazio
    public Anime(){
    }

    public Anime(String nome, String tipo, int episodios, String genero) {

    }

    public void init(String nome, String tipo ,int episodios) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }
    public void init(String nome, String tipo ,int episodios, String genero) {
        this.init(nome, tipo, episodios);
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getEpisodios() {
        return episodios;
    }
    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }
}
