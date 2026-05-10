package academy.devGabriel.maratonajava.javaCore.blocosDeInicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    {
        // o bloco de inicialização é inicializado sempre que o codigo é rodado
        // é executado antes do construtor
        // executado toda vez que voce cria um objeto
        // é executado independente se o construtor chamar ou não

        episodios = new int[20];
        for(int i = 0; i < episodios.length; i++){
            episodios[i] = i + 1;
        }
    }

    public Anime() {
    }

    public Anime(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
    public int[] getEpisodios(){
        return episodios;
    }
}
