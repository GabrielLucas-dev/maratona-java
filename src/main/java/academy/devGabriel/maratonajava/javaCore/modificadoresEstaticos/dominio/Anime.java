package academy.devGabriel.maratonajava.javaCore.modificadoresEstaticos.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    // static no começo faz com que o bloco de inicialização só seja inicializado 1 vez (mesmo que haja mais de 1 instancia), sem o metodo estatico ele é executado 1 vez por metodo 
    static {
        // o bloco de inicialização é inicializado sempre que o codigo é rodado, ou seja ainda não há nada em memoria, por isso não é possivel acessar atributos nele
        //(continuação), por isso não é possivel acessar variaveis de instancia, por que a memoria ainda não foi inicializada
        // é executado antes do construtor
        // executado toda vez que voce cria um objeto
        // é executado independente se o construtor chamar ou não

        episodios = new int[20];
        for(int i = 0; i < episodios.length; i++){
            episodios[i] = i + 1;
        }
    }

    public Anime() {
        for (int ep: Anime.episodios) {
            System.out.print(ep + " ");
        }
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
