package academy.devGabriel.maratonajava.javaCore.associacao.dominio;

public class Time {
    private String nome;
    private Jogador[] jogadores;

    public Time(String nome){
        this.nome = nome;
    }

    public Time(String nome, Jogador[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public void imprime() {
        System.out.println(this.nome);
        if(jogadores == null) return;
        System.out.println("Jogadores: ");
        for (Jogador jog: jogadores){
            System.out.println(jog.getNome());
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }


    public String getNome() {
        return nome;
    }
}
