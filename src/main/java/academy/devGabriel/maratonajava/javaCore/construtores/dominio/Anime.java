package academy.devGabriel.maratonajava.javaCore.construtores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;

    public void imprime() {
        System.out.println(nome + "\n" + tipo + "\n" + episodios + "\n" + genero + "\n" + estudio);
    }

    // Construtores - não tem tipo (nem void, nem String, nem nada)
    // Construtor vazio - para casos de poder ter um objeto vazio
    public Anime(){
    }

    public Anime(String nome, String tipo, int episodios, String genero) {
        this();     //essa sintaxe só pode ser utilizada dentro de um construtor e tem que ser obrigatoriamente a primeira linha (executavel) do construtor
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    public Anime(String nome, String tipo, int episodios, String genero, String estudio) {
        this(nome, tipo, episodios, genero);
        this.estudio = estudio;
    }


    // Sobrecarga de métodos
    /*public void init(String nome, String tipo ,int episodios) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }
    public void init(String nome, String tipo ,int episodios, String genero) {
        this.init(nome, tipo, episodios);
        this.genero = genero;
    }*/

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
